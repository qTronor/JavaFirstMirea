package ru.mirea.task15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");


        try(FileWriter writer = new FileWriter("C:\\Users\\Home\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\qwerty.txt", true))
        {
            String str = in.nextLine();
            writer.append(str);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
