package uk.ac.qub.firstcode;

import java.util.Scanner;

/**
 *   java doc comments 
 * @author edli
 *
 */
public class shoesIZE {  // uppercase and lowercase

	public static void main(String[] args) {
		// creating var to hold shoe size
		
		//hard coded 
		
		double shoesize;    // lowercase first letter
		String name="Edward's";
		
		System.out.println("What is your size?");
		
	 Scanner scanner = new Scanner(System.in);
	 shoesize = scanner.nextDouble();	 
	 
	 if(shoesize>6) {
			System.out.println("Adult section");
			
		} // end of if statement 
		
		if(shoesize<=6) {
			System.out.println("Children Section");
	 
		
		
		
		
			
		} // end of if statement 
		
		scanner.close();   /// resource leak 

	}
}


