package ru.mirea.task16.pixelGame.main;

import ru.mirea.task16.pixelGame.gfx.GameCamera;
import ru.mirea.task16.pixelGame.input.KeyManager;
import ru.mirea.task16.pixelGame.input.MouseManager;
import ru.mirea.task16.pixelGame.worlds.World;

public class Handler {
    private Game game;
    private World world;

    public Handler(Game game) {
        this.game = game;
    }
    public int getWidth(){
        return game.getWidth();
    }
    public int getHeight(){
        return game.getHeight();
    }

    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }
    public GameCamera getGameCamera(){
        return game.getGameCamera();
    }
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
    public MouseManager getMouseManager(){
        return game.getMouseManager();
    }
}
