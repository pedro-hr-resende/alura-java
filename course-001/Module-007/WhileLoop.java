/* Author: Pedro Henrique Resende Ribeiro
 * Description: While loop
 * Date: 15/06/2022 - Hour: 22:50
 */

public class WhileLoop {

	public static void main(String[] args) {

		int number = 0;
		int sum = 0;
		
		// Printing numbers from 0 to 10
		
		while (number <= 10) {

			System.out.print(number + " ");
			number++;

		}
		
		number = 0;
		
		// Adding numbers from 0 to 10
		
		while (number <= 10) {
			
			sum += number;
			number++;
			
		}
		
		System.out.println("\nThe sum from 0 to 10 is " + sum);

	}

}
