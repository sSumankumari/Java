class MyThread1 extends Thread {
    @Override
    public void run(){
        while (true) {
            System.out.println("My Thread 1 for Coding is running");
            System.out.println("In the process to Code in Python!");
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run(){
        while (true) {
            System.out.println("My Thread 2 for Listening music is running");
            System.out.println("Listening the music!");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();

        th1.start();
        th2.start();
    }
}
