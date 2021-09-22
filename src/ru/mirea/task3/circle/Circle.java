package ru.mirea.task3.circle;

import java.lang.*;

public class Circle {
    private int radius;
    public Circle(int r){
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
