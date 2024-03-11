public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {25, 90, 78, 67, 2, 14, 45};

        int maxElement = findMax(arr);

        System.out.println("Largest Element from the array: "+ maxElement);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
