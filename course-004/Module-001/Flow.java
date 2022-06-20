/* Author: Pedro Henrique Resende Ribeiro
 * Description: Program execution flow
 * Date: 18/06/2022 - Hour: 14:45 
 */

public class Flow {

	public static void main(String[] args) {
		
		System.out.println("Start of main");
		
		method1();
		
		System.out.println("End of main");
		
	}
	
	// To call a method that doesn't have a reference or
	// an object created, it needs to be static
	
	private static void method1() {
		
		System.out.println("Start of method1");
		
		method2();
		
		System.out.println("End of method1");
		
	}
	
	private static void method2() {
		
		System.out.println("Start of method2");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print (i + " ");
		}
		
		System.out.println("\nEnd of method2");
		
	}
	
}
