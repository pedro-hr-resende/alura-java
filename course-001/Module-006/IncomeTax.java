/* Author: Pedro Henrique Resende Ribeiro
 * Description: Exercise about income tax
 * Date: 15/06/2022 - Hour: 22:25
 */

public class IncomeTax {

	public static void main(String[] args) {
		
		double salary = 3300.00;
		
		if (salary >= 1900.00 && salary <= 2800.00) {
			
			System.out.println("Your aliquot is 7,5%");
			System.out.println("Your income tax dedution is up to 142.00 reais");
			
		} else if (salary >= 2800.01 && salary <= 3751.00) {
			
			System.out.println("Your aliquot is 15,0%");
			System.out.println("Your income tax dedution is up to 350.00 reais");
			
		} else if (salary >= 3751.01 && salary <= 4664.00) {
			
			System.out.println("Your aliquot is 22,5%");
			System.out.println("Your income tax dedution is up to 636.00 reais");
			
		}

	}

}
