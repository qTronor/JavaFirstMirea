package ru.mirea.task10.t17;
import java.util.Scanner;
public class T17 {
    public static int re() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, re());
        }
    }
    public static void main(String[] args) {
        System.out.println(re());
    }
}
