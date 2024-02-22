class Base1{
    Base1(){
        System.out.println("This is the constructor of class 'Base1'");
    }
    Base1(int a){
        System.out.println("This is the overloaded constructor of class 'Base1' with value of a as: "+ a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(5);
        System.out.println("This is the constructor of class 'Derived1'");
    }
    Derived1(int x, int y){
        System.out.println("This is the overloaded constructor of class 'Derived1' with value of x as: "+ x +" and y as: "+ y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("This is the constructor of child class of derived class");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("This is the constructor of child class of derived class, with values x="+ x +" y="+ y +" z="+ z);
    }
}

public class Constructors_In_Inheritance {
    public static void main(String[] args) {
        System.out.println("Calling the constructor of Base class!");
        Base1 b = new Base1();
        Base1 b2 = new Base1(2);
        System.out.print("\n");

        System.out.println("Calling the constructor of Derived class!");
        Derived1 d = new Derived1();
        Derived1 d2 = new Derived1(2, 10);
        System.out.print("\n");

        System.out.println("Calling the constructor of child class of derived class!");
        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd2 = new ChildOfDerived(4, 5, 6);
    }
}
