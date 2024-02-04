import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String name = new String("Suman");
        System.out.print("The name is: ");
        System.out.println(name);

        String str1 = "Hello World!";
        String str2 = "Welcome to Java Programming";
        System.out.printf(str1);
        System.out.println(str2);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and the value of b is %f.", a, b);
        System.out.format("The value of a is %d and the value of b is %.2f.", a, b);
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str3 = sc.nextLine();
        System.out.println(str3);

        System.out.println("Enter your string: ");
        String str4 = sc.next();
        System.out.println(str4);

    }
}
