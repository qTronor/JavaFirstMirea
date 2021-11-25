package entities.creatures;

import gfx.Animation;
import gfx.Assets;
import main.Handler;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Creature {
    //Anim
    private Animation animDown,animUp ,animRight, animLeft, playerStand;

    public Player(Handler handler, float x, float y) {
        super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);

        bounds.x = 0;
        bounds.y = 0;
        bounds.width = 32;
        bounds.height = 32;

        animDown = new Animation(400, Assets.player_down);
        animUp = new Animation(400, Assets.player_up);
        animLeft = new Animation(400, Assets.player_left);
        animRight = new Animation(400, Assets.player_right);
    }

    @Override
    public void tick() {
        animDown.tick();
        animRight.tick();
        animLeft.tick();
        animUp.tick();

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
        g.drawImage(getCurrentAnimFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
    }
    private BufferedImage getCurrentAnimFrame(){
        if (xMove < 0){
            return animLeft.getCurrentFrame();
        }
        else if (xMove > 0){
            return animRight.getCurrentFrame();
        }
        else if (yMove < 0){
            return animUp.getCurrentFrame();
        }
        else if (yMove > 0){
            return animDown.getCurrentFrame();
        }
        else return Assets.playerStand;
    }

}
