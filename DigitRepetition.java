import java.util.Scanner;

public class DigitRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number 'n'
        System.out.print("Enter the number (n): ");
        long n = scanner.nextLong();

        // Taking input for the digit 'd'
        System.out.print("Enter the digit (d): ");
        long d = scanner.nextLong();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the occurrence of digit 'd' in number 'n'
        int count = countDigitOccurrences(n, d);

        // Display the result
        System.out.println("The digit " + d + " occurs " + count + " times in the number " + n + ".");
    }

    // Function to count the occurrence of a digit in a number
    private static int countDigitOccurrences(long number, long digit) {
        int count = 0;

        while (number != 0) {
            long remainder = number % 10;
            if (remainder == digit) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
}
