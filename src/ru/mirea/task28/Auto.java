package ru.mirea.task28;

    class Engine
    {
        public void start()
        {
            System.out.println("You have started the engine.");
        }
        public void stop()
        {
            System.out.println("You have stopped the engine.");
        }
    }

    class Wheel
    {
        public void pumpUp()
        {
            System.out.println("You have pumped up the wheel.");
        }
    }

    class Window
    {
        public void rollup()
        {
            System.out.println("You have rolled up the window.");
        }
        public void rolldown()
        {
            System.out.println("You have rolled down the window.");
        }
    }

    class Door
    {
        public Window window = new Window();
        public void open()
        {
            System.out.println("You have opened the door.");
        }
        public void close()
        {
            System.out.println("You have closed the door.");
        }
    }

    public class Auto {
        public Engine engine = new Engine();
        public Wheel[] wheel = new Wheel[4];
        public Door left = new Door();
        public Door right = new Door();

        public Auto() {
            for (int i = 0; i < 4; i++)
                wheel[i] = new Wheel();
        }

        public static void main(String[] args) {
            ru.mirea.task28.Auto car = new ru.mirea.task28.Auto();
            car.left.window.rollup();
            car.wheel[0].pumpUp();
            car.horn();

            Auto objwagon = new ru.mirea.task28.Auto().new Wagon();
            objwagon.engine.start();
            objwagon.wheel[3].pumpUp();
            objwagon.horn();
        }

        public void horn() {
            System.out.println("beep");
        }

        private class Wagon extends Auto {
            public void horn() {
                System.out.println(" BEEPP");
            }
        }
    }
