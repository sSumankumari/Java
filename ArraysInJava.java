public class ArraysInJava {
    public static void main(String[] args) {
        System.out.println("Creating Arrays!");
        // 1. Declaration along with Memory Allocation method
//        int [] marks = new int[5];
        // 2. Declaration and then Memory Allocation
        int [] marks;
        marks = new int[5];

        // Initialization
        marks[0] = 100;
        marks[1] = 70;
        marks[2] = 78;
        marks[3] = 89;
        marks[4] = 92;

        System.out.println("Value at index 2: "+ marks[2]);
        System.out.println("Value at index 4: "+ marks[4]);

        marks[4] = 96;
        System.out.println("New Value at index 4: "+ marks[4]);

        // 3. Declaration, Memory Allocation and Initialization together
        String [] sub = {"Maths", "Physics", "Chemistry", "English", "Informatics Practices"};

        System.out.println("Subject 1: "+ sub[0]);
        System.out.println("Subject 2: "+ sub[1]);
        System.out.println("Subject 3: "+ sub[2]);
        System.out.println("Subject 4: "+ sub[3]);
        System.out.println("Subject 5: "+ sub[4]);

    }
}
