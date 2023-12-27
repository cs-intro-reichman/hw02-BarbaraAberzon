/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//define Variables
		int x = Integer.parseInt(args[0]) ;
		int sum = 1 ;
		int d = 0 ; //divsor
		int dModulo = 0 ;//divsor modulo
		
		//checking x's divisors 
		int i = 2 ;
		for ( i = 2 ; i < x ; i++){
			d = x / i;
			dModulo = x % i ;
			if ( dModulo == 0){
			sum = sum + i ;
			}
		}
			
		//if x is perfect - print the numbers
		if ( sum == x ){
			System.out.print ( x + " is a perfect number since " + x + " = 1" );
			i = 2 ;
			while (i < x){
			d = x / i;
			dModulo = x % i ;
			if ( dModulo == 0){
			System.out.print ( " + " + i );
				}
				i++ ;
			}	
			
		}
		
		//if x isn't perfect print it
		else {
			System.out.println( x + " is not a perfect number " );
		}
	}
}
