package ru.mirea.task5.dog;

public class Poodle extends Dog {
    protected int age;

    public Poodle(String name, int weight, String prize, int age){
        super(name, weight, prize);
        this.age = age;
    }

    public int getAge() { return age; }

    @Override
    public void dispInfo() {
        System.out.println("Собаку зовут: " + super.getName() + " и весит " + super.getWeight() + " kg");
        System.out.println("Возраст: " + age + " лет; Заработал наград: " + super.getPrize());
    }
}
