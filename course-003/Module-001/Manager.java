/* Author: Pedro Henrique Resende Ribeiro
 * Description: Correct extension of employee class
 * Date: 17/06/2022 - Hour: 12:00
 */

public class Manager extends Employee {
	
	private int password;
	
	// Methods
	
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
