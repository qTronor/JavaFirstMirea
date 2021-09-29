package ru.mirea.task8.t1;

import ru.mirea.task6.nameable.Test;

import javax.swing.*;
import java.awt.*;

public class TestT1 extends JFrame {
    JPanel[] pnl = new JPanel[20];

    public TestT1(){
        setLayout(new GridLayout(4,5));
       // super.paintComponents(g);
        for(int i = 0 ; i < pnl.length ; i++)
        {
          /*  int ran = (int) Math.random() * 2;
            switch (ran) {
                case  (0):
                    Rectangle r1 = new Rectangle(Math.random() * 10, Math.random() * 10);
                    pnl[i] =
                    break;
                case (2):
                    Код2;
                    break;
                case (3):
                    КодN;
                    break;*/
           int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
        setSize(800,500);
    }
    public static void main(String[]args)
    {
        new TestT1().setVisible(true);
    }
}
