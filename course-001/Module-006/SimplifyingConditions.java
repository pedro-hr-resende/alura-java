/* Author: Pedro Henrique Resende Ribeiro
 * Description: Simplifying conditional test
 * Date: 15/06/2022 - Hour: 21:50
 */

public class SimplifyingConditions {

	public static void main(String[] args) {
		
		int age = 16;
		int peopleNumber = 3;
			
		// Operator "or" (represented by ||) means that at least one of the conditions must be true
		
		if (age >= 18 || peopleNumber >= 2) {
			System.out.println("You can enter!");
		} else {
			System.out.println("You can't enter!");
		}
		
		// Operator "and" (represented by &&) means that all conditions must be true
		
		if (age >= 18 && peopleNumber >= 2) {
			System.out.println("You can enter!");
		} else {
			System.out.println("You can't enter!");
		}
		
		int value = 20;
		boolean accompanied = peopleNumber >= 2;
		
		// Boolean type receives just true or false (without quotation marks ")
		
		if (value >= 18 || accompanied) {
			System.out.println("You can enter!");
		} else {
			System.out.println("You can't enter!");
		}	

	}

}
