/**
 * 
 */
package Testss;

/**
 * @author edli
 *
 */
public class Tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testScore;
		char grade;

		grade = 'F';
		testScore = 73;

		if (testScore >= 90) {
			grade = 'A';

		} else if (testScore > +80) {
			grade = 'B';
		} else if (testScore >= 70) {
			grade = 'c';
		} else {
			System.out.println('F');
		}

		System.out.println("Grade = " + grade);
		
		System.out.println(34 % 9); // this gives you a remainder 
		
		
		}

	}




// && and
// || or
// ?: Ternary (short  hand for if then else statements)   
// if we are comparing Strings, we use gender.equals ()


// eaulity operators == and !-
// what does % mean 