/* Author: Pedro Henrique Resende Ribeiro
 * Description: Character tests
 * Date: 15/06/2022 - Hour: 20:45
 */

public class CharacterTest {

	public static void main(String[] args) {
		
		char letter = 'a';
		
		System.out.println("The letter is '" + letter + "'");
		
		char value = 65;
		
		// A character is a number in the ASCII table
		
		System.out.println("The value converted to character is '" + value + "'");
		
		// Is possible to make operations with characters
		
		value = (char) (value + 1);
		
		System.out.println("The next character is '" + value + "'");
		
		String word = "Alura Java Course";
		
		System.out.println(word);
		
		String name1 = "Pedro Henrique ";
		String name2 = "Resende Ribeiro";
		String name3 = name1 + name2;
		
		System.out.println(name3);		
		
	}

}
