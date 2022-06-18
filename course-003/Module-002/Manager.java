/* Author: Pedro Henrique Resende Ribeiro
 * Description: Correct extension of employee class
 * Date: 17/06/2022 - Hour: 11:44
 */

public class Manager extends Employee {
	
	private int password;
	
	// Methods
	
	// It's a overridden method
	
	@Override
	public double getBonus() {
		
		// Super indicates that the attribute belongs to super class
		
		return (super.getBonus() + super.getSalary());
	
	}
	
	public boolean authentication(int password) {
	
		if (this.password == password) {
			return true;
		}
		
		return false;
		
	}
	
	// Getters and setters
	
	public int getPassword() {
	
		return this.password;
	
	}
	
	public void setPassword(int password) {
	
		this.password = password;
	
	}

}
