package ru.mirea.task2.Book;

import java.lang.*;

public class Book {
    private String name;
    private String author;
    private int numOfPages;

    public Book(String n, String a, int num){
        name=n;
        author=a;
        numOfPages=num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }
    public String toString(){
        return  this.name + " by "+ this.author + " has " + this.numOfPages + " pages.";
    }
    public void howFast(int pagesInDay){
        System.out.println("You will spend " + numOfPages/pagesInDay + " reading this book");
    }
}
