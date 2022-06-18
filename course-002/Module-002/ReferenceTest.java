/* Author: Pedro Henrique Resende Ribeiro
 * Description: Object reference test
 * Date: 16/06/2022 - Hour: 12:35
 */

public class ReferenceTest {

	public static void main(String[] args) {
		
		Account client1 = new Account();
		
		// Here we just copy the reference to an object
		// It's very different to create a new object
		
		Account client2 = client1;
		
		client1.balance = 1500.00;
		
		System.out.println("Client 1 account balance: " + client1.balance);
		System.out.println("Client 2 account balance: " + client2.balance);		
		
		if (client1 == client2) {
			System.out.println("The accounts are equal");
		} else {
			System.out.println("The accounts are different");
		}
		
		System.out.println("Client 1 reference: " + client1);
		System.out.println("Client 2 reference: " + client2);
	}

}
