package ru.mirea.task8.t1;


import java.lang.*;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.position = 0;
        this.color = "blue";
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public  Rectangle(double width, double length, String color, double position){
        this.width = width;
        this.length = length;
        this.color = color;
        this.position = position;
    }
}
