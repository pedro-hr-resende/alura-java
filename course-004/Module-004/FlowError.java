/* Author: Pedro Henrique Resende Ribeiro
 * Description: Creating a stack overflow error
 * Date: 19/06/2022 - Hour: 12:20
 */

public class FlowError {
	
	// Hierarchy: Throwable -> Error -> VirtualMachineError -> StackOverflowError
	
	public static void main(String[] args) {
		
		System.out.println("Start of main");
		
		try {
			
			method1();
			
		} catch (ArithmeticException | NullPointerException | MyException exception) {
			
			System.out.println("Exception message: " + exception.getMessage());
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
		
		// We are creating a stack overflow error
		
		method2();
		
		System.out.println("End of method2");
		
	}
	
}
