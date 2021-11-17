package ru.mirea.task15.t1;

import java.util.Scanner;
import java.io.*;

public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");


        try(FileWriter writer = new FileWriter("C:\\Users\\Home\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\qwerty.txt", true))
        {
            String str = in.nextLine();
            writer.write(str);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
