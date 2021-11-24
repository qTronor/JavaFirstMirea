package states;

import main.Game;
import main.Handler;

import java.awt.*;

public abstract class State {
    protected Handler handler;

    public State(Handler handler){
        this.handler = handler;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
}
