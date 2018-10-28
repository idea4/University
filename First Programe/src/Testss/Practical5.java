package Testss;

import java.util.Scanner;

public class Practical5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int ageInput;
		String nameInput;
		
		System.out.println("what is your age");
		ageInput = keyboard.nextInt();
		
		if(ageInput > 17 && !(ageInput < 0)) { System.out.println(" What is your name");
			
			nameInput =keyboard.next();
			System.out.printf("User name is %s" + "\nuser age is %d", nameInput, ageInput);
			
		} else if (ageInput < 17 && !(ageInput < 0)){ System.out.println("you are too young ");
		
		}else {System.out.println("Sorry dont recognise your input");
		}
		
}
}

