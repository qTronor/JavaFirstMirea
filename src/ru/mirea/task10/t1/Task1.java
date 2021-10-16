package ru.mirea.task10.t1;
import java.lang.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int n, k = 1, j = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        n = in.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.print(k + " ");
            if (i == k) {
                k++;
                i = 0;
            }
        }
        System.out.print(k);
    }
}
