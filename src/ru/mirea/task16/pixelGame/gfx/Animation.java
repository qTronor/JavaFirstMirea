package ru.mirea.task16.pixelGame.gfx;

import java.awt.image.BufferedImage;
import java.util.List;

public class Animation {
    private int speed, index;
    private long lastTime, timer;
    private List<BufferedImage> frames;

    public Animation(int speed, List<BufferedImage> frames){
            this.frames = frames;
            this.speed = speed;
            index = 0;
            lastTime = System.currentTimeMillis();
            timer = 0;
    }
    public void tick(){
        timer += System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();

        if(timer > speed){
            index++;
            timer = 0;
            if(index >= frames.size()){
                index = 0;
            }
        }
    }
    public BufferedImage getCurrentFrame(){
        return frames.get(index);
    }
}
