/* Author: Pedro Henrique Resende Ribeiro
 * Description: Using inheritance and inteface
 * Date: 17/06/2022 - Hour: 23:40
 */

public class Manager extends Employee implements Authenticable {
	
	// It's a overridden method
	
	private int password;
	
	// Methods

	@Override
	public boolean authentication(int password) {
		
		if (this.password == password) {
			return true;
		}
		
		return false;
		
	}
	
	// Getters and setters
	
	@Override
	public double getBonus() {
		
		// Super indicates that the attribute belongs to super class
		
		return (super.getSalary());
	
	}
	
	@Override
	public void setPassword(int password) {
		
		this.password = password;
		
	}

}
