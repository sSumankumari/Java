class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    int var=0;
    public void run(){
        while (var<6){
            System.out.println("This is a new thread");
            var++;
        }
    }
}

public class Thread_Constructors {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("Sundar Pichai");
        MyThread th2 = new MyThread("Elon Musk");

        th1.start();

        System.out.println("The id of the thread th is " + th1.getId());
        System.out.println("The name of the thread th is " + th1.getName());

        th2.start();

        System.out.println("The id of the thread th is "+ th2.getId());
        System.out.println("The name of the thread th is "+ th2.getName());
    }
}
