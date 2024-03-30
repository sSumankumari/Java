public class ArrayReversal {
    public static void reverseArray(int[] arr) {
        int start=0;
        int end= arr.length-1;

        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num: arr){
            System.out.print(num + "\t");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array: ");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Reversed Array: ");
        printArray(arr);
    }
}
