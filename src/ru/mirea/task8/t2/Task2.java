package ru.mirea.task8.t2;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Task2 extends JPanel{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    public static void Launch(){

        JFrame frame = new JFrame("Picture");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(WIDTH,HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.add(new JLabel(new ImageIcon(s)));
        frame.show();
    }

    public static void main(String[] args){

        Launch();

    }
}