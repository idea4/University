
package Testss;
import java.util.Scanner;
import java.lang.Math;

public class Practical3 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a decimal point number in the format xx.xxxx rg 12.3456");
		
		Scanner keyboard = new Scanner(System.in); 
		
		double input = keyboard.nextDouble();
		
		
		System.out.printf("number rounded (two decimal places): %.2f" , input );
		
		double squared = input * input; 
		System.out.printf("\nNumber squared (three decimal places): %.3f" , squared);
		
		double cubed = input * squared;
		System.out.printf("\nNumber cubed to (three decimal places): %.3f", cubed);
		
		double root = Math.sqrt(input);
		System.out.printf("\nSquare root (four decimal places): %.4f ", root);

				
	}

}
