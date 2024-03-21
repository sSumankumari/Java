public class CommandLine {
	public static void main(String[] args) 
	{
//		System.out.println("First argument is: "+args[0]);
//		System.out.println("Second argument is: "+args[1]);
//		System.out.println("Third argument is: "+args[2]);

		for (int i=0; i<args.length; i++) {
			System.out.println("Argument "+ i +" is: "+ args[i]);
		}
 	}
}
