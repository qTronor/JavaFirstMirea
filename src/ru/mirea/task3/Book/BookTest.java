package ru.mirea.task3.Book;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Bob Black", "Yesterday", 1984);
        System.out.println(b1);
        b1.setAuthor("Qwerty");
        System.out.println(b1);
        System.out.println("This book written in " + b1.getYear());
    }
}
