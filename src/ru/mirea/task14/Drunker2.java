package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Drunker2 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);

        Queue<Integer> first = new LinkedList<>();
        for(int i = 0; i < 5; i++)
            first.offer(scan.nextInt());

        Queue<Integer> second = new LinkedList<>();
        for(int i = 0; i < 5; i++)
            second.offer(scan.nextInt());

        while(!first.isEmpty() && !second.isEmpty()){
            if(first.peek()==0){
                first.offer(second.poll());
                first.offer(first.poll());
            }
            else if(second.peek()==0){
                second.offer(second.poll());
                second.offer(first.poll());
            }
            else if (first.peek()>second.peek()){
                first.offer(second.poll());
                first.offer(first.poll());
            }
            else {
                second.offer(second.poll());
                second.offer(first.poll());
            }
            if (counter >= 106)
            {
                System.out.println("botva");
                break;
            }
            counter++;
        }
        if(counter < 106){
            if(first.isEmpty()){
                System.out.println("first " + counter);
            }
            else System.out.println("second " + counter);
        }
    }
}
