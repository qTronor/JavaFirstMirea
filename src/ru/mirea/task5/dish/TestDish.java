package ru.mirea.task5.dish;

public class TestDish {
    public static void main(String[] args){
        Fork d1 = new Fork("Fork", "gray", 6, "Al");
        d1.findDish();
        Plate d2 = new Plate("Plate", "Black", 8, "round");
        d2.findDish();
    }
}
