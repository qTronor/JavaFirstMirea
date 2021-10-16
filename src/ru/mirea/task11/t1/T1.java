package ru.mirea.task11.t1;
import java.awt.*;
import javax.swing.*;

public class T1 {
    private static final int screenWidth = 800;
    private static final int screenHeight = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game");

        JLabel label1 = new JLabel("Enter Number: ");
        label1.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2 = new JLabel(" ");

        JTextField jta = new JTextField(2 );
        Font fnt = new Font("Times new roman",Font.BOLD,20);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);


        JButton button1 = new JButton("Input");
        button1.setSize(screenWidth/3, 50);
        button1.setLocation(0, screenHeight /2 - 50);

        frame.add(button1);
        frame.add(jta, BorderLayout.SOUTH);
        frame.add(label1, BorderLayout.CENTER);

        frame.setSize(screenWidth, screenHeight);
        frame.setVisible(true);

    }
    private static void gameManager(JButton button, JLabel label1, JLabel label2, Label text){

    }
}
