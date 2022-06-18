/* Author: Pedro Henrique Resende Ribeiro
 * Description: Extension of employee class
 * Date: 17/06/2022 - Hour: 22:15
 */

public class Manager extends Employee {
	
	private int password;
	
	// Methods
	
	// It's a overridden method
	
	@Override
	public double getBonus() {
		
		// Super indicates that the attribute belongs to super class
		
		return (super.getSalary() * 1.05);
	
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
