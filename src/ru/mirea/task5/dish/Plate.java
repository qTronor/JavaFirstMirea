package ru.mirea.task5.dish;

class Plate extends Dish{
    private String name;
    private String form;

    public Plate(String type, String color, int value, String form) {
        super(type, color, value);
        this.form = form;
    }

    @Override
    public void findDish() {
        System.out.println("We have " + super.getType() + "s, its " + super.getColor() + " and " + form + ", also there are " + super.getValue() + " plates in the box.");
    }
}