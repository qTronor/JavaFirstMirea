package ru.mirea.task15;

import java.io.*;

public class T2 {
    public static void main(String[] args) {
        try(FileReader reader = new
                FileReader("C:\\Users\\Home\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task15\\qwerty.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
