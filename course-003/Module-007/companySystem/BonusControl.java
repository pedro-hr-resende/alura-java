/* Author: Pedro Henrique Resende Ribeiro
 * Description: Class responsible for controlling employee's bonus
 * Date: 18/06/2022 - Hour: 01:20
 */

package companySystem;

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
