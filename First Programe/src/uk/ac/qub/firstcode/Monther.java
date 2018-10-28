package uk.ac.qub.firstcode;

public class Monther {

	public static void main(String[] args) {
		
		int month;
		month = 2;
		
		switch (month) {
		
		case 1: 
		case 2:			// fall through 
		case 12:
			System.out.println("Winter");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("Spring");
			
		}

	}

}
