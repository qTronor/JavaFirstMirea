package ru.mirea.task6.priceable;

class Book implements Priceable{
    private String name;
    private int year;
    private int price;

    Book(String name, int year, int price){
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Книга " + name + " " + year + " года. Стоит: " + price + "$");
    }
}