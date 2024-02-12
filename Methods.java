import java.util.Scanner;

public class Methods {
    static int logic(int x, int y) {
        int res;
        if(x>y){
            res = (x+y)%2;
        }
        else {
            res = (x+y)*2;
        }
        return res;
    }

    int mySum(int n) {
        int sum = 0;

        for (int i=0; i<=n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = (a+b)*5;
        System.out.println(c);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your numbers to call logic method: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1 + n2);

        System.out.println("Method Call: "+ logic(n1, n2));

        System.out.println("Enter your range to sum the numbers: ");
        int range = sc.nextInt();

        // Object Creation of Methods
        Methods SumObj = new Methods();

        int Sum = SumObj.mySum(range);
        System.out.println("Calling 'mySum' method: "+ Sum);
    }
}
