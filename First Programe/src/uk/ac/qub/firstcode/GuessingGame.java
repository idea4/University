package uk.ac.qub.firstcode;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		
		int randomInt;
		Scanner scan = new Scanner(System.in);
		
		
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(11);
		
		int x =1;
		int input;
		
		System.out.println("Guess a number between 0 and 10");
		do {input = scan.nextInt() ;	
		
			
		if (input == randomInt) { 
			System.out.println("Your guess is correct");
			System.out.println("Guess again from 0 -10");
			randomInt =randomGenerator.nextInt(11);
			
		} else if (input < randomInt) { 
			System.out.println("Guess higher");
		} else {System.out.println("Guess lower");
		}
		
		} while (x ==1);
		
		}
			

		
		
			
		

	}


