package ru.mirea.task16.pixelGame.states;

import ru.mirea.task16.pixelGame.main.Handler;
import ru.mirea.task16.pixelGame.worlds.World;

import java.awt.*;

public class GameState extends State {

    private World world;

    public GameState(Handler handler){
        super(handler);
        world = new World(handler, "src/ru/mirea/task16/res/worlds/world1.txt");
        handler.setWorld(world);
    }

    @Override
    public void tick() {
        world.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
    }

}
