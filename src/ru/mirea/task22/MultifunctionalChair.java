package ru.mirea.task22;

public class MultifunctionalChair extends Factory implements Chair{
    public void sit(Chair chair)
    {
        System.out.println("You have sat on multifunctional chair!");
    }

    public String GetType()
    {
        return "multifunctional";
    }
}
