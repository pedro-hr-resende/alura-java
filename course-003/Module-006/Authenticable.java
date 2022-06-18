/* Author: Pedro Henrique Resende Ribeiro
 * Description: Athenticable interface
 * Date: 17/06/2022 - Hour: 23:55
 */

public interface Authenticable {
	
	// An interface is like a contract
	
	// Methods
	
	public boolean authentication(int password);
	
	// Getters and setters
	
	public void setPassword(int password);
	
}
