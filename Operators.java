import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc_input = new Scanner(System.in);

        System.out.println("Enter your numbers: ");
        int a = sc_input.nextInt();
        int b = sc_input.nextInt();

        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        float div = a/b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        System.out.println("Difference of " + a + " and " + b + " is: " + diff);
        System.out.println("Multiplication of " + a + " and " + b + " is: " + mul);
        System.out.println("Division of " + a + " by " + b + " is: " + div);
        System.out.println("a % b = "+ a%b);

        System.out.println("Assignment Operators:");
        System.out.println(a*=6);
        System.out.println(b+=3);

        System.out.println("Comparision Operators:");
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a>=b);

        System.out.println("Logical Operators:");
        System.out.println(64>5 && 6<7);
        System.out.println(64>76 && 6<7);

        System.out.println(64>5 || 6<7);
        System.out.println(64>76 || 6<7);
        System.out.println(6==10 || 7<=5);

        System.out.println("Bitwise Operartors:");
        System.out.println("a&b --> "+ (a&b));
        System.out.println("a|b --> "+ (a|b));
    }
}
