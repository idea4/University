package Testss;

import java.util.Scanner;

public class Practical6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String input, conservative, labour;
		conservative = "con";
		labour = "lab";
		
		System.out.println("voting... \nEneter 'con' for Conservative or 'lab' for labour");
		
		input = keyboard.nextLine();
		
		if(input.equals(conservative)) { System.out.println("Vote registered for Conservative");
		
		}else if ( input.equals(labour)) System.out.println("Vote registed for Labour");
		else System.out.println("not recognised");}
		
}
	


