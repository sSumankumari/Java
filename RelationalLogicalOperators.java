public class RelationalLogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        System.out.println("For Logical And (&&): ");
        if (a && c){
            System.out.println("Both are having true value");
        }
        else {
            System.out.println("At least one of them have false value");
        }

        if (a && c && b){
            System.out.println("All are having true value");
        }
        else {
            System.out.println("At least one of them have false value");
        }

        System.out.println("For Logical OR (||): ");
        if (a || c){
            System.out.println("At least one of them have true value");
        }
        else {
            System.out.println("All are having false values");
        }

        if (a || c || b){
            System.out.println("At least one of them have true value");
        }
        else {
            System.out.println("All are having false values");
        }

        System.out.println("For Logical NOT (!): ");
        System.out.println("Value of a is: "+ a);
        System.out.println("Value of NOT(a) is: "+ (!a));
    }
}
