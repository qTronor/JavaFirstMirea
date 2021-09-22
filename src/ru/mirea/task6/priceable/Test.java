package ru.mirea.task6.priceable;
public class Test {
    public static void main(String[] args) {
        Priceable b1 = new Book("Moby Dick", 1851, 235);
        Priceable s1 = new Bike("Qwetty", "Red", 1578);
        b1.getPrice();
        s1.getPrice();
    }
}