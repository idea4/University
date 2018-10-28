package Testss;

import java.util.Scanner; /// ctrl space 

public class MenoDemo {

	public static void main(String[] args) {
	// vars
		Scanner scanner = new Scanner(System.in);
		int userOption;
		
		int x =1;
		// loop start
		
		
		// draw menu on screen
		do {
		System.out.println("1. File");
		System.out.println("2. Edit");
		System.out.println("3. Print");
		System.out.println("4. Exit");
		// prompt user 
		
		System.out.println("Enter option.......");
		
		
		// Read in user option
		
		userOption = scanner.nextInt();
		
			switch (userOption) {
			case 1:
				System.out.println("File ok");
				break;
			case 2:
				System.out.println("Edit ok");
				break;
			case 3:
				System.out.println("Print ok");
				break;
			case 4:
				System.out.println("exit");
				break;
			default:
				System.out.println("Wrog user input");
			}
		
		
		
		
		// Process it 
		
		//end
		// exit
		
		}while (userOption!=4);
		
		scanner.close();
	}

}
