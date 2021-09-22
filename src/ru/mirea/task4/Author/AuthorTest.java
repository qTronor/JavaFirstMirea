package ru.mirea.task4.Author;

import java.lang.*;
public class AuthorTest {
    public static void main(String[] args){
        Author a1 = new Author("Jack", 'm');
        Author a2 = new Author("Mary", "MarSue@gman.comm", 'f');
        System.out.println(a2);
        a1.setEmail("JAckNApier@gthm.com");
        System.out.println(a1.getName() + " " + a1.getEmail() + " " + a1.getGender());
    }
}
