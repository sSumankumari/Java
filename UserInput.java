import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Inputs from the User");
        Scanner sc_input = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc_input.nextInt();
        System.out.println("Enter number 2:");
//        int b = sc_input.nextInt();
        float b = sc_input.nextFloat();
//        int sum = a + b;
        float sum = a + b;

        System.out.println("The sum the given input numbers is: " + sum);
        System.out.println("Enter your bool value: ");
        boolean b1 = sc_input.hasNextBoolean();
        System.out.println(b1);
    }
}
