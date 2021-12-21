package ru.mirea.task16.pixelGame.tiles;

import ru.mirea.task16.pixelGame.gfx.Assets;

public class RockTile extends Tile{
    public RockTile(int id){
        super(Assets.stone, id);
    }
    @Override
    public boolean isSolid(){
        return  true;
    }
}
