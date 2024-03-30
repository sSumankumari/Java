// Parent class
class Shape {
    // Method to calculate area (default implementation)
    void calculateArea() {
        System.out.println("Area calculation not implemented for generic shape");
    }
}

// Child class inheriting from Shape
class Circle2 extends Shape {
    double radius;

    // Constructor to initialize radius
    Circle2(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method for Circle
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " units: " + area + " square units");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating an instance of Circle class
        Circle2 myCircle = new Circle2(2.0);

        // Calling the overridden calculateArea method of the Circle class
        myCircle.calculateArea();
    }
}
