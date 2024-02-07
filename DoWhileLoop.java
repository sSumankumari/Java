public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Using Do While Loop!");

        int a = 0;

        do {
            System.out.println("Iteration no.: "+ a);
            a++;
        }while (a<6);

        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while (b<5);

        System.out.println("Printing first 30 natural numbers!");

        int num = 1;
        do {
            System.out.print(num + "\t");
            num++;
        }while (num<=30);
    }
}
