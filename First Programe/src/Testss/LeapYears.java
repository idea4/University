package Testss;

import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x =1;
		do { System.out.println("What is your age? ");
		int input =scan.nextInt();
			
		if(input>=1 && input<=30) {
			System.out.println("You are too young");}
		
		
		else if (input >=31 && input<=60) {
			System.out.println("You are getting on!");
		}
		
		else if(input>= 61 && input<=120) {
			System.out.println("You look amazing for your age!");
			
		}else { System.out.println("wRONG INPUT");}
		
		
		
		
		}while (x==1);
	

}
}
