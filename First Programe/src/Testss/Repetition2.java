package Testss;

import java.util.Scanner;
public class Repetition2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your full name");
		String name = scan.nextLine();
		
	
	int wordLength = name.length();
	
	for ( int x =0; x<wordLength; x++ ) {
		
		char c = name.charAt(x); 
		

		if (c == 'a' || 
			    c == 'e' || 
			    c == 'd' || 
			    c == 'l' || 
			    c == 'u') {
			    c = Character.toUpperCase(c);}
		
		System.out.print(c);
		
		
	}
	
	
	
	

	
	}

	}


