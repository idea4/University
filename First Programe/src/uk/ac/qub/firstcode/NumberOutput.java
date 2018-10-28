/**
 * 
 */
package uk.ac.qub.firstcode;

/**
 * @author edli
 *
 */
public class NumberOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num;
		num = 1;

		switch (num) {
		case 1:
			System.out.println("One");
			break;                                 // o break we get fall through
			
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;

		default:
			System.out.println("Duff number! Try again");
			
			System.out.println(2 % 2);

			// waht does break so
			/// waht colon mean

		}

	}

}
