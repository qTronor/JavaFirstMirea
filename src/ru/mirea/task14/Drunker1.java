package ru.mirea.task14;

import java.util.Stack;
import java.util.Scanner;

public class Drunker1 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        Stack<Integer> first = new Stack<>();
        for(int i = 0; i < 5; i++)
            first.push(scan.nextInt());

        Stack<Integer> second = new Stack<>();
        for(int i = 0; i < 5; i++)
            second.push(scan.nextInt());

        while(!first.empty() && !second.empty()){
            if ((first.get(0) < second.get(0))){
                  second.push(first.get(0));
                  second.push(second.get(0));
                  first.remove(0);
                  second.remove(0);
            }
            else{
                first.push(second.get(0));
                first.push(first.get(0));
                second.remove((0));
                first.remove((0));
            }
            if (counter >= 106)
            {
               System.out.println("botva");
                break;
            }
            counter++;
        }
        if(counter < 106){
            if(first.empty()){
                System.out.println("first " + counter);
            }
            else System.out.println("second " + counter);
        }
    }
}
