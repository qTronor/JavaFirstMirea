package ru.mirea.task5.dog;
    class Pug extends Dog{
        private String length;
        private int age;

        public Pug(String name, int weight, String prize, int age, String length){
            super(name, weight, prize);
            this.age = age;
            this.length = length;
        }
        public int getAge() { return age; }
        public String getLength() { return length; }

        @Override
        public void dispInfo() {
            System.out.println("Собаку зовут: " + super.getName() + " и весит " + super.getWeight() + " kg, длина: " + length);
            System.out.println("Возраст: " + age + " лет; Заработал наград: " + super.getPrize());
        }
    }
