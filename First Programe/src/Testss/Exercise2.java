package Testss;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		
		int number, total;
		
		number = 4;
		
		total = number;
		System.out.print(number + "! = " +number + " x ");
		for (int loop = number - 1; loop >= 1; loop--) {
			System.out.print(loop);

			
			if (loop != 1) {
				System.out.print(" x ");
			} else {
				System.out.print(" = ");
				
			}
			
			total+=5;
			}
System.out.println(total);
	}

}
