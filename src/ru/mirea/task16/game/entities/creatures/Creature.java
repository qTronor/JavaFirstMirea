package entities.creatures;

import entities.Entity;

public abstract class Creature extends Entity {
    public static final int DEFAULT_HEALTH = 10;
    public static final float SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 32;
    public static final int DEFAULT_CREATURE_HEIGHT = 32;

    protected float speed;
    protected int health;
    protected float xMove, yMove;

    public Creature(float x, float y, int width, int height) {
        super(x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = SPEED;
        xMove = 0;
        yMove = 0;
    }

    public void move(){
        x += xMove;
        y += yMove;
    }


    // get set
    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    @Override
    public float getY() {
        return super.getY();
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
