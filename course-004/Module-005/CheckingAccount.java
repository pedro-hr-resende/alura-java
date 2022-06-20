/* Author: Pedro Henrique Resende Ribeiro
 * Description: Checking account class for exception test
 * Date: 19/06/2022 - Hour: 14:30
 */

public class CheckingAccount extends Account {

	@Override
	public void withdrawMoney(double value) {
		
		double newValue = value + 1.50;
		super.withdrawMoney(newValue);
		
	}
	
}
