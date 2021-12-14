package ru.mirea.task22;

public class Client {
    private String name, sex;
    private int age;

    public Client(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void sit(Chair chair)
    {
        System.out.println(name + " sit on the " + chair.GetType() + " chair!");
    }

    public String GetType()
    {
        return "human";
    }
}
