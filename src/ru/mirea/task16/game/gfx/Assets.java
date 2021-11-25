package gfx;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage playerStand, dirt, grass, stone, fakeWall, enemy, portal, tree;

    public static List<BufferedImage> player_down; //Generics?
    public static List<BufferedImage> player_up;
    public static List<BufferedImage> player_left;
    public static List<BufferedImage> player_right;

   // public static List<BufferedImage> tree_variations;


    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
        SpriteSheet knightSheet = new SpriteSheet(ImageLoader.loadImage("/textures/knight.png"));
        SpriteSheet treeSheet = new SpriteSheet(ImageLoader.loadImage("/textures/tree.png"));
        tree = treeSheet.crop(0,0,48,48);

        player_down = new ArrayList<BufferedImage>();
        player_down.add(0, knightSheet.crop(width, 0, width, height));
        player_down.add(1, knightSheet.crop(width * 3, 0, width, height));

        player_up = new ArrayList<BufferedImage>();
        player_up.add(0, knightSheet.crop(width, height, width, height));
        player_up.add(1, knightSheet.crop(width * 3, height, width, height));

        player_left = new ArrayList<BufferedImage>(2);
        player_left.add(0, knightSheet.crop(width, height * 2, width, height));
        player_left.add(1, knightSheet.crop(width * 3, height * 2, width, height));

        player_right = new ArrayList<BufferedImage>();
        player_right.add(0, knightSheet.crop(width, height * 3, width, height));
        player_right.add(1, knightSheet.crop(width * 3, height * 3, width, height));

        /*//TREES
        tree_variations = new ArrayList<BufferedImage>();
        tree_variations.add(0, treeSheet.crop(0,0,width * 2,height * 2));
        tree_variations.add(1, treeSheet.crop(width,0,width * 2,height * 2));
        tree_variations.add(2, treeSheet.crop(width * 2,0,width * 2,height * 2));
        tree_variations.add(3, treeSheet.crop(width * 4,0,width * 2,height * 2));
        tree_variations.add(4, treeSheet.crop(width * 6,0,width * 2,height * 2));
        tree_variations.add(5, treeSheet.crop(width * 8,0,width * 2,height * 2));
        tree_variations.add(6, treeSheet.crop(width * 10,0,width * 2,height * 2));
        tree_variations.add(7, treeSheet.crop(width * 12,0,width * 2,height * 2));

        tree_variations.add(8, treeSheet.crop(0,height * 2,width * 2,height * 3));
        tree_variations.add(9, treeSheet.crop(width * 2, height * 2,width * 2,height * 3));
        tree_variations.add(10, treeSheet.crop(width * 4,height * 2,width * 2,height * 3));
        tree_variations.add(11, treeSheet.crop(width * 6,height * 2,width * 2,height * 3));
        tree_variations.add(12, treeSheet.crop(width * 8,height * 2,width * 2,height * 3));

        tree_variations.add(13, treeSheet.crop(0,height * 5,width * 4,height * 4));
        tree_variations.add(14, treeSheet.crop(width * 4, height * 5,width * 4,height * 4));
        tree_variations.add(15, treeSheet.crop(width * 8, height * 5,width * 4,height * 4));
        tree_variations.add(16, treeSheet.crop(width * 12, height * 5,width * 4,height * 4));*/

        playerStand = knightSheet.crop(0,0,width,height);
        dirt = sheet.crop(0, 448, width, height);
        grass = sheet.crop(0, 480, width, height);
        stone = sheet.crop(width * 17, height*14, width, height);
        enemy = sheet.crop(0, 160, width, height);
        portal = sheet.crop(1663, 352, width, height);
        fakeWall = sheet.crop(width * 18, height*14, width, height);
    }

}