package ru.mirea.task2.Dog;
import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return this.name+" "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+ "s age is human years is " + age*7+ " years");
    }
}
