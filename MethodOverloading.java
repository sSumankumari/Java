public class MethodOverloading {
    static void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    static void change(int a){
        a = 90;
    }

    static void changeArr(int [] arr) {
        arr[0] = 98;
    }

    static void greet(){
        System.out.println("Good Morning!");
    }

    static void greet(String name){
        System.out.println("Good Morning "+ name + "!");
    }

    static void greet(String name1, String name2){
        System.out.println("Good Morning "+ name1 + " and " + name2 + "!");
    }

    public static void main(String[] args) {
        tellJoke();

        // Changing the Integer
        int x = 45;
        change(x);
        System.out.println("Value of 'x' after running change() method: "+ x);

        // Changing the Array value
        int [] marks = {78, 87, 77, 98, 67};
        changeArr(marks);
        // The reference of marks array is passed to changeArr() method
        System.out.println("Value of 'marks[0]' after running changeArr() method: "+ marks[0]);

        // Method Overloading
        greet();
        String name = "John";
        greet(name);

        String name1 = "John", name2 = "Harry";
        greet(name1, name2);
    }
}
