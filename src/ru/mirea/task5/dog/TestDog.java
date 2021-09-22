package ru.mirea.task5.dog;

public class TestDog {
    public static void main(String[] args) {
        Pug d1 = new Pug("Jack", 12, "1", 5, "0.5");
        d1.dispInfo();
        Poodle d2 = new Poodle("Helen", 13, "5", 7);
        d2.dispInfo();
    }
}