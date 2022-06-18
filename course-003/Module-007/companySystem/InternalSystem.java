/* Author: Pedro Henrique Resende Ribeiro
 * Description: Internal system class
 * Date: 18/06/2022 - Hour: 01:20
 */

package companySystem;

public class InternalSystem {

	private int password = 1234;
	
	public void authentication(Authenticable person) {
		
		boolean verification = person.authentication(password);
		
		if (verification) {
			System.out.println("Welcome to system");
		} else {
			System.out.println("Authentication error");
		}
		
	}
	
}
