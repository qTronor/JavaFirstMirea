package ru.mirea.task5.Dish;
import java.lang.*;

class Fork extends Dish {
    private String name;
    private String material;

    public Fork(String type, String color, int value, String material){
        super(type, color, value);
        this.material = material;
    }
    @Override
    public void findDish() {
        System.out.println("We have " + super.getType() + "s, its " + super.getColor() + ". And material is " + material + ", also we have " + super.getValue() + " of them");
    }
}
