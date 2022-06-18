/* Author: Pedro Henrique Resende Ribeiro
 * Description: Bytebank saving account class
 * Date: 18/06/2022 - Hour: 01:50
 */

package bankSystem;

public class SavingAccount extends Account {
	
	// Constructor isn't inherited
	// Java automatically calls only default constructor
	
	public SavingAccount(int agency, int number) {
		
		super(agency, number);
		
	}
	
	// Methods
	
	@Override
	public boolean withdrawMoney(double value) {
		
		double newValue = value + 0.20;
		
		// It isn't necessary repeat the test balance >= newValue
		// This test will be done in super class
		
		return (super.withdrawMoney(newValue));
		
	}

}
