/* Author: Pedro Henrique Resende Ribeiro
 * Description: AnotherException extends directly Exception class
 * Date: 19/06/2022 - Hour: 11:50
 */

public class AnotherException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AnotherException() {
		
		super();
		
	}
	
	public AnotherException(String message) {
		
		super(message);
		
	}

}
