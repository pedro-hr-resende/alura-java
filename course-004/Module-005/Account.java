/* Author: Pedro Henrique Resende Ribeiro
 * Description: Account class for exception test
 * Date: 19/06/2022 - Hour: 14:00
 */

public abstract class Account {

	private double balance;
	private int password;
	
	// Method with unchecked exception
	// It isn't necessary modify the method signature
	
	public void withdrawMoney(double value) {
		
		if (this.balance < value) {	
			throw new BalanceException("Balance: " + balance + "; Value: " + value);
		} 
		
		this.balance -= value;
		
	}
	
	public void depositMoney(double value) {
		
		if (value > 0) {
			this.balance += value;
		}
		
	}
	
	public void transferMoney(Account destiny, double value) {
		
		this.withdrawMoney(value);
		destiny.depositMoney(value);
		
	}
	
	// Getters and setters
	
	public double getBalance() {
		
		return balance;
		
	}
	
	public int getPassword() {
		
		return this.password;
		
	}
	
	// Method with checked exception
	// It's necessary modify the method signature
	
	public void setPassword(int password) throws PasswordException {
		
		if (password < 0) {
			throw new PasswordException("Negative password!");
		}
		
		this.password = password;
		
	}
	
}
