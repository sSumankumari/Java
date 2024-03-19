class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 72;

    public void meth1(){
        System.out.println("This is the method for class C1");

        System.out.println("The value of public variable (x): "+ x);
        System.out.println("The value of protected variable (y): "+ y);
        System.out.println("The value of default variable (z): "+ z);
        System.out.println("The value of private variable (a): "+ a);

    }
}
class C2 extends C1{
    public void meth2() {
        System.out.println("This is the method for class C2");

        System.out.println("The value of public variable (x): " + x);
        System.out.println("The value of protected variable (y): " + y);
        System.out.println("The value of default variable (z): " + z);
//        System.out.println("The value of private variable (a): " + a); --> Can't access private member in the sub-class
    }
}

public class AccessModifiers2 {
    public static void main(String[] args) {
        C1 c1 = new C1();
//        c1.meth1();
        System.out.println("The value of public variable (x): "+ c1.x);
        System.out.println("The value of protected variable (y): "+ c1.y);
        System.out.println("The value of default variable (z): "+ c1.z);
//        System.out.println("The value of private variable (a): "+ c1.a); --> will throw an error bcz of private access modifier

        C2 c2 = new C2();
        c2.meth2();
    }
}

/*
Access Modifier	    within class	  within package	  outside package by subclass only	   outside package

public	                  Y	                Y	                         Y	                        Y
protected	              Y	                Y	                         Y	                        N
Default	                  Y	                Y                            N                          N
private	                  Y	                N	                         N	                        N

 */