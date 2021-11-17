package ru.mirea.task14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Drunker5 {

    private static final int NUMBER_OF_COLUMNS_FIELD = 20;
    private static final int NUMBER_OF_CARDS = 10;

    private static final JTextField firstPlayerField = new JTextField(NUMBER_OF_COLUMNS_FIELD);
    private static final JTextField secondPlayerField = new JTextField(NUMBER_OF_COLUMNS_FIELD);
    private static final JLabel gameResultLabel = new JLabel("");


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JButton resetButton = new JButton("Input");
        JLabel firstPlayerLabel = new JLabel("Start cards for the first player");
        JLabel secondPlayerLabel = new JLabel("Start cards for the second player");
        firstPlayerLabel.setLabelFor(firstPlayerField);
        secondPlayerLabel.setLabelFor(secondPlayerField);
        firstPlayerField.setMaximumSize(new Dimension(100, 30));
        secondPlayerField.setMaximumSize(new Dimension(100, 30));
        resetButton.setPreferredSize(new Dimension(150,150));
        resetButton.addActionListener(actionEvent -> {
            boolean isValid;
            try {
                boolean firstTrue = firstPlayerField.getText().split(" ").length == 5;
                boolean secondTrue = secondPlayerField.getText().split(" ").length == 5;
                // Also need to check if they can be converted in numbers but leave it for now
                isValid = firstTrue && secondTrue;
            } catch(Exception ex) {
                isValid = false;
            }
            if (isValid) {
                gameLogic();
            } else {
                JOptionPane.showMessageDialog(
                        frame,
                        "First string: " + firstPlayerField.getText() + "\nSecond string: " + secondPlayerField.getText(),
                        "Invalid input",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });
        resetButton.setVisible(true);
        gameResultLabel.setPreferredSize(new Dimension(200, 50));

        mainPanel.add(firstPlayerField, BorderLayout.LINE_START);
        mainPanel.add(secondPlayerField, BorderLayout.LINE_END);
        mainPanel.add(resetButton, BorderLayout.PAGE_START);
        mainPanel.add(gameResultLabel, BorderLayout.PAGE_END);
        frame.add(mainPanel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void gameLogic() {
        Stack<Integer> firstPlayerCards = new Stack<>();
        Stack<Integer> secondPlayerCards = new Stack<>();
        String[] playerOneDeck = firstPlayerField.getText().split(" ");
        String[] playerTwoDeck = secondPlayerField.getText().split(" ");
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            firstPlayerCards.add(0, Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = 0; i < NUMBER_OF_CARDS / 2; ++i) {
            secondPlayerCards.add(0, Integer.parseInt(playerTwoDeck[i]));
        }

        int turnCount = 0;
        while (!firstPlayerCards.empty() && !secondPlayerCards.empty()) {
            if (turnCount >= 106) {
                gameResultLabel.setText("botwa");
                break;
            }
            turnCount = doTurn(firstPlayerCards, secondPlayerCards, turnCount);
        }

        if (firstPlayerCards.empty()) {
            gameResultLabel.setText("second " + turnCount);
        } else if (secondPlayerCards.empty()) {
            gameResultLabel.setText("first " + turnCount);
        }
    }

    static int doTurn(Stack<Integer> firstPlayerCards, Stack<Integer> secondPlayerCards, int turnCount) {
        int firstPlayerCard = firstPlayerCards.pop();
        int secondPlayerCard = secondPlayerCards.pop();
        if (firstPlayerCard < secondPlayerCard || (firstPlayerCard == 9 && secondPlayerCard == 0)) {
            secondPlayerCards.add(0, firstPlayerCard);
            secondPlayerCards.add(0, secondPlayerCard);
        } else {
            firstPlayerCards.add(0, firstPlayerCard);
            firstPlayerCards.add(0, secondPlayerCard);
        }
        ++turnCount;
        return turnCount;
    }
}
