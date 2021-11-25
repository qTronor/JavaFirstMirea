package entities.statics;

import entities.Entity;
import main.Handler;

public abstract class StaticEntities extends Entity {
    public StaticEntities(Handler handler,float x, float y, int width, int height){
        super(handler, x, y, width, height);

    }
}
