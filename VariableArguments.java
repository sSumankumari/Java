public class VariableArguments {
//    static int mySum(int a, int b) {
//        return a+b;
//    }
//    static int mySum(int a, int b, int c) {
//        return a+b+c;
//    }
//    static int mySum(int a, int b, int c, int d) {
//        return a+b+c+d;
//    }

    // This function can be used as Union of all the above functions
    static int mySum(int x, int ...arr) {
        // Available as int [] arr;
        int res = 0;
        for (int a: arr){
            res += a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Variable Arguments");

//        System.out.println("The sum of Nothing: "+ mySum()); // --> This will throw an error bcoz the function requires atleast one argument.
        System.out.println("The sum of given single number: "+ mySum(10));

        System.out.println("The sum of given numbers: "+ mySum(10, 5));
        System.out.println("The sum of given numbers: "+ mySum(10, 5, 6));
        System.out.println("The sum of given numbers: "+ mySum(10, 5, 6, 7));
        System.out.println("The sum of given numbers: "+ mySum(10, 5, 6, 7, 2));

    }
}
