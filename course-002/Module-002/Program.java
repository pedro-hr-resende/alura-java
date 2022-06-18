/* Author: Pedro Henrique Resende Ribeiro
 * Description: Classes and methods test
 * Date: 16/06/2022 - Hour: 11:30
 */

public class Program {

	public static void main(String[] args) {
		
		// The variable client1 isn't an object, it is a reference to an object
		
		Account client1 = new Account();
		
		client1.balance = 200.00;
		
		System.out.println("Client 1 balance account: " + client1.balance);
		
		client1.balance += 100.00;
		
		System.out.println("Client 1 new balance account: " + client1.balance);
		
		Account client2 = new Account();
		
		client2.balance = 1000.00;
		
		System.out.println("Client 2 balance account: " + client2.balance);
		
		// Class attributes are initialized to 0, false or null
		// But it's possible to initialize with a specific value
		
		System.out.println("Client 2 number account: " + client2.number);
		System.out.println("Client 2 name: " + client2.name);
		
	}

}
