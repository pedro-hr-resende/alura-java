/* Author: Pedro Henrique Resende Ribeiro
 * Description: Using inheritance and inteface
 * Date: 17/06/2022 - Hour: 23:40
 */

public class Administrator extends Employee implements Authenticable {
	
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
		
		return 50.00;
		
	}
	
	@Override
	public void setPassword(int password) {
		
		this.password = password;
		
	}

}
