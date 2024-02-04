public class OperatorPrecedence {
    public static void main(String[] args) {
        int p = 6*5-34/2;
        /*
        Highest precedence goes to * and / and they are evaluated on the basis of 'left to right' associativity.
            =30-34/2
            =30-17
            =13
        */
        int q = 60/5-34*2;
        /*
            =12-34*2
            =12-68
            =-56
        */

        System.out.println(p);
        System.out.println(q);

        int x = 6, y = 1;
        int op1 = x * y/2;
        System.out.println("Operation 1: "+ op1);

        int a=5, b=1, c=4;
        int op2 = b*b - (4*a*c)/(2*a);
        System.out.println("Operation 2: "+ op2);

        int op3 = (b*b - 4*a*c)/2*a;
        System.out.println("Operation 3: "+ op3);
    }
}
