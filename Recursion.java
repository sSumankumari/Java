import java.util.Scanner;

public class Recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    static int factorialIterative(int n) {
        if(n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++) {
                product *= i;
            }
            return product;
        }
    }

    static int fibonacci(int n){
        if(n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        // factorial(0) = factorial(1) = 1
        // factorial(n) = n * (n-1) * (n-2) * ...1
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        // factorial(n) = n * factorial(n-1)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to find its factorial:");
        int num = sc.nextInt();

        System.out.println("The value of factorial "+ num + " is: "+ factorial(num));

        System.out.println("Finding the factorial of a number by using iterative approach!");
        System.out.println("The value of factorial "+ num + " is: "+ factorialIterative(num));

        System.out.println("\n");
        System.out.println("Fibbonacci Sequence!");

        System.out.println("Enter your number to find its fibonacci value:");
        int n = sc.nextInt();
        System.out.println("The fibonacci sequence value of "+ n + " is: "+ fibonacci(n));

    }
}
