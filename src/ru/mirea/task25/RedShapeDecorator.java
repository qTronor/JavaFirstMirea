package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator {
    private Shape shape;

    public RedShapeDecorator()
    {

    }

    public void draw()
    {

    }

    public void setRedBorder()
    {
        System.out.println("You have set red  border to this shape.");
    }
}
