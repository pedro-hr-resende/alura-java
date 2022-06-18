/* Author: Pedro Henrique Resende Ribeiro
 * Description: Extension of employee class
 * Date: 17/06/2022 - Hour: 15:20
 */

public class VideoEditor extends Employee {
	
	@Override
	public double getBonus() {
		
		return (super.getBonus() + 100.00);
	
	}

}
