package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage player, dirt, grass, stone, enemy;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));

        player = sheet.crop(320, 32, width, height);
        dirt = sheet.crop(0, 448, width, height);
        grass = sheet.crop(0, 480, width, height);
        stone = sheet.crop(width *14, height*14, width, height);
        enemy = sheet.crop(0, 160, width, height);
    }

}