/* Author: Pedro Henrique Resende Ribeiro
 * Description: Class responsible for controlling employee's bonus
 * Date: 17/06/2022 - Hour: 15:20
 */

public class BonusControl {
	
	private double totalBonus;
	
	// Methods
	
	public void register(Employee employee) {
		
		// The specific method will be called for each type 
		
		double bonus = employee.getBonus();
		this.totalBonus += bonus;
		
	}

	// Getters and setters
	
	public double getTotalBonus() {
		
		return this.totalBonus;
		
	}

}
