import java.util.Scanner;

public class SwitchCaseStatements {
    public static void main(String[] args) {
        int age;
        Scanner sc_input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = sc_input.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }

        System.out.println("Thanks for using my code!");
    }
}
