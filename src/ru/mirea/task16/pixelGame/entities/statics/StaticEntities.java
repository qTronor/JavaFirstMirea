package ru.mirea.task16.pixelGame.entities.statics;

import ru.mirea.task16.pixelGame.entities.Entity;
import ru.mirea.task16.pixelGame.main.Handler;

public abstract class StaticEntities extends Entity {
    public StaticEntities(Handler handler,float x, float y, int width, int height){
        super(handler, x, y, width, height);

    }
}
