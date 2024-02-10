public class MultidimensionalArrays {
    public static void main(String[] args) {
        int [] arr; // 1-D array
        int [][] flats; // 2-D array
        flats = new int[2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("Printing a 2-D array using For-loop!");
        for (int i=0; i<flats.length; i++) {
            for (int j=0; j<flats[i].length; j++) {
                System.out.print(flats[i][j] +"\t");
            }
            System.out.println("");
        }
        System.out.println();

        System.out.println("Creating a 3-D array!");
//        String [][][] arr_3d = new String[2][3][4];
        String [][][] arr_3d = {{{"a1","b1","c1","d1"}, {"a2","b2","c2","d2"}, {"a3","b3","c3","d3"}}, {{"p1","q1","r1","s1"}, {"p2","q2","r2","s2"}, {"p3","q3","r3","s3"}}};

        for (int i=0; i<arr_3d.length; i++) {
            for (int j=0; j<arr_3d[i].length; j++) {
                for (int k=0; k<arr_3d[i][j].length; k++) {
                    System.out.print(arr_3d[i][j][k] +"\t");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
