package methodProgrames;

import java.util.Scanner;

public class SecondMethod {
	
	
	public static void calculateYear(int age, String name) {
		
		int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		
		int time = year + 100 - age;
		System.out.println(time);
		
		
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		String na = scan.nextLine();
		
		
		calculateYear(input, na);
	}

}
