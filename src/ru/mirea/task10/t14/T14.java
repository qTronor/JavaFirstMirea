package ru.mirea.task10.t14;
import java.util.Scanner;

public class T14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        re(n);
    }
    public static void re(int n){
        if (n > 0){
            re(n/10);
            System.out.print(n % 10 + " ");
        }
    }
}
