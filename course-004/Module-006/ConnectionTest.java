/* Author: Pedro Henrique Resende Ribeiro
 * Description: Connection test 
 * Date: 19/06/2022 - Hour: 21:14
 */

public class ConnectionTest {

	// There are IllegalStateException and IllegalArgumentException
	
	public static void main(String[] args) {
		
		Connection connection = null;
		
		// This code is complex and difficult to understand
		
		try {
			
			connection = new Connection();
			connection.readData();
			
		} catch (IllegalStateException exception) {
						
			System.out.println("Exception message: " + exception.getMessage());
			exception.printStackTrace();
			
		} finally {
			
			// Finally will always be executed
			
			if (connection != null) {
				connection.close();
			}
			
		}
		
		// Simplifying the code above
		// Using try with resources
		
		try (Connection newConnection = new Connection()) {
			
			newConnection.readData();
			
		} catch (IllegalStateException exception) {
			
			System.out.println("Exception message: " + exception.getMessage());
			exception.printStackTrace();
			
		}
		
		System.out.println("End of main");
		
	}
	
}
