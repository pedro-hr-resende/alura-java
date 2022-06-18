/* Author: Pedro Henrique Resende Ribeiro
 * Description: Bytebank checking account class
 * Date: 18/06/2022 - Hour: 01:50
 */

package bankSystem;

public class CheckingAccount extends Account implements Taxable {
	
	// Constructor isn't inherited
	// Java automatically calls only default constructor
	
	public CheckingAccount(int agency, int number) {
		
		super(agency, number);
		
	}

	@Override
	public double getTaxValue() {
		
		return (super.getBalance() * 0.01);
		
	}

}
