/* Author: Pedro Henrique Resende Ribeiro
 * Description: Saving account class for exception test
 * Date: 19/06/2022 - Hour: 14:30
 */

public class SavingAccount extends Account {
	
	@Override
	public void withdrawMoney(double value) {
		
		double newValue = value + 0.20;
		super.withdrawMoney(newValue);
		
	}

}
