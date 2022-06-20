/* Author: Pedro Henrique Resende Ribeiro
 * Description: Simulating a connection 
 * Date: 19/06/2022 - Hour: 21:14
 */

public class Connection implements AutoCloseable {

	public Connection() {
		
		System.out.println("Opening connection");
		throw new IllegalStateException("Connection error!");
		
	}
	
	public void readData() {
		
		System.out.println("Receiving data");
		throw new IllegalStateException("Connection error!");
		
	}
	
	// This method is from interface

	@Override
	public void close() {
		
		System.out.println("Closing connection - AutoCloseable");
		
	}
	
}
