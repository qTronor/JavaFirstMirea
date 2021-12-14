package ru.mirea.task22;

public abstract class Factory {
    public Chair getChair(ChairTypes type)
    {
        Chair toReturn = null;
        switch (type) {
            case VICTORIAN:
                toReturn = new VictorianChair();
                break;
            case MULTIFUNCTIONAL:
                toReturn = new MultifunctionalChair();
                break;
            case MAGIC:
                toReturn = new MagicChair();
                break;
            default:
                throw new IllegalArgumentException("Wrong chair type:" + type);
        }
        return toReturn;
    }
}
