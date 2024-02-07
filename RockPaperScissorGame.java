import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc_input = new Scanner(System.in);
        System.out.println("Welcome to Play!");
//        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
//        int userInput = sc_input.nextInt();
//
//        Random random = new Random();
//        int computerInput = random.nextInt(3);
//
//        // System.out.println("Computer choice: "+ computerInput);
//        if(computerInput==0){
//            System.out.println("Computer choice: Rock");
//        }
//        else if(computerInput==1){
//            System.out.println("Computer choice: Paper");
//        }
//        else if(computerInput==2){
//            System.out.println("Computer choice: Scissors");
//        }
//
//        if (userInput == computerInput) {
//            System.out.println("Draw");
//        } else if ((userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0) || (userInput == 2 && computerInput == 1)) {
//            System.out.println("You Win!");
//        } else {
//            System.out.println("Computer Win!");
//        }

        System.out.println("Want to play the game: (1 for yes & 0 for no)");
        int play = sc_input.nextInt();

        if (play == 1) {
            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
            int userInput = sc_input.nextInt();

            Random random = new Random();
            int computerInput = random.nextInt(3);

            // System.out.println("Computer choice: "+ computerInput);
            if(computerInput==0){
                System.out.println("Computer choice: Rock");
            }
            else if(computerInput==1){
                System.out.println("Computer choice: Paper");
            }
            else if(computerInput==2){
                System.out.println("Computer choice: Scissors");
            }

            if (userInput == computerInput) {
                System.out.println("Draw");
            } else if ((userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0) || (userInput == 2 && computerInput == 1)) {
                System.out.println("You Win!");
            } else {
                System.out.println("Computer Win!");
            }
        }
        else {
            System.out.println("You can't play!");
        }

    }
}
