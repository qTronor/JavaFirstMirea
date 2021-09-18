package ru.mirea.task1.opt1;

import java.lang.*;
import java.util.Scanner;

public class Num1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];

        for(int i = 0; i<n;i++) {
            int num = sc.nextInt();
            arr[i] = num;
            sum += num;
        }
        System.out.println(sum);
    }
}
