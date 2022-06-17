/* Author: Pedro Henrique Resende Ribeiro
 * Description: Factorial of numbers from 1 to 10
 * Date: 16/06/2022 - Hour: 00:16
 */

public class FactorialNumber {

	public static void main(String[] args) {
		
		int number, factorial;
		
		// Factorial is a variable that will accumulate the value
		
		factorial = 1;
		
		for (number = 1; number <= 10; number++) {
			
			factorial *= number;
			System.out.println("Factorial of " + number + " is " + factorial);
			
		}

	}

}
