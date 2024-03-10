public class JaggedArray {
    public static void main(String[] args) {
        System.out.println("Jagged array is a type of array in which the members are of different sizes.");
        System.out.println("Creating a jagged array!");

        int arr[][] = {{1,2,3,4,5}, {2,3,4}, {7,8,9,0}, {2,8}};

        for (int x[]:arr) {
            for (int y:x) {
                System.out.print(y + "\t");
            }
            System.out.print("\n");
        }
    }
}
