package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args)
    {
        Shape obj1 = new Circle();
        Shape obj2 = new Rectangle();
        RedShapeDecorator obj3 = new RedShapeDecorator();

        obj1.draw();
        obj2.draw();
        obj3.setRedBorder();
    }
}
