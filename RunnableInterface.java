class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("This is thread class 1 (gun1 with bullet1)");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("This is thread class 2 (gun2 with bullet2)");
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        System.out.println("Creating Thread by implementing Runnable Interface!");

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
