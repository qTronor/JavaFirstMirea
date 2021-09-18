package ru.mirea.task1.opt1;

import java.lang.*;
import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, r;
        int[] arr = new int[n];
        double a;
        for(int i = 0; i<n; i++){
            a = Math.random() * 10;
            r = (int) Math.round(a);
            arr[i] = r;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int minId = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minId = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
