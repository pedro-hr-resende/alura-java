/* Author: Pedro Henrique Resende Ribeiro
 * Description: Concrete implementation of authenticable interface
 * Date: 18/06/2022 - Hour: 01:20
 */

package companySystem;

public class AuthenticableConcrete implements Authenticable {
	
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
	public void setPassword(int password) {
		
		this.password = password;
		
	}
	
}
