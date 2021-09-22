package ru.mirea.task2.book;
import java.util.Scanner;
import java.lang.*;
public class TestBook {
    public static void main(String[] args){
       Book b1 = new Book("Moby-Dick", "Herman Melville", 298);
       System.out.println(b1);
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       b1.howFast(num);
    }
}
