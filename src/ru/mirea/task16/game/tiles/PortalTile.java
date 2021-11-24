package tiles;

import gfx.Assets;

public class PortalTile extends Tile{
    public PortalTile(int id){
        super(Assets.portal, id);
    }
    public boolean isPortal(){
        return  true;
    }
}
