/* Author: Pedro Henrique Resende Ribeiro
 * Description: Creating an annotation
 * Date: 18/06/2022 - Hour: 14:00
 */

public abstract class Account {
	
	// Annotation @PositiveDouble doesn't exist, we need to creat it
	
	@PositiveDouble
	private double balance;

	// Getters and setters
	
	public double getBalance() {
		
		return balance;
		
	}

	public void setBalance(double balance) {
		
		this.balance = balance;
		
	}
	
}
