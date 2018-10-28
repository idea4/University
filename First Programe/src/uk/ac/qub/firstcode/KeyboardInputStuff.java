package uk.ac.qub.firstcode;
//import statements
import java.util.Scanner;
/**
 * Java doc
 *class is going to interact with the user
 * @author edli
 *
 */
public class KeyboardInputStuff {
	/**
	 * Method gets the users name and ouput the hello message 
	 * @param args
	 */
	
	

	public static void main(String[] args) {
		// decalre a var before the method 
		String usersName; 		
		
		// get the scanner
		Scanner scanner = new Scanner(System.in);
		
		//output message of hello and prompt for users name 
		System.out.println("hello, what is your name?");
		
		// get the user's name
		usersName= scanner.next();
		System.out.println("Hello there " + usersName);
		
		// output messafe with the users name 
		
		
		
		

	}

}
