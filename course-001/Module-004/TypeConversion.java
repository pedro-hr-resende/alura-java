/* Author: Pedro Henrique Resende Ribeiro
 * Description: Type conversion test
 * Date: 15/06/2022 - Hour: 20:20
 */

public class TypeConversion {

	public static void main(String[] args) {
		
		double value = 10.75;
		
		// Use (int) to convert a number from double to integer (casting)
		
		int convertedValue = (int) value;
		
		// Only the integer part of the number will be shown
		
		System.out.println("Double converted to integer: " + convertedValue);
		
		// The famous sum of 0.2 + 0.1
		
		double number1 = 0.2;
		double number2 = 0.1;
		double total = number1 + number2;
		
		System.out.println("The famous sum of 0.2 + 0.1 is " + total);
		
		// Other type of numbers		
		
		long longNumber = 12345678987654321L;
		
		System.out.println("Long number: " + longNumber);
		
		short shortNumber = 1234;
		
		System.out.println("Short number: " + shortNumber);
		
		byte byteNumber = 127;
		
		System.out.println("Byte number: " + byteNumber);
		
		float floatNumber = 3.1415F;
		
		System.out.println("Float number: " + floatNumber);
		
	}

}
