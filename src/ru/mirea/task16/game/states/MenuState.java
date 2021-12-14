package states;

import gfx.Assets;
import main.Game;
import main.Handler;
import ui.ClickListener;
import ui.UI_ImageButton;
import ui.UI_Manager;

import java.awt.*;

public class MenuState extends State{

    private UI_Manager ui_manager;

    public MenuState(Handler handler){

        super(handler);
        ui_manager = new UI_Manager(handler);
        handler.getMouseManager().setUIManager(ui_manager);
        ui_manager.addObject(new UI_ImageButton(200, 200, 128, 64, Assets.btn_start, new ClickListener() {
            @Override
            public void onClick() {
                handler.getMouseManager().setUIManager(null);
                GameStateManager.setState(handler.getGame().gameState);
            }
        }));
    }
    @Override
    public void tick() {
        ui_manager.tick();
        handler.getMouseManager().setUIManager(null);
        State.setState(handler.getGame().gameState);
    }

    @Override
    public void render(Graphics g) {
        ui_manager.render(g);
    }
}
