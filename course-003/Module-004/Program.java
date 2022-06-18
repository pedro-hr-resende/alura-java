/* Author: Pedro Henrique Resende Ribeiro
 * Description: Classes and methods test
 * Date: 17/06/2022 - Hour: 21:25
 */

public class Program {

	public static void main(String[] args) {
		
		CheckingAccount account1 = new CheckingAccount(1234, 123456);
		
		account1.depositMoney(500.00);
		
		SavingAccount account2 = new SavingAccount(9876, 987654);
		
		account2.depositMoney(1000.00);
		account2.transferMoney(100.00, account1);
		
		System.out.println("Checking account balance: " + account1.getBalance());
		System.out.println("Saving account balance: " + account2.getBalance());
		
	}

}
