/* Author: Pedro Henrique Resende Ribeiro
 * Description: Object composition
 * Date: 16/06/2022 - Hour: 20:50
 */

public class ObjectComposition {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Pedro Ribeiro";
		person1.cpf = "123.456.789-00";
		person1.profession = "Programmer";
		
		Account client1 = new Account();
		
		client1.depositMoney(1500.00);
		
		// Associate the client with the account
		
		client1.person = person1;
		
		System.out.println("Name: " + client1.person.name);
		System.out.println("CPF: " + client1.person.cpf);
		System.out.println("Profession: " + client1.person.profession);
		System.out.println("Account balance: " + client1.balance);
		
		Account client2 =  new Account();
		
		client2.depositMoney(1000.00);
		
		// To use the Person class inside Account class, it's necessary
		// to create a new reference to an object before any assignment
		
		client2.person = new Person();
		
		client2.person.name = "Paulo Ribeiro";
		client2.person.cpf = "789.456.123-00";
		client2.person.profession = "Mechanical Engineer";
		
		System.out.println();
		
		System.out.println("Name: " + client2.person.name);
		System.out.println("CPF: " + client2.person.cpf);
		System.out.println("Profession: " + client2.person.profession);
		System.out.println("Account balance: " + client2.balance);
		
	}

}
