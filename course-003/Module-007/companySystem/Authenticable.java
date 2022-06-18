/* Author: Pedro Henrique Resende Ribeiro
 * Description: Authenticable interface
 * Date: 18/06/2022 - Hour: 01:20
 */

package companySystem;

public interface Authenticable {
	
	// An interface is like a contract
	
	// Methods
	
	public boolean authentication(int password);
	
	// Getters and setters
	
	public void setPassword(int password);
	
}
