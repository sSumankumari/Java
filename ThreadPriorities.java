class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
//        System.out.println("This is a new thread for "+ this.getName());

        while (true){
            System.out.println("This is a new thread for "+ this.getName());
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Sunadar Pichai");
        MyThr1 t2 = new MyThr1("Elon Musk");
        MyThr1 t3 = new MyThr1("Rutherford");
        MyThr1 t4 = new MyThr1("Mukesh Ambani");
        MyThr1 t5 = new MyThr1("Neil Armstrong");

        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}