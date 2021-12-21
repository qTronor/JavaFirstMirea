package ru.mirea.task16.pixelGame.ui;

import java.awt.*;
import java.awt.image.BufferedImage;

public class UI_ImageButton extends UIObject{

    private BufferedImage[] images;
    private ClickListener clicker;

    public UI_ImageButton(float x, float y, int width, int height, BufferedImage[] images, ClickListener clicker) {
        super(x, y, width, height);
        this.images = images;
        this.clicker = clicker;
    }

    @Override
    public void tick() {}

    @Override
    public void render(Graphics g) {
        if(hovering)
            g.drawImage(images[1], (int) x, (int) y, width, height, null);
        else
            g.drawImage(images[0], (int) x, (int) y, width, height, null);
    }

    @Override
    public void onClick() {
        clicker.onClick();
    }
}
