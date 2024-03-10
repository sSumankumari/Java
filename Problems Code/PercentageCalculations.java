import java.util.Scanner;

public class PercentageCalculations {
    public static void main(String[] args){
        System.out.println("Enter your marks: ");

        Scanner sc_input = new Scanner(System.in);

        System.out.println("Enter marks of subject 1: ");
        byte m1 = sc_input.nextByte();
        System.out.println("Enter marks of subject 2: ");
        byte m2 = sc_input.nextByte();
        System.out.println("Enter marks of subject 3: ");
        byte m3 = sc_input.nextByte();
        System.out.println("Enter marks of subject 4: ");
        byte m4 = sc_input.nextByte();
        System.out.println("Enter marks of subject 5: ");
        byte m5 = sc_input.nextByte();

        double marks_obtained = (m1+m2+m3+m4+m5);
        System.out.println("Your total marks obtained: " + marks_obtained);
        double total_marks = 500;

        double percentage = (marks_obtained / total_marks) * 100;

        System.out.println("Percentage of your overall subject marks: " + percentage + "%");
    }
}
