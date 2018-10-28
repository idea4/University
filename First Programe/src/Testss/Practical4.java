package Testss;

import java.util.Scanner;

public class Practical4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		
		System.out.println("enter your mark... ");
		
		double input;
		
		do {
		input = keyboard.nextDouble();
		
		if(input <=49) { System.out.println("fail"); 
		
		
		} else if  (input >=50 && input <=59 ) { System.out.println("pass"); }
		
		else if (input >=60 && input <=69) System.out.println("Merit");
		
	else if (input >= 70 && input <=100) System.out.println("Distinction");
		
	else { System.out.println("wrong input"); 
	
	}
		
		System.out.println("enter again");
		} while (input != 000);
		
		System.out.println("enter again");

	}

}

