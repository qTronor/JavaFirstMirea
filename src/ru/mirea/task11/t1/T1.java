package ru.mirea.task11.t1;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class T1 {
    private static boolean gameOver = false;
    private static int count = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JLabel label1 = new JLabel("Enter Number from 0 to 20: ");
        label1.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2 = new JLabel("");
        label2.setPreferredSize(new Dimension(600, 25));

        JTextField jta = new JTextField( );
        jta.setPreferredSize(new Dimension(50, 25));
        Font fnt = new Font("Stick No Bills",Font.BOLD,20);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);

        Random rand = new Random();
        int randNum = rand.nextInt(20);

        JButton button1 = new JButton("Input");
        button1.addActionListener(actionEvent ->{
            if(!gameOver){
                int num = Integer.parseInt(jta.getText());
                if(num == randNum){
                    label2.setText("I are right!  Congrants!");
                    gameOver = true;
                }
                else if(num > randNum){
                    label2.setText("Try smaller");
                    count++;
                }
                else{
                    label2.setText("Try bigger");
                    count++;
                }
                if(count >= 5){
                    label2.setText("Game Over");
                    gameOver = true;
                }
            }
        });

        panel.add(button1);
        panel.add(jta);
        panel.add(label1);
        panel.add(label2);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
