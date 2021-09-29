package ru.mirea.task7.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "blue";
        this.filled = false;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public  double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*radius;
    }
    @Override
    public String toString(){
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}
