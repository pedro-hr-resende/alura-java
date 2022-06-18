/* Author: Pedro Henrique Resende Ribeiro
 * Description: Polymorphism example
 * Date: 17/06/2022 - Hour: 15:05
 */

public class Program {

	public static void main(String[] args) {
		
		Manager manager1 = new Manager();
		
		manager1.setName("Pedro");
		manager1.setSalary(10000.00);
		
		BonusControl control = new BonusControl();
		
		control.register(manager1);
		
		System.out.println("Total bonus: " + control.getTotalBonus());
		
		Employee employee1 = new Employee();
		
		employee1.setSalary(2000.00);
		control.register(employee1);
		
		System.out.println("Total bonus: " + control.getTotalBonus());
		
		VideoEditor videoEditor1 = new VideoEditor();
		
		videoEditor1.setSalary(4000.00);
		control.register(videoEditor1);
		
		System.out.println("Total bonus: " + control.getTotalBonus());
		
		Designer designer1 = new Designer();
		
		designer1.setSalary(3000.00);
		control.register(designer1);
		
		System.out.println("Total bonus: " + control.getTotalBonus());
		
	}

}
