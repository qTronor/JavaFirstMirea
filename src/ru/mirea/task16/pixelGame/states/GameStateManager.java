package ru.mirea.task16.pixelGame.states;

public class GameStateManager {
    private static State currentState = null;
    public static void setState(State state){
        currentState = state;
    }

    public static State getCurrentState() {
        return currentState;
    }
}
