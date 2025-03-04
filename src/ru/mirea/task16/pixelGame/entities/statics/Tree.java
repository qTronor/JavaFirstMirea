package ru.mirea.task16.pixelGame.entities.statics;

import ru.mirea.task16.pixelGame.Items.Item;
import ru.mirea.task16.pixelGame.gfx.Assets;
import ru.mirea.task16.pixelGame.main.Handler;
import ru.mirea.task16.pixelGame.tiles.Tile;

import java.awt.*;

public class Tree extends StaticEntities{
    public Tree(Handler handler, float x, float y){
        super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT * 2);
        bounds.x = 10;
        bounds.y = (int) (height / 1.5f);
        bounds.width = width - 20;
        bounds.height = (int) (height - height / 1.5f);
    }
    @Override
    public void tick(){

    }
    @Override
    public void render(Graphics g){
        g.drawImage(Assets.tree, (int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
    }

    @Override
    public void die() {
        handler.getWorld().getItemManager().addItem(Item.woodItem.createNew((int) x, (int) y));
    }
}
