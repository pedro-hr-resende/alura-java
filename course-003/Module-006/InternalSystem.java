/* Author: Pedro Henrique Resende Ribeiro
 * Description: Internal system class
 * Date: 17/06/2022 - Hour: 23:40
 */

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
