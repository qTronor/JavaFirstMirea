package ru.mirea.task2.ball;

import java.lang.*;

public class Ball {
    private int radius;
    private String color;

    public Ball(int r, String c){
        radius=r;
        color=c;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String toString(){
        return this.radius + " " + this.color;
    }
    public void getVolume(){
        System.out.println("Ball volume = " + 4/3*Math.PI*radius*radius*radius);
    }
}

