package ru.mirea.task3.human;

public class Human {
    public static void main(String[] args) {
        Leg l1 = new Leg(42, 'L');
        System.out.println(l1.getSide());
        Head hd1 = new Head("Black", true);
        System.out.println(hd1);
        Hand h1 = new Hand('L', false);
        System.out.println(h1);
    }

}
