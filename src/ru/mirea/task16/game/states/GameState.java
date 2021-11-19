package states;

import worlds.World;
import entities.creatures.Player;
import main.Game;

import java.awt.*;

public class GameState extends State {

    private Player player;
    private World world;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
        world = new World("src/ru/mirea/task16/res/worlds/world1.txt"); //Вот не понимаю почему тут работает путь от src, а от worlds нет
    }

    @Override
    public void tick() {
        world.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
    }

}
