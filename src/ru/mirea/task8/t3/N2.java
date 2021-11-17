package ru.mirea.task8.t3;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class N2 {
    Thread th;
    ImageIcon images;
    JFrame frame;
    JLabel lbl;
    int i = 0;

    public static void main(String[] args) {
        N2 sa = new N2();
    }

    public N2() {
        frame = new JFrame("Animation Frame");
        th = new Thread();
        lbl = new JLabel();
        Panel panel = new Panel();
        panel.add(lbl);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(800, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true){
            swingAnimator();
        }
    }

    public void swingAnimator() {
        try {
            for (i = 1; i <= 21; i++) {
                images = new ImageIcon("src/ru/mirea/task8/t3/Chin_Chan/Tom (" + i + ").jpg");
                lbl.setIcon(images);
                th.sleep(80);
            }
        } catch (InterruptedException e) {}
    }
}