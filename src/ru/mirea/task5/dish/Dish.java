package ru.mirea.task5.dish;

import java.lang.*;
public abstract class Dish {
    protected String type;
    protected String color;
    protected int value;

    public Dish(String type){
        this.type = type;
        this.color = "White";
        this.value = 2;
    }

    public String getType() {
        return type;
    }

    public Dish(String type, String color, int value){
        this.type = type;
        this.color = color;
        this.value= value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public abstract void findDish();
}
