/* Author: Pedro Henrique Resende Ribeiro
 * Description: Understanding what is enum
 * Date: 18/06/2022 - Hour: 13:35
 */

public class EnumTest {

	public static void main(String[] args) {
		
		Thread thread = new Thread(() -> System.out.println("Running..."));
		
		// Set priority method receives an integer
		
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(Thread.MAX_PRIORITY + "\n");
		
		// Instead use Thread.MAX_PRIORITY, we create our own enum
		
		Priority min = Priority.MIN;
		Priority max = Priority.MAX;
		Priority normal = Priority.NORMAL;
		
		// This method returns the enum name
		
		System.out.println(min.name());
		System.out.println(normal.name());
		System.out.println(max.name());
		
		System.out.println();
		
		// This method returns the enum number
		
		System.out.println(min.ordinal());
		System.out.println(normal.ordinal());
		System.out.println(max.ordinal());
		
		System.out.println();
		
		System.out.println(min.getValue());
		System.out.println(normal.getValue());
		System.out.println(max.getValue());
		
		System.out.println();
		
		thread.setPriority(max.getValue());
		thread.start();

	}

}
