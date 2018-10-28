package uk.ac.qub.firstcode;
// java doc comment 

//we need to import java scanner class
import java.util.Scanner;

public class votee {

	public static void main(String[] args) {
		
		// initialize variables for inputAge
		int inputAge;   
		
		// Prompt
		System.out.println("what is your age?");
		
		//create scanner input for user 
		Scanner scanner = new Scanner(System.in);
		
		// needs to find next int
		inputAge = scanner.nextInt();
		
		
		// boolean statements for user to see if they are allowed to vote
		if(inputAge >=18) { System.out.println("You can vote");
		
		} else { System.out.println("You are too young to vote");
		
		}
		// don't want to allow code leaking 
		scanner.close();
		

		
	}

}
