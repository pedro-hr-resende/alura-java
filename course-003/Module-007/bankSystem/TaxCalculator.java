/* Author: Pedro Henrique Resende Ribeiro
 * Description: Bytebank tax calculator interface
 * Date: 18/06/2022 - Hour: 01:50
 */

package bankSystem;

public class TaxCalculator {
	
	private double totalTax;
	
	public void taxValue(Taxable taxable) {
		
		double value = taxable.getTaxValue();
		totalTax += value;
		
	}
	
	// Getters and setters
	
	public double getTotalTax() {
		
		return this.totalTax;
		
	}
	
}
