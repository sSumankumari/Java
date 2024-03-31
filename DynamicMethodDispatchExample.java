// Parent class
class Vehicle2 {
    // Method to display vehicle type
    void displayType() {
        System.out.println("This is a generic vehicle");
    }
}

// Child class Car inheriting from Vehicle
class Car2 extends Vehicle2 {
    // Overriding the displayType method for Car
    @Override
    void displayType() {
        System.out.println("This is a car");
    }
}

// Child class Bike inheriting from Vehicle
class Bike extends Vehicle2 {
    // Overriding the displayType method for Bike
    @Override
    void displayType() {
        System.out.println("This is a bike");
    }
}

public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        // Creating objects of Car and Bike classes
        Vehicle2 myCar = new Car2();
        Vehicle2 myBike = new Bike();

        // Calling the displayType method for Car and Bike objects
        myCar.displayType(); // Dynamic Method Dispatch (runtime polymorphism)
        myBike.displayType(); // Dynamic Method Dispatch (runtime polymorphism)
    }
}