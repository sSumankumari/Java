// Abstract class representing a shape
abstract class Shape2 {
    public Shape2() {
        System.out.println("This is an abstract shape.");
    }
    abstract public double area();
    abstract public double perimeter();
}

// Concrete subclass Rectangle extending Shape
class Rectangle2 extends Shape2 {
    double length;
    double width;

    // Constructor to initialize length and width
    Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method calculateArea for Rectangle
    @Override
    public double area() {
        return length*width;
    }
    @Override
    public double perimeter() {
        return 2*(length + width);
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        // Creating an instance of Rectangle class
        Rectangle2 myRectangle = new Rectangle2(5.0, 3.0);

        System.out.println("Area of the rectangle: "+ myRectangle.area());
        System.out.println("Perimeter of the rectangle: "+ myRectangle.perimeter());
    }
}