package ru.mirea.task10.t15;

import java.util.Scanner;

public class T15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        re(n);
    }
    public static void re(int n){
        if (n > 0){
            System.out.print(n % 10 + " ");
            re(n/10);
        }
    }
}
