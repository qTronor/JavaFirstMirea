package entities.creatures;

import gfx.Assets;
import main.Handler;

import java.awt.*;

public class Player extends Creature {

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

        bounds.x = 0;
        bounds.y = 0;
        bounds.width = 32;
        bounds.height = 32;
    }

    @Override
    public void tick() {
        getInput();
        move();
        handler.getGameCamera().centeredOnEntity(this);
    }

    private void getInput(){
        xMove = 0;
        yMove = 0;

        if(handler.getKeyManager().upKey)
            yMove = -speed;
        if(handler.getKeyManager().downKey)
            yMove = speed;
        if(handler.getKeyManager().leftKey)
            xMove = -speed;
        if(handler.getKeyManager().rightKey)
            xMove = speed;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.player, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
    }

}
