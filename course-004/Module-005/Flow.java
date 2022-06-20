/* Author: Pedro Henrique Resende Ribeiro
 * Description: Program execution flow
 * Date: 19/06/2022 - Hour: 14:00
 */

public class Flow {

	public static void main(String[] args) {
	
		Account account = new SavingAccount();
		
		account.depositMoney(10000.00);
		
		try {
		
			account.withdrawMoney(11000.00);
			
		} catch (BalanceException exception) {
			
			System.out.println("Exception message: " + exception.getMessage());
			exception.printStackTrace();
			
		}
		
		System.out.println("Final balance: " + account.getBalance());
		
		try {
		
			account.setPassword(-1234);
		
		} catch (PasswordException exception) {
			
			System.out.println("Exception message: " + exception.getMessage());
			exception.printStackTrace();
			
		}
		
		System.out.println("Password: " + account.getPassword());
		
		System.out.println("End of main");
		
	}
	
}
