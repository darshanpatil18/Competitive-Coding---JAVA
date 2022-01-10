class MyThread {
    public void fibonacci() {
        synchronized (this) {
            long arr[] = new long[50];
            arr[0] = 0;
            arr[1] = 1;
            System.out.println("Fibo 1 :"+arr[0]);
            System.out.println("Fibo 2 :"+arr[1]);
            for (int i = 2; i < 50; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.println("Fibo "+(i+1)+" : "+arr[i]);
                if (i == 30) {
                    try {
                        System.out.println("Fibonacci Generation Halted");
                        wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
            }
        }
    }

    synchronized public void naturalNumber() {
        for (int i = 1; i <= 15; i++) {
            System.out.println("Natural Number "+i+" : "+i);
        }
        notify();
    }
}

class Fibonacci extends Thread {
    MyThread t;

    Fibonacci(MyThread t) {
        this.t = t;
    }

    public void run() {
        t.fibonacci();
    }
}

class NaturalNumber extends Thread {
    MyThread t;

    NaturalNumber(MyThread t) {
        this.t = t;
    }

    public void run() {
        t.naturalNumber();
    }
}

public class ThreadsFiboNumber {
    public static void main(String[] args) throws Exception {
        MyThread ob = new MyThread();
        Fibonacci f = new Fibonacci(ob);
        NaturalNumber n = new NaturalNumber(ob);

        f.setPriority(9);
        n.setPriority(5);

        f.start();
        n.start();
    }
}