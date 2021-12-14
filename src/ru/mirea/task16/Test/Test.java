package ru.mirea.task16.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Test{
    //This is test for random generating of the world
    public static void newFile(){
        try {
            FileWriter myFile=new FileWriter("src/ru/mirea/task16/res/worlds/world2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int worldWidth, wor;
        Random r = new Random();
        int startX = r.nextInt(3);
        int startY = r.nextInt(3);

    }


}
