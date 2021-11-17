package ru.mirea.task15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");


        try(FileWriter writer = new FileWriter("C:\\Users\\Home\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\qwerty.txt", false))
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
