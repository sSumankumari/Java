import java.sql.SQLOutput;

public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Break and Continue using Loops!");

        for (int i=0; i<5; i++) {
            System.out.println(i);
            System.out.println("Java is great!");
            if (i==2){
                System.out.println("Break used: Ending the loop");
                break;
            }
        }

        int i=0;
        do{
            System.out.println("Iteration no.: "+ i);
            if(i==3){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }while (i<5);

        System.out.println("Loop ends here"+ "\n");

        for(int j=0; j<10; j++) {
            if(j%2 == 0) {
                System.out.println(j +" is even no.");
                continue;
            }
            System.out.println("Iteration no.: "+ j);
        }
        System.out.println();

        int j=0;
        do{
            j++;
            if(j==3){
                System.out.println("Continue from next iteration");
                continue;
            }
            System.out.println("Iteration no.: "+ j);
        }while (j<5);
    }
}
