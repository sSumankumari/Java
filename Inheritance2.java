// Parent class
class Vehicle {
    String brand;

    // Method to set vehicle brand
    void setBrand(String brand) {
        this.brand = brand;
    }

    // Method to display vehicle brand
    void displayBrand() {
        System.out.println("Brand of Vehicle: " + brand);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    int wheels;

    // Method to set number of wheels
    void setWheels(int wheels) {
        this.wheels = wheels;
    }

    // Method to display number of wheels
    void displayWheels() {
        System.out.println("Number of Wheels: " + wheels);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car();

        // Setting vehicle brand and number of wheels
        myCar.setBrand("Toyota");
        myCar.setWheels(4);

        // Displaying vehicle brand and number of wheels
        myCar.displayBrand();
        myCar.displayWheels();
    }
}