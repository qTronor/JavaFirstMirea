package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
    private boolean[] keys;
    public boolean upKey, downKey, rightKey, leftKey;
    public KeyManager(){
        keys = new boolean[256];
    }
    public void tick(){
        upKey = keys[KeyEvent.VK_W];
        downKey = keys[KeyEvent.VK_S];
        leftKey = keys[KeyEvent.VK_A];
        rightKey = keys[KeyEvent.VK_D];
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
}
