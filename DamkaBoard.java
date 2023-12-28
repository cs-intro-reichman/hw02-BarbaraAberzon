/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]) ;
		int i = 1 ;
		
		while ( i <= x ){
			String damka = "* ".repeat(x) ; //print x times "*"
			if ( i%2 == 0 ){//if the line's number is even -> than add space in the start
				System.out.print( " " + damka );
			}
			else {
            System.out.print( damka );
			}
			System.out.println( " " );
			i++;
		}
	}
}

