/* Author: Pedro Henrique Resende Ribeiro
 * Description: Values stored in variables
 * Date: 15/06/2022 - Hour: 21:04
 */

public class VariableValues {

	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 7;
		
		System.out.println(number2);
		
		number2 = number1;
		
		System.out.println(number2);
		
		// This new assignment doesn't reflect in variable number2
		
		number1 = 10;
		
		System.out.println(number2);

	}

}
