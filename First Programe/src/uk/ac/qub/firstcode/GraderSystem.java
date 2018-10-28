/**
 * 
 */
package uk.ac.qub.firstcode;

/**
 * @author edli
 *
 */
public class GraderSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int mark;
		mark = 80;
		
		if (mark >=50) { 
			System.out.println("Passed");   // dont need swirly brackets for one line of code 
			
		} else {
			System.out.println("Failed");
		}
// conditionla operator 
		
		int a, b, max;
		a =2;
		b =9;
		
		max = (a>b) ? a:b;
		System.out.println("Max is  " + max);
		
		System.out.println(mark>=50? "Passed": "Failed") ;
		
	}

}
