package ru.mirea.task5.Furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Chair d1 = new Chair("Ascon", 12, "wood");
        d1.dispInfo();
        Sofa d2 = new Sofa("Helen&Co", 13, "leather");
        d2.dispInfo();
    }
}
