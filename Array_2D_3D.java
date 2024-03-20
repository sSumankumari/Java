public class Array_2D_3D {
    public static void main(String[] args) {
        // 2D - Array
        System.out.println("2D-Array: ");
        int [][] dimension2 = new int [2][3];
        dimension2[0][0] = 101;
        dimension2[0][1] = 102;
        dimension2[0][2] = 103;
        dimension2[1][0] = 201;
        dimension2[1][1] = 202;
        dimension2[1][2] = 203;

        for (int[] flat : dimension2) {
            for (int i : flat) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
        System.out.println("\n");


        // 3D - Array
        System.out.println("3D-Array: ");

        int [][][] dimension3 = new int[2][3][4];

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                for (int k=0; k<4; k++){
                    dimension3[i][j][k] = i+j+k;
                }
            }
        }

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                for (int k=0; k<4; k++){
                    System.out.print(dimension3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
