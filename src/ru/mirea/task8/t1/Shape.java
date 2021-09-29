package ru.mirea.task8.t1;
import java.lang.*;

public abstract class Shape {
    protected String color;
    protected double position;

    public Shape(){
        this.color = "None";
        this.position = 0;
    }

    public Shape(String color, double position){
        this.color = color;
        this.position = position;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }
}
