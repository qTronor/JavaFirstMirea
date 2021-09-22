package ru.mirea.task2.shape;

import java.lang.*;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
