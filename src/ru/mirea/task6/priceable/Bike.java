package ru.mirea.task6.priceable;

public class Bike implements Priceable{

    private String model;
    private String color;
    private int price;

    Bike(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void getPrice(){
        System.out.println("Bike '"+model +"' is "+color+". \nIt will cost.");
    }

}

