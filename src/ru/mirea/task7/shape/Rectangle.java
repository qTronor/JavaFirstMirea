package ru.mirea.task7.shape;

import java.lang.*;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.filled = false;
        this.color = "Blue";
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean filled){
        super(color,filled);
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public  Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
       // super(color,filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return 2*length + 2 * width;
    }
    @Override
    public String toString(){
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length;
    }

}
