package ru.mirea.task29;

import java.io.*;

public class CurrencyInfo implements Serializable {
    private static final long serialVerision = 1L;

    private int coins, medicalPacks, bullets;

    public  CurrencyInfo(int coins, int medicalPacks, int bullets){
        this.coins = coins;
        this.medicalPacks = medicalPacks;
        this.bullets = bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setMedicalPacks(int medicalPacks) {
        this.medicalPacks = medicalPacks;
    }

    public int getBullets() {
        return bullets;
    }

    public int getCoins() {
        return coins;
    }

    public int getMedicalPacks() {
        return medicalPacks;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "coins=" + coins +
                ", medicalPacks=" + medicalPacks +
                ", bullets=" + bullets +
                '}';
    }

    public static void main(String[] args) {
        int coins = 454;
        int medicalPacks = 2;
        int bullets = 21;

        CurrencyInfo savedGame = new CurrencyInfo(coins, medicalPacks, bullets);
        try {
            FileOutputStream outputStream = new FileOutputStream("C:/Users/Home/IdeaProjects/JavaFirstMirea/src/ru/mirea/task29/save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(savedGame);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Something wrong: " + e);
        }
        try{
            FileInputStream fileInputStream = new FileInputStream("C:/Users/Home/IdeaProjects/JavaFirstMirea/src/ru/mirea/task29/save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(savedGame);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
