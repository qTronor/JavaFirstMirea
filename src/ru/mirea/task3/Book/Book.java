package ru.mirea.task3.Book;

import java.lang.*;

public class Book {
    private String author, name;
    private int year;

    public Book(String a, String n, int y){
        author = a;
        name = n;
        year = y;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return this.author + " " + this.name + " " + this.year;
    }
}
