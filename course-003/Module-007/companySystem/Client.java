/* Author: Pedro Henrique Resende Ribeiro
 * Description: Client class
 * Date: 18/06/2022 - Hour: 01:20
 */

package companySystem;

public class Client implements Authenticable {
	
	// There isn't multiple inheritance in Java
	
	private AuthenticableConcrete authenticator;
	
	// Constructor
	
	public Client() {
		
		// This is a composition
		
		this.authenticator = new AuthenticableConcrete();
		
	}
	
	@Override
	public boolean authentication(int password) {
		
		return this.authenticator.authentication(password);
		
	}
	
	// Getters and setters

	@Override
	public void setPassword(int password) {
		
		this.authenticator.setPassword(password);
		
	}
	
}
