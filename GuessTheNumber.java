import java.util.Random;
import java.util.Scanner;

class Game{
    public int num;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.num = rand.nextInt(0,15);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==num){
            System.out.format("Yes you guessed it right, it was %d.\nYou guessed it in %d attempts.", num, noOfGuesses);
            return true;
        }
        else if(inputNumber<0 || inputNumber>15) {
            System.out.println("Your input is out of range!");
        }
        else if(inputNumber<num){
            System.out.println("Too low...");
        }
        else if(inputNumber>num){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
