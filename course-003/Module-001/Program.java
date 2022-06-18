/* Author: Pedro Henrique Resende Ribeiro
 * Description: User interface
 * Date: 17/06/2022 - Hour: 10:42
 */

public class Program {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		
		employee1.setName("Pedro");
		employee1.setCpf("123.456.789-00");
		employee1.setSalary(10000.00);
		
		System.out.println("Name: " + employee1.getName());
		System.out.println("Bonus: " + employee1.getBonus());
		
		System.out.println();
		
		// Using the wrong extension of employee class
		
		WrongExtension employee2 = new WrongExtension();
		
		employee2.setSalary(1000.00);
		
		System.out.println("Type: " + employee2.getType());
		System.out.println("Bonus: " + employee2.getBonus());
		
		WrongExtension employee3 = new WrongExtension();
		
		employee3.setSalary(5000.00);
		employee3.setType(1);
		
		System.out.println("Type: " + employee3.getType());
		System.out.println("Bonus: " + employee3.getBonus());
		
		// Using the right extension of employee class
		
		Manager manager1 = new Manager();
		
		manager1.setName("Paulo");
		manager1.setCpf("789.456.123-00");
		manager1.setSalary(10000.00);
		
		// This method exists only for employees who are managers
		
		manager1.setPassword(12345);
		
		System.out.println("Is the password correct? " + manager1.authentication(12345));
		
	}

}
