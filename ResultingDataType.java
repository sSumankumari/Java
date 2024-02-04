public class ResultingDataType {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y+z;
        float b = 6.54f + x;
        System.out.println(a);
        System.out.println(b);

//        Increment and Decrement Operators
        int i = 56;
//        (i++) --> Firstly value is assigned then it is incremented.
//        (++i) --> Firstly value is incremented then it is assigned.

        System.out.println("Value before post increment operation: "+ i);
        System.out.println("Post Incremented value: "+ (i++));
        System.out.println("Value after post increment operation: "+ i);

        System.out.println("Pre Incremented value: "+ (++i));
        System.out.println("Value after pre increment operation: "+ i);

        System.out.println("Post Decremented value: "+ (i--));
        System.out.println("Value after post decrement operation: "+ i);

        System.out.println("Pre Decremented value: "+ (--i));
        System.out.println("Value after pre decrement operation: "+ i);

        int p = 7;
        int q = ++p * 8;

        System.out.println(q);

        char ch = 'a';
        System.out.println(++ch);
    }
}
