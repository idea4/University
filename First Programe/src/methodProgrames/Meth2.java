package methodProgrames;

import java.util.Scanner;

public class Meth2 {

	public static void yearCalcualtion(int age) {
		
		int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		int time = 100-age+ year;
		
		
		System.out.println(time);
		}
	
	public static void printStar(int n){
	    
		if(n >0){
	        System.out.println("*");
	        printStar(n-1);
	    }
	}
	    
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yearCalcualtion(24);
	    
		printStar(4);
		
	
	
	

	

	}

}
