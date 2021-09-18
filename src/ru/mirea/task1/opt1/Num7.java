package ru.mirea.task1.opt1;

import java.util.Scanner;
public class Num7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println("Факториал числа равен " + fact(n));
        }
        else{
            System.out.println("Введено не целое число");
        }
    }
    public static int fact(int n) {
            if(n == 2){
                return 2;
            }
            else{
                return (n * fact(n-1));
            }
    }
}
