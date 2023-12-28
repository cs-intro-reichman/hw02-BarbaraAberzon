/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = (args[0]) ;
		int length = word.length();
		char middle ;
		
		//prints the word backwards
		int i = length-1 ;
		while (i >= 0){
			System.out.print(word.charAt(i));
			i--;
		}
		
		//print the middle char
		if (length%2 == 0){
			middle = word.charAt( (length/2)-1 );
		}
		else {
			middle = word.charAt( length/2 );
			}
			
		System.out.println( "" );
		System.out.println( "The middle character is " + middle );
	}
}
