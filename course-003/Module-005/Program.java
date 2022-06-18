/* Author: Pedro Henrique Resende Ribeiro
 * Description: Abstract modifyer example
 * Date: 17/06/2022 - Hour: 22:15
 */

public class Program {

	public static void main(String[] args) {
		
		Employee employee = new Manager();
		
		employee.setSalary(10000.00);
		
		System.out.println("Manager bonus: " + employee.getBonus());
		
		BonusControl control = new BonusControl();
		
		control.register(employee);
		
		System.out.println("Total bonus: " + control.getTotalBonus());
		
	}

}
