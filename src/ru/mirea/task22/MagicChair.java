package ru.mirea.task22;

public class MagicChair extends Factory implements Chair{
    @Override
    public void sit(Chair chair)
    {
        System.out.println("You have sat on magic chair!");
    }

    public String GetType()
    {
        return "magic";
    }
}
