import java.util.Scanner;

public class ArithmaticOperations {
    public static void main(String[] args) {
        System.out.println("Enter your operator (+,-,*,/): ");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();

        System.out.println("Enter your operands: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        switch (op) {
            case "+":
                System.out.println("Your operation: "+ (n1+n2));
                break;
            case "-":
                System.out.println("Your operation: "+ (n1-n2));
                break;
            case "*":
                System.out.println("Your operation: "+ (n1*n2));
                break;
            case "/":
                System.out.println("Your operation: "+ (n1/n2));
                break;
        }
    }
}
