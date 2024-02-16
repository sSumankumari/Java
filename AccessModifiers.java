class MyEmployee {
    private int id;
    private String name;
    // Setters
    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
        this.name = n;
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}

class Circle{
    private double radius;
    private double area;
    private double circumference;

    public void setRadius(double r){
        this.radius = r;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        this.area = 3.14 * radius * radius;
        return area;
    }

    public double getCircumference(){
        this.circumference = 2 * 3.14 * radius;
        return circumference;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 1001;
        // harry.name = "CodeWithHarry"; // --> Throws an error due to private access modifier

        harry.setId(1001);
        System.out.println("Id: "+ harry.getId());
        harry.setName("CodeWithHarry");
        System.out.println("Name: "+ harry.getName());
        System.out.print("\n");

        System.out.println("Setting the radius of a circle to find its area & circumference!");
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Radius: "+ c1.getRadius());
        System.out.println("Area: "+ c1.getArea());
        System.out.println("Circumference: "+ c1.getCircumference());
    }
}
