/* Author: Pedro Henrique Resende Ribeiro
 * Description: Multiples of three
 * Date: 16/06/2022 - Hour: 00:11
 */

public class MultiplesThree {

	public static void main(String[] args) {
		
		for (int counter = 1; counter <= 100; counter++) {
			
			if(counter % 3 == 0) {
				
				System.out.print(counter);
				System.out.print(" ");
				
			}
			
		}
		
		System.out.println();
		
		for (int counter = 3; counter <= 100; counter += 3) {
				
			System.out.print(counter);
			System.out.print(" ");
			
		}

	}

}
