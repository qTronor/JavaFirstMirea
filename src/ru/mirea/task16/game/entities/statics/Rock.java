package entities.statics;

import Items.Item;
import gfx.Assets;
import main.Handler;
import tiles.Tile;

import java.awt.*;

public class Rock extends StaticEntities{
    public Rock(Handler handler, float x, float y) {
        super(handler, x, y, Tile.TILE_WIDTH, Tile.TILE_HEIGHT);

        bounds.x = 3;
        bounds.y = (int) (height / 2f);
        bounds.width = width - 6;
        bounds.height = (int) (height - height / 2f);
    }

    @Override
    public void tick() {

    }

    @Override
    public void die(){
        handler.getWorld().getItemManager().addItem(Item.rockItem.createNew((int) x, (int) y));
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.rock, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
    }
}
