/* Author: Pedro Henrique Resende Ribeiro
 * Description: Account methods test 
 * Date: 16/06/2022 - Hour: 13:15
 */

public class MethodsTest {

	public static void main(String[] args) {
		
		Account client1 = new Account();
		Account client2 = new Account();
		
		client1.balance = 1000.00;
		
		System.out.println("Client 1 account balance: " + client1.balance);
		
		client1.depositMoney(500.00);
		
		System.out.println("Client 1 new account balance: " + client1.balance);
		
		boolean test;
		
		test = client1.withdrawMoney(100.00);
		
		System.out.println("Account balance after withdraw money: " + client1.balance);
		System.out.println("Withdraw method return: " + test);
		
		if (client1.transferMoney(1300.00, client2)) {
			System.out.println("Transfer done successfully");
		} else {
			System.out.println("Transfer error");
		}
		
		System.out.println("Client 1 account balance: " + client1.balance);
		System.out.println("Client 2 account balance: " + client2.balance);

	}

}
