package ru.mirea.task2.Ball;

import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(25,"red");
        Ball b2 = new Ball(14, "black");
        System.out.println(b1);
        b1.getVolume();
        b2.getVolume();
    }
}
