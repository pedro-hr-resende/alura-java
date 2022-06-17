/* Author: Pedro Henrique Resende Ribeiro
 * Description: Encapsulating class attributes
 * Date: 16/06/2022 - Hour: 22:08
 */

public class EncapsulationTest {

	public static void main(String[] args) {
		
		// It isn't a good practice to directly access class attributes
		// The access should be done using methods
		
		Account client1 = new Account();
		
		client1.depositMoney(1000.00);
		
		System.out.println("Account balance: " + client1.getBalance());
		
		Person person = new Person();
		
		person.setName("Pedro Ribeiro");
		person.setCPF("123.456.789-00");
		person.setProfession("Mechanical Engineer");
		
		client1.setPerson(person);
		
		System.out.println("Client name: " + client1.getPerson().getName());
		System.out.println("Client profession: " + client1.getPerson().getProfession());
		
		client1.getPerson().setProfession("Programmer");
		
		System.out.println("Client new profession: " + client1.getPerson().getProfession());
		
	}

}
