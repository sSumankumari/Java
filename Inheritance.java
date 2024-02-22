class Base{
    int x;
    public void setX(int x){
        System.out.println("I'm in Base class and setting the value of x");
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public void printMe(){
        System.out.println(("I'm a constructor"));
    }
}
class Derived extends Base{
    int y;
    public void setY(int y){
        System.out.println("I'm in Derived class and setting the value of y");
        this.y = y;
    }
    public int getY(){
        return y;
    }
}
class Animal{
    public void animalFunc(){
        System.out.println("This is an animal. It can be either domestic or wild animal.");
    }
}
class Dog extends Animal{
    public void dogFunc(){
        System.out.println("Dog Barks and it is a domestic animal.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Creating and using Base class object!");
        Base b = new Base();
        b.setX(5);
        System.out.println("Value of x: "+ b.getX());
        System.out.print("\n");

        System.out.println("Creating and using Derived class object!");
        Derived d = new Derived();
        d.setX(5);
        System.out.println("Value of x: "+ d.getX());
        d.setY(10);
        System.out.println("Value of y: "+ d.getY() +"\n");

        Dog myDog = new Dog();
        System.out.println("Function of Animal class: ");
        myDog.animalFunc();
        System.out.println("Function of Dog class: ");
        myDog.dogFunc();
    }
}
