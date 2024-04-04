class MyNewThread1 extends Thread {
    @Override
    public void run(){
        int i = 0;
        while (true) {
            System.out.println("My Thread 1 for Coding is running");
            System.out.println("In the process to Code in Python!");
            try {
                Thread.sleep((200));
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class MyNewThread2 extends Thread {
    @Override
    public void run(){
        while (true) {
            System.out.println("My Thread 2 for Listening music is running");
            System.out.println("Listening the music!");
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();

        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
