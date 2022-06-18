/* Author: Pedro Henrique Resende Ribeiro
 * Description: Client class
 * Date: 18/06/2022 - Hour: 00:20
 */

public class Client implements Authenticable {
	
	// There isn't multiple inheritance in Java
	
	private int password;
	
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
