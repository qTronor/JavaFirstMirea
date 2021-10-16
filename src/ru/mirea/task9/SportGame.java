package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;

public class SportGame {
    private static int milanScore = 0;
    private static int madridScore = 0;
    private static boolean gameOver = false;
    private static int endScore = 5;

    private static final int screenWidth = 800;
    private static final int screenHeight = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");

        JLabel label1 = new JLabel("Result: 0 X 0");
        label1.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2 = new JLabel("Last Scorer: N/A");
        label2.setHorizontalAlignment(JLabel.CENTER);

        Label text = new Label(" ");
        text.setAlignment(Label.CENTER);

        JButton button1 = new JButton("Milan");
        button1.setSize(screenWidth/3, 50);
        button1.setLocation(0, screenHeight/2 - 50);
        button1.addActionListener(actionEvent -> ChangeScore(button1, label1, label2, text, true));

        JButton button2 = new JButton("Madrid");
        button2.setSize(screenWidth/3, 50);
        button2.setLocation(screenWidth - screenWidth/3, screenHeight /2 - 50);
        button2.addActionListener(actionEvent -> ChangeScore(button2, label1, label2, text, false));

        frame.add(button1);
        frame.add(button2);
        frame.add(label1, BorderLayout.NORTH);
        frame.add(label2, BorderLayout.SOUTH);
        frame.add(text, BorderLayout.CENTER);

        frame.setSize(screenWidth, screenHeight);
        frame.setVisible(true);
        button1.setBackground(new Color(248, 121, 74, 255));//216 191 216
        button2.setBackground(new Color(51, 102, 255));

    }
    private static void ChangeScore(JButton button, JLabel label1, JLabel label2, Label text, boolean q){
        if(!gameOver){
            if(q){
                milanScore++;
                if(milanScore >= endScore){
                    text.setText("Game over! The winner is " + button.getText());
                    gameOver = true;
                }
            }
            else{
                madridScore++;
                if(madridScore >= endScore){
                    text.setText("Game over! The winner is " + button.getText());
                    gameOver = true;
                }
            }
            label1.setText("Final score: " + milanScore + " X " + madridScore);
            label2.setText("Last Scorer: " + button.getText());
        }
    }
}
