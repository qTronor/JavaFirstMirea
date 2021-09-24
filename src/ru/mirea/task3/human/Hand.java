package ru.mirea.task3.human;

import java.lang.*;

public class Hand {
    private boolean bijou;
    private char side;

    public Hand(char side, boolean bijou){
        this.side = side;
        this.bijou = bijou;
    }

    public void setSide(char side) {
        this.side = side;
    }

    public void setBijou(boolean bijou) {
        this.bijou = bijou;
    }

    public char getSide() {
        return side;
    }
    @Override
    public String toString() {
        return "Hand{" +
                "bijou=" + bijou +
                ", side=" + side +
                '}';
    }
}
