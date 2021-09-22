package ru.mirea.task4.Ball;

import java.lang.*;
public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball(5.0, 5.0);
        Ball b2 = new Ball();

        System.out.println(b1);

        b2.setXY(1.5, 2.5);
        System.out.println(b2);
    }
}
