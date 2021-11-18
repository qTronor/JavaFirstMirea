package main;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import gfx.Assets;
import ru.mirea.task16.input.KeyManager;
import states.GameState;
import states.GameStateManager;
import states.MenuState;
import states.State;

public class Game implements Runnable {

    private Window window;
    public int width, height;
    public String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //states
    private State gameState;
    private State menuState;

    private KeyManager keyManager;
    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;

        keyManager = new KeyManager();
    }

    private void init(){
        window = new Window(title, width, height);
        window.getFrame().addKeyListener(keyManager);
        Assets.init();

        gameState = new GameState(this);
        menuState = new MenuState(this);
        GameStateManager.setState(menuState);
        GameStateManager.setState(gameState);
    }
    private void tick(){
        keyManager.tick();
        if(GameStateManager.getCurrentState() != null)
            GameStateManager.getCurrentState().tick();
    }

    private void render(){
        bs = window.getCanvas().getBufferStrategy();
        if(bs == null){
            window.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        g.clearRect(0, 0, width, height);

        if(GameStateManager.getCurrentState() != null)
            GameStateManager.getCurrentState().render(g);

        bs.show();
        g.dispose();
    }

    public void run(){

        init();

        int FPS = 60;
        double timePerTick = 1000000000 / FPS;
        double delta = 0;
        long now, lastTime = System.nanoTime(), timer = 0;
        int ticks = 0;

        while(running){
            now = System.nanoTime();
            delta += (now-lastTime)/timePerTick;
            timer += now - lastTime; //this is for control fps
            lastTime = now;

            if(delta >= 1) {
                tick();
                render();
                ticks++;
                delta--;
            }
            if(timer >= 1000000000){
                System.out.println(ticks);
                ticks = 0;
                timer = 0;
            }
        }

        stop();

    }
    public KeyManager getKeyManager(){
        return keyManager;
    }

    public synchronized void start(){
        if(running)
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
    }

    public synchronized void stop(){
        if(!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}