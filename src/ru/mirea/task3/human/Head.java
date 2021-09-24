package ru.mirea.task3.human;

public class Head {
    private String hairColor;
    private boolean hair;

    public Head(String hairColor, boolean hair){
        this.hairColor = hairColor;
        this.hair = hair;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                ", hair=" + hair +
                '}';
    }
}
