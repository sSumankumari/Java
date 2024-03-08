package mypackage1;

//import java.util.Scanner;
import java.util.*;

public class MyPackage {
    public static void main(String[] args) {
        System.out.println("This is the main method of the class 'MyPackage'!");
        System.out.println("Importing Scanner!");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        java.util.Scanner sc1 = new java.util.Scanner(System.in);
        int b = sc1.nextInt();

        System.out.println("Taking input as "+ a);
        System.out.println("Taking input as "+ b);

    }
}