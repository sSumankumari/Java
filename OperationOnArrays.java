public class OperationOnArrays {
    public static void main(String[] args) {
        int [] marks = {98, 75, 89, 99, 80};

        System.out.println(marks.length);
        System.out.println(marks[0]);

        System.out.println("Displaying an Array!");
        for (int i=0; i<marks.length; i++) {
            System.out.println("Value at index "+ i +": "+ marks[i]);
        }

        System.out.println("Displaying an Array in reverse order!");
        for (int i=marks.length-1; i>=0; i--) {
            System.out.println("Value at index "+ i +": "+ marks[i]);
        }

        System.out.println("\n");
        System.out.println("Using For Each Loop!");

        for(int element: marks) {
            System.out.println(element);
        }
        System.out.println();

        float [] marks2 = {98.5f, 75.5f, 89.0f, 99.5f, 80.0f};
        float sum = 0;

        for (float element:marks2){
            sum = sum + element;
            System.out.println("Marks: "+ element);
        }
        System.out.println("The total marks obtained: "+ sum);
    }
}
