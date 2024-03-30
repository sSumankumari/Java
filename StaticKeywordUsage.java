public class StaticKeywordUsage {
    // Static variable
    static int staticVariable = 10;

    // Non-static variable
    int nonStaticVariable = 20;

    // Static method
    static void staticMethod() {
        System.out.println("Inside static method. Static variable: " + staticVariable);
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("Inside non-static method. Non-static variable: " + nonStaticVariable);
    }

    public static void main(String[] args) {
        // Calling static method directly using class name
        StaticKeywordUsage.staticMethod();

        // Creating an object of the class to access non-static members
        StaticKeywordUsage obj = new StaticKeywordUsage();
        obj.nonStaticMethod();

        // Accessing static variable through object (not recommended)
        System.out.println("Accessing static variable through object: " + obj.staticVariable);

        // Accessing non-static variable directly using object
        System.out.println("Accessing non-static variable through object: " + obj.nonStaticVariable);
    }
}