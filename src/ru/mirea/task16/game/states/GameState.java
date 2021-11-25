package states;

import entities.statics.Tree;
import main.Handler;
import worlds.World;
import entities.creatures.Player;
import main.Game;

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
