class BaseClass {
    BaseClass() {
        System.out.println("Constructor of Base class");
    }

    BaseClass(int a) {
        System.out.println("Overloaded constructor of Base class: " + a);
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        super(5); // Calls the overloaded constructor of Base1
        System.out.println("Constructor of Derived class");
    }

    DerivedClass(int x, int y) {
        System.out.println("Overloaded constructor of Derived class: " + x + ", " + y);
    }
}

class ChildOfDerived2 extends DerivedClass {
    ChildOfDerived2() {
        System.out.println("Constructor of ChildOfDerived");
    }

    ChildOfDerived2(int x, int y, int z) {
        super(x, y); // Calls the constructor of Derived1 with parameters x and y
        System.out.println("Overloaded Constructor of ChildOfDerived: " + x + ", " + y + ", " + z);
    }
}

public class Constructors2 {
    public static void main(String[] args) {
        System.out.println("Creating objects:");
        System.out.println("-----------------");

//        BaseClass b = new BaseClass();
//        BaseClass b2 = new BaseClass(2);
//        System.out.println();
//
//        DerivedClass d = new DerivedClass();
//        DerivedClass d2 = new DerivedClass(2, 10);
//        System.out.println();

        ChildOfDerived2 cd = new ChildOfDerived2();
        System.out.println();
        ChildOfDerived2 cd2 = new ChildOfDerived2(4, 5, 6);
    }
}
