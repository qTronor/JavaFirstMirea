package ru.mirea.task8.t1;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestT1 {
    private static final int width = 500;
    private static final int height = 500;
    public static void main(String[]args)
    {
        JFrame frame = new JFrame();
        frame.add(new Panel(width, height));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
