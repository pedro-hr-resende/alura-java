/* Author: Pedro Henrique Resende Ribeiro
 * Description: Constructor test
 * Date: 16/06/2022 - Hour: 23:25
 */

public class ConstructorTest {

	public static void main(String[] args) {
		
		// We have to be careful about inconsistent states
		// Constructor can be used to create objects with consistent states
		
		Account client1 = new Account(1234, 1234500);
		
		System.out.println("Agency: " + client1.getAgency());
		System.out.println("Number: " + client1.getNumber());
		
		System.out.println("Total accounts created: " + Account.getTotalAccount());
		
		Account client2 = new Account(4567, 7894500);
		Account client3 = new Account(2025, 5551420);
		
		client2.depositMoney(1000.00);
		client3.depositMoney(2000.00);
		
		System.out.println("Total accounts created: " + Account.getTotalAccount());
		
	}

}
