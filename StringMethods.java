public class StringMethods {
    public static void main(String[] args) {
        String str = "Welcome to Java Programming";
        System.out.println(str);
        System.out.println();

        System.out.println("Using some String Methods:-");
        System.out.println("Length of the string: "+ str.length());
        System.out.println("Lowercase of the string: "+ str.toLowerCase());
        System.out.println("Uppercase of the string: "+ str.toUpperCase());
        System.out.println(str);

        String nonTrimmedStr = "     Hello World!     ";
        System.out.println("Non-trimmed String: "+ nonTrimmedStr);
        System.out.println("Trimmed String: "+ nonTrimmedStr.trim());

        System.out.println("Sub string: "+ str.substring(5));
        System.out.println("Sub string: "+ str.substring(5,12));

        String name = "Harry";
        System.out.println("Initial String: "+ name);
        System.out.println("Used Replace Method: "+ name.replace('r', 'p'));
        System.out.println("Used Replace Method: "+ name.replace("arry", "ello"));
        System.out.println("Used Replace Method: "+ name.replace("r", "ier"));

        System.out.println("startsWith(): "+ str.startsWith("Wel"));
        System.out.println("endsWith(): "+ str.endsWith("Wel"));

        System.out.println("charAt(): "+ str.charAt(5));
        System.out.println("indexOf('come'): "+str.indexOf("come"));

        String modifiedName = "Harryrry";
        System.out.println("indexOf() [fromIndex - 3]: "+ modifiedName.indexOf("rry", 3));
        System.out.println("indexOf('Pro'): "+ str.indexOf("Pro"));
        System.out.println("lastIndexOf('Pro'): "+ str.lastIndexOf("Pro"));

        System.out.println("equals('Harry'): "+ name.equals("Harry"));
        System.out.println("equals('harRy'): "+ name.equals("harRy"));
        System.out.println("equalsIgnoreCase(): "+ name.equalsIgnoreCase("harRy"));
        System.out.println();

        System.out.println("Escape Sequence Characters:");
        System.out.println("This \" is double quote and \' is single quote.");
        System.out.println("This \\ is backslash and \\\\ is double backslash. ");
        System.out.println("--> This \n is new line.");
        System.out.println("--> This \t is tab.");

    }
}
