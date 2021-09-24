package ru.mirea.task3.human;

public class Leg {
    private int size;
    private char side;

    public Leg(int size, char side) {
        this.size = size;
        this.side = side;
    }

    public void setSide(char side) {
        this.side = side;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public char getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "{ " +
                "size = " + size +
                ", side = '" + side + '\'' +
                " } ";
    }
}
