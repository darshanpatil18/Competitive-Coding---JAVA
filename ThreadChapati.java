import java.util.*;

public class ThreadChapati
{
    public static void main(String[] args) throws InterruptedException {
        final Chappati ob = new Chappati();

        // Create mother thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ob.produce();
                } catch (InterruptedException e) {
                }
            }
        });

        // Create child thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ob.consume();
                } catch (InterruptedException e) {
                }
            }
        });

        t1.start();
        t2.start();
    }

    public static class Chappati 
    {
        // Create a vessel shared by producer and consumer
        LinkedList<Integer> vessel = new LinkedList<>();
        int capacity = 10;

        // Function called by producer thread
        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    while (vessel.size() >= capacity)
                        wait();
                    System.out.println("Mother prepares chappati-" + value);
                    if (value >= capacity) {
                        value = value - capacity;
                    }
                    vessel.add(value);
                    value++;
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (vessel.size() == 0)
                        wait();
                    int val = vessel.removeFirst();
                    System.out.println("Kids eating chappati-" + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}