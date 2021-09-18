package ru.mirea.task1.opt1;

public class Num5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            String str = String.format("%.2f", 1.0/i);
            System.out.println(str);
        }
    }
}
