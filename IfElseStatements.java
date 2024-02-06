import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
//        int age = 6;
        Scanner sc_input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc_input.nextInt();

        if(age>18 && age<60) {
            System.out.println("Your age is above 18, you are eligible to drive.");
        }
        else if (age>60){
            System.out.println("Your age is above 60, it's not safe for you to drive.");
        }
        else if (age == 18) {
            System.out.println("You age is equal to 18, now you are eligible to drive.");
        }
        else {
            System.out.println("Your age is below 18, you are not eligible to drive.");
        }
    }
}
