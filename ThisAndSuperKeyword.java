class Class1{
    int a;
    int b;
    Class1(int v){
        a = v;
        System.out.println("Constructor of Class1");
    }
    Class1(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public int getA(){
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class Class2 extends Class1{
    Class2(int c){
        super(c);
        System.out.println("This is the constructor of Class2");
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        Class1 c1 = new Class1(5);
        System.out.println("Value of v: "+ c1.getA());

        // Using 'this' keyword
        Class1 c1this = new Class1(6, 8);
        System.out.println("Value of a: "+ c1this.getA() +" and value of b: "+ c1this.getB());

        // Using 'super' keyword
        Class2 c2 = new Class2(1);
        System.out.println(c2.getA());
    }
}
