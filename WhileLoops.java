import javax.sound.midi.Soundbank;

public class WhileLoops {
    public static void main(String[] args) {
        System.out.println("Using While Loop!");
        int i = 1;
        while (i<=3) {
            System.out.println("Iteration no.: "+ i);
            i++;
        }

        System.out.println("Finish Running While Loop!");

//        while(true){
//            System.out.println("Running Infinite While Loop!");
//        }

        System.out.println("Printing Natural numbers from 100 to 200");
        int num = 100;

        while (num<=200) {
            System.out.print(num + "\t");
            num++;
        }
    }
}
