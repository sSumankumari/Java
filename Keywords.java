// declaring parent class
class ParentCl {
    ParentCl() {
        System.out.println("Parent class no argument constructor");
    }
    ParentCl(String s) {
        System.out.println("Parent class parameterized " + s);
    }
}
// Child class extends parent class
class Child extends ParentCl {
    Child() {
        // referring current class parameterized constructor
        this("constructor.");
        System.out.println("Child class no-argument constructor.");
    }
    Child(String s) {
        // referring parent class parameterized constructor
        super("constructor.");
        System.out.println("Child class parameterized " + s);
    }
}
public class Keywords {
    public static void main(String[] args) {
        ParentCl objP = new ParentCl();
        // instance of child class
        Child objC = new Child();
    }
}