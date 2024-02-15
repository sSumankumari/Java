class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is: "+ id);
        System.out.println("and my name is: "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Creating my own Custom Class!");

        Employee john = new Employee(); // Instantiating a new Employee object
        Employee william = new Employee();

        // Setting Attributes
        john.id = 12;
        john.name = "John Khandelwal";
        john.salary = 34;

        william.id = 18;
        william.name = "James William";
        john.salary = 29;

        // Printing the Attributes
        System.out.println("ID: "+ john.id + ", Name: "+ john.name);

        // Using member functions of the Employee class
        john.printDetails();
        william.printDetails();
        int salary = john.getSalary();
        System.out.println("Salary of "+ john.name + " is: "+ salary +" thousands");

    }
}
