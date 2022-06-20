/* Author: Pedro Henrique Resende Ribeiro
 * Description: Program execution flow
 * Date: 19/06/2022 - Hour: 11:50
 */

public class Flow {

	public static void main(String[] args) {
		
		System.out.println("Start of main");
		
		try {
			
			method1();
			
		} catch (ArithmeticException | NullPointerException | MyException | AnotherException exception) {
			
			System.out.println("Exception message: " + exception.getMessage());
			exception.printStackTrace();
			
		}
		
		System.out.println("End of main");
		
	}
	
	// When there is an exception that extends directly Exception class
	// it's necessary to make it explicit in method signature (methods 1 and 2)
	// or we create a try catch inside the method (main)
	
	private static void method1() throws AnotherException {
		
		System.out.println("Start of method1");
		
		// Try catch can be written here
		
		method2();
		
		System.out.println("End of method1");
		
	}
	
	private static void method2() throws AnotherException {
		
		System.out.println("Start of method2");
		
		throw new AnotherException("My own exception message!");
		
		// System.out.println("End of method2");
		
	}
	
}
