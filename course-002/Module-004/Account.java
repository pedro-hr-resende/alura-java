/* Author: Pedro Henrique Resende Ribeiro
 * Description: Bytebank account class
 * Date: 16/06/2022 - Hour: 20:50
 */

public class Account {

	double balance;
	int agency;
	int number;
	
	// This attribute is an object
	
	Person person;
	
	public void depositMoney(double value) {
		
		if (value > 0) {
			this.balance += value;
		}
		
	}
	
	public boolean withdrawMoney(double value) {
		
		if (this.balance >= value) {
			
			this.balance -= value;
			return true;
			
		}
		
		return false;
		
	}
	
	public boolean transferMoney(double value, Account destiny) {
		
		if (this.balance >= value) {
			
			this.withdrawMoney(value);
			destiny.depositMoney(value);
			return true;
			
		}
		
		return false;
				
	}
	
}
