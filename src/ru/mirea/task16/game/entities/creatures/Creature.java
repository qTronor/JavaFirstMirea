package entities.creatures;

import entities.Entity;
import main.Game;
import main.Handler;
import tiles.Tile;


public abstract class Creature extends Entity {

    public static final int DEFAULT_HEALTH = 10;
    public static final float DEFAULT_SPEED = 3.0f;
    public static final int DEFAULT_CREATURE_WIDTH = 48, // При смене текстуры гг, вернуть значения на 32. Найти текстуры
            DEFAULT_CREATURE_HEIGHT = 48;

    protected int health;
    protected float speed;
    protected float xMove, yMove;

    public Creature(Handler handler, float x, float y, int width, int height) {
        super(handler, x, y, width, height);
        health = DEFAULT_HEALTH;
        speed = DEFAULT_SPEED;
        xMove = 0;
        yMove = 0;
    }

    public void move(){
         moveX();
         moveY();
    }
    public void moveX(){
        if(xMove > 0){
            int tx = (int)(x + xMove + bounds.x + bounds.width) / Tile.TILE_WIDTH;
            if(!collisionWithTile(tx, (int)(y+bounds.y)/Tile.TILE_HEIGHT) && !collisionWithTile(tx, (int)(y+bounds.y + bounds.height)/Tile.TILE_HEIGHT)){
                x+=xMove;
            }
            else {
                x = tx * Tile.TILE_WIDTH - bounds.x - bounds.width - 1;
            }
               // teleport(tx, (int)(y+bounds.y)/Tile.TILE_HEIGHT);
        }
        else if(xMove < 0){
            int tx = (int)(x + xMove + bounds.x) / Tile.TILE_WIDTH;
            if(!collisionWithTile(tx, (int)(y+bounds.y)/Tile.TILE_HEIGHT) && !collisionWithTile(tx, (int)(y+bounds.y + bounds.height)/Tile.TILE_HEIGHT)){
                x+=xMove;
            }
            else{
                x = tx * Tile.TILE_WIDTH + bounds.x + Tile.TILE_WIDTH;
            }
            //teleport(tx, (int)(y + bounds.y + bounds.height)/Tile.TILE_HEIGHT);
        }
    }
    public void moveY(){
        if(yMove < 0){
            int ty = (int)(y + yMove + bounds.y) / Tile.TILE_HEIGHT;
            if(!collisionWithTile((int)(x+bounds.x)/Tile.TILE_WIDTH, ty) && !collisionWithTile((int)(x+bounds.x+bounds.width)/Tile.TILE_WIDTH, ty)){
                y += yMove;
            }
            else{
                y = ty * Tile.TILE_HEIGHT + bounds.y + Tile.TILE_HEIGHT;
            }
           // teleport((int)(x+bounds.x)/Tile.TILE_WIDTH, ty);
        }
        else if(yMove > 0){
            int ty = (int)(y + yMove + bounds.y + bounds.height) / Tile.TILE_HEIGHT;
            if(!collisionWithTile((int)(x+bounds.x)/Tile.TILE_WIDTH, ty) && !collisionWithTile((int)(x+bounds.x+bounds.width)/Tile.TILE_WIDTH, ty)){
                y += yMove;
            }
            else {
                y = ty * Tile.TILE_HEIGHT - bounds.y - bounds.height - 1;
            }
           // teleport((int)(x+bounds.x+bounds.width)/Tile.TILE_WIDTH, ty);
        }
    }
    private boolean collisionWithTile(int x, int y){
        return handler.getWorld().getTile(x,y).isSolid();
    }
    /*private boolean collisonWithPortal(int x, int y){
        return handler.getWorld().getTile(x,y).isPortal();
    }
    public void teleport(int tx, int ty){
        if(collisonWithPortal(tx, ty)){
            System.out.println("Prev x: " + x);
            x = tx - tx + Tile.TILE_WIDTH * 1;
            System.out.println("Current x: " + x);
            System.out.println("Prev y: " + y);
            y = ty - ty + Tile.TILE_HEIGHT * 1;
            System.out.println("Current y: " +y);
        }
    }*/

    //GETTERS SETTERS

    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

}