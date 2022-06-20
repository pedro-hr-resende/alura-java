/* Author: Pedro Henrique Resende Ribeiro
 * Description: Program execution flow
 * Date: 18/06/2022 - Hour: 17:20
 */

public class Flow {

	public static void main(String[] args) {
		
		System.out.println("Start of main");
		
		try {
			
			method1();
			
		} catch (ArithmeticException | NullPointerException exception) {
			
			System.out.println("NullPointerException: " + exception.getMessage());
			exception.printStackTrace();
			
		}
		
		System.out.println("End of main");
		
	}
	
	private static void method1() {
		
		System.out.println("Start of method1");
		
		// Try catch can be written here
		
		method2();
		
		System.out.println("End of method1");
		
	}
	
	private static void method2() {
		
		System.out.println("Start of method2");
		
		// ArithmeticException exception = new ArithmeticException("My exception message!");		
		// throw exception;
		
		// It's more common to find as shown below
		
		throw new ArithmeticException("My exception message!");
		
		// System.out.println("End of method2");
		
	}
	
}
