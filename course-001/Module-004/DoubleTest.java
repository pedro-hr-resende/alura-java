/* Author: Pedro Henrique Resende Ribeiro
 * Description: Double number test
 * Date: 15/06/2022 - Hour: 20:06
 */

public class DoubleTest {

	public static void main(String[] args) {

		double value = 10.75;

		System.out.println("The value is " + value);

		double division1 = 3.14 / 2;

		System.out.println("The value of pi divided by 2 is " + division1);

		int division2 = 5 / 2;

		// In this case, both numbers are integers, so the answer is also integer

		System.out.println("The value of integer division is " + division2);

		double division3 = 5 / 2;

		// Here we have the same problem

		System.out.println("The value of division is " + division3);

		double division4 = 5.0 / 2;

		// Here we solve the problem. There is at least one floating point number in division

		System.out.println("The value of division is " + division4);

	}

}
