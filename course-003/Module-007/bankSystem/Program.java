/* Author: Pedro Henrique Resende Ribeiro
 * Description: Bytebank application
 * Date: 18/06/2022 - Hour: 01:50
 */

package bankSystem;

public class Program {

	public static void main(String[] args) {
		
		CheckingAccount account = new CheckingAccount(1234, 123456);
		
		account.depositMoney(10000.00);
		
		LifeInsurance life = new LifeInsurance();
		
		TaxCalculator calculator = new TaxCalculator();
		
		calculator.taxValue(account);
		calculator.taxValue(life);
		
		System.out.println("Total tax: " + calculator.getTotalTax());
		
	}

}
