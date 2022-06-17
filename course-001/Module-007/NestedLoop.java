/* Author: Pedro Henrique Resende Ribeiro
 * Description: Nested for loop
 * Date: 15/06/2022 - Hour: 23:30
 */

public class NestedLoop {

	public static void main(String[] args) {
		
		for (int multiplier = 1; multiplier <= 10; multiplier++) {
			
			for (int number = 1; number <= 10; number++) {
			
				System.out.print(multiplier * number);
				System.out.print(" ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		// Printing a triangle
		
		for (int line = 0; line < 10; line++) {
			
			for (int column = 0; column < 10; column++) {
				
				if (column > line) {
					break;
				}
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		// Removing the if inside intern loop
		
		for (int line = 0; line < 10; line++) {
			
			for (int column = 0; column <= line; column++) {
				
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}

	}

}
