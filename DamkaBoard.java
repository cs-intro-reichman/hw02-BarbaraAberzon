/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]) ;
		
		for (int i = 1 ; i <= x ; i++ ){
			for(int j = 1 ; j <= x ; j++){
				if ( j < x ) {System.out.print( "* " );}
				else {System.out.print( "*" );}
			System.out.println( "" );
			if ( i%2 == 1 ){//if the line's number is even -> than add space in the start
				System.out.print( " " );
			}
		}
	}
}
}

