/* Author: Pedro Henrique Resende Ribeiro
 * Description: Conditional test
 * Date: 15/06/2022 - Hour: 21:20
 */

public class ConditionalTest {

	public static void main(String[] args) {
		
		// Verifying age
		
		int age = 20;
		int peopleNumber = 3;

		if (age >= 18) {
			
			System.out.println("You can enter!");
			
		} else {
			
			if (peopleNumber >= 2) {
				System.out.println("You are accompanied, you can enter!");
			} else {
				System.out.println("You can't enter!");
			}
			
		}
		
		// Verifying salary
		
		double salary = 3300.0;
		
		if (salary < 2600.0) {
			
			System.out.println("The increase will be 15%");
			System.out.println("The new salary is " + (salary * 1.15) + " dollars");
			
		} else if (salary < 3750.0) {
			
			System.out.println("The increase will be 30%");
			System.out.println("The new salary is " + (salary * 1.30) + " dollars");
			
		}

	}

}
