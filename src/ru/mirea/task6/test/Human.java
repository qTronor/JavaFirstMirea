package ru.mirea.task6.test;

public class Human {
    private String name;
    private String surname;
    private int age;

    Human(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void getName(){
        System.out.println("Hi my name is " + name + " "+ surname + ", I'm "+ age+" years old.");
    }
}
