interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleInterface{
    MySampleClass(){
        System.out.println("Calling the Constructor of MySampleClass");
    }
    @Override
    public void meth1() {
        System.out.println("This is method 1");
    }
    public void meth2() {
        System.out.println("This is method 2");
    }

    public void meth3() {
        System.out.println("This is method 3");
    }
    public void meth4() {
        System.out.println("This is method 4");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass sam = new MySampleClass();
        sam.meth1();
        sam.meth2();
        sam.meth3();
        sam.meth4();
    }
}
