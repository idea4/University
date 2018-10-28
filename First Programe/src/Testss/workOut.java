package Testss;
import java.util.Scanner;

public class workOut {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

		//// 5 sets
		
		int total=0;
		
			
			for (int x=0;x<5;x++) {
			System.out.println("Menu");
			System.out.println("1. Do set");
			System.out.println("2. Skip set");
			System.out.println("3. Quit Programme");
			
		do {System.out.println("set" + x);
	//	int input = 0;
			int input = scan.nextInt();
			
			if(input== 2) {
				System.out.println("Set Skipped");
				continue;
			
			}else if(input== 1) {
				System.out.println("Set Done");
				total=total+5;
				System.out.println("number of reps =" + total);
				
			}else {System.out.println("Quit");
			
			break;
			
			}
			scan.close();
			
			
			
		
		}while(x==5);
		
			}
	}

}
