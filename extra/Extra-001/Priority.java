/* Author: Pedro Henrique Resende Ribeiro
 * Description: Priority enum to use as a parameter in thread method
 * Date: 18/06/2022 - Hour: 13:35
 */

public enum Priority {
	
	MIN(1), NORMAL(5), MAX(10);
	
	private int value;
	
	Priority(int value) {
		
		this.value = value;
		
	}
	
	public int getValue() {
		
		return this.value;
		
	}

}
