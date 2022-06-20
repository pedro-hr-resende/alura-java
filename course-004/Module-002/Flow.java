/* Author: Pedro Henrique Resende Ribeiro
 * Description: Program execution flow
 * Date: 18/06/2022 - Hour: 15:50 
 */

public class Flow {

	public static void main(String[] args) {
		
		System.out.println("Start of main");
		
		try {
		
			method1();
			
		} catch (ArithmeticException exception) {
			
			System.out.println("ArithmeticException: " + exception.getMessage());
			exception.printStackTrace();
			
		} catch (NullPointerException exception) {
			
			System.out.println("NullPointerException: " + exception.getMessage());
			exception.printStackTrace();
			
		}
		
		// Another way of writing try catch
		
		try {
			
			method2();
			
		} catch (ArithmeticException | NullPointerException exception) {
			
			System.out.println("NullPointerException: " + exception.getMessage());
			exception.printStackTrace();
			
		}
		
		System.out.println("End of main");
		
	}
	
	// To call a method that doesn't have a reference or
	// an object created, it needs to be static
	
	private static void method1() {
		
		System.out.println("Start of method1");
		
		// Try catch can be written here
		
		method2();
		
		System.out.println("End of method1");
		
	}
	
	private static void method2() {
		
		System.out.println("Start of method2");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print (i + " ");
		}
		
		System.out.println();
		
		// Creanting an arithmetic exception
		// Try catch can be written here
		
		// int i = 10 / 0;
		
		// Creating a null pointer exception
		
		Account account = null;
		
		account.setPassword(12345);
		
		System.out.println("End of method2");
		
	}
	
}
