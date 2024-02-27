abstract class Parent{
    public Parent(){
        System.out.println("Constructor of class 'Parent'");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet1();
    abstract public void greet2();
}
class Child1 extends Parent{
    Child1(){
        System.out.println("Calling class Child1");
    }
    @Override
    public void greet1(){
        System.out.println("Good morning!");
    }

    @Override
    public void greet2() {
        System.out.println("Have a great day!");
    }
}
abstract class Child2 extends Parent{
    Child2(){
        System.out.println("Calling class Child2");
    }
    public void th(){
        System.out.println("This is another child class");
    }
}

public class AbstractClassesAndMethods {
    public static void main(String[] args) {
//        Parent p = new Parent(); // Will throw an error

        Child2 c2 = new Child2() {
            @Override
            public void greet1() {
                System.out.println("Good afternoon!");
            }

            @Override
            public void greet2() {
                System.out.println("Have a nice day!");
            }
        };
        c2.greet1();
        c2.greet2();
        System.out.print("\n");

        Child1 c1 = new Child1();
        c1.greet1();
        c1.greet2();

    }
}
