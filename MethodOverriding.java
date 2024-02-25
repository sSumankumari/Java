class A{
    A(){
        System.out.println("This is the constructor of class A");
    }
    public int meth1(){
        return 2;
    }
    public void meth2(){
        System.out.println("This is the method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("This is the method 2 of class B");
    }
    B(){
        System.out.println("This is the constructor of class B");
    }
    public void meth3(){
        System.out.println("This is the method 3 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Method 1 of class A: "+ a.meth1());
        a.meth2();
        System.out.print("\n");

        B b = new B();
        b.meth2();
    }
}
