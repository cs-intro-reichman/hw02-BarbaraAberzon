/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]) ;
		 
		 //check all the divisors of x
		int k = 1;
		while ( k <= x ){
			int d = x / k ;
			int dModulo = x % k;
            if ( dModulo == 0)
            System.out.println( k ) ;
		k++ ;
		}
	}
}
