package ru.mirea.task11.t2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class T2 {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 250;

    private static final JPanel center = new JPanel();
    private static final JPanel north = new JPanel();
    private static final JPanel south = new JPanel();
    private static final JPanel west = new JPanel();
    private static final JPanel east = new JPanel();

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        JPanel panel = new JPanel(new BorderLayout());

        setMouseListener(center, "CENTER");
        setMouseListener(north, "NORTH");
        setMouseListener(south, "SOUTH");
        setMouseListener(west, "WEST");
        setMouseListener(east, "EAST");

        center.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        north.setPreferredSize(new Dimension(WIDTH, HEIGHT / 2));
        south.setPreferredSize(new Dimension(WIDTH, HEIGHT / 2));
        west.setPreferredSize(new Dimension(WIDTH / 2, HEIGHT));
        east.setPreferredSize(new Dimension(WIDTH / 2, HEIGHT));

        center.setBackground(new Color(236,208,238));
        south.setBackground(new Color(237,250,255));
        west.setBackground(new Color(132,135,236));
        east.setBackground(new Color(117,42,182));
        north.setBackground(new Color(187,158,213));

        panel.add(center, BorderLayout.CENTER);
        panel.add(north, BorderLayout.NORTH);
        panel.add(south, BorderLayout.SOUTH);
        panel.add(west, BorderLayout.WEST);
        panel.add(east, BorderLayout.EAST);


        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private static void setMouseListener(JPanel panel, String text) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent mouseEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в " + text);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
