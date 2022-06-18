/* Author: Pedro Henrique Resende Ribeiro
 * Description: Abstract modifyer example
 * Date: 17/06/2022 - Hour: 23:40
 */

public class Program {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		manager.setPassword(1234);
		
		InternalSystem companySystem = new InternalSystem();
		
		companySystem.authentication(manager);
		
		Administrator administrator = new Administrator();
		
		administrator.setPassword(1235);
		
		companySystem.authentication(administrator);
		
		// Now, client can access internal system and it isn't an employee
		
		Client client = new Client();
		
		client.setPassword(1234);
		
		companySystem.authentication(client);
		
	}

}
