/* Author: Pedro Henrique Resende Ribeiro
 * Description: Using inheritance and inteface
 * Date: 18/06/2022 - Hour: 01:20
 */

package companySystem;

public class Manager extends Employee implements Authenticable {
	
	private AuthenticableConcrete authenticator;
	
	public Manager() {
		
		// This is a composition
		
		this.authenticator = new AuthenticableConcrete();
		
	}
	
	// Methods

	@Override
	public boolean authentication(int password) {
		
		return this.authenticator.authentication(password);
		
	}
	
	// Getters and setters
	
	@Override
	public double getBonus() {
		
		// Super indicates that the attribute belongs to super class
		
		return (super.getSalary());
	
	}
	
	@Override
	public void setPassword(int password) {
		
		this.authenticator.setPassword(password);
		
	}

}
