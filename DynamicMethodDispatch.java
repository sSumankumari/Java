class Phone{
    public void showTime(){
        System.out.println("This method is used to show time");
    }
    public void on(){
        System.out.println("Turning on 'Phone'");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("This is music method");
    }
    public void on(){
        System.out.println("Turning on 'SmartPhone'");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ph = new Phone();
        System.out.println("Calling the methods of class 'Phone'!");
        ph.on();

        SmartPhone smp = new SmartPhone();
        System.out.println("Calling the methods of class 'SmartPhone'!");
        smp.on();

        Phone obj = new SmartPhone();
        // We can call only the methods of super class if not overriden
//        SmartPhone obj2 = new Phone(); // Will throw an error --> not allowed
        System.out.println("Calling the methods!");
        obj.showTime();
//        obj.music(); // Will throw an error --> not allowed
        obj.on();

    }
}
