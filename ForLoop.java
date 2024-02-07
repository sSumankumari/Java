import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Using For Loop!");

        for (int i=0; i<=10; i++) {
            System.out.println("Interation no.: "+ i);
        }

        System.out.println("Printing First n odd numbers!");
        int n = 10;

        for (int num = 0; num<n; num++){
            System.out.print(2*num+1 + "\t");
        }
        System.out.println("\n");

        System.out.println("Decrementing For Loop!");
        for (int i=5; i!=0; i--){
            System.out.println(i);
        }

        System.out.println("Printing first n natural numbers in reverse order!");
        int n2 = 20;

        for (int i = n2; i!=0; i--){
            System.out.print(i + "\t");
        }
    }
}
