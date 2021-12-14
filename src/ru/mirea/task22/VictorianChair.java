package ru.mirea.task22;

public class VictorianChair extends Factory implements Chair {
    public void sit(Chair chair)
    {
        System.out.println("You have sat on victorian chair!");
    }

    public String GetType()
    {
        return "victorian";
    }
}
