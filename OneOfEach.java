
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	int girl = 0 ; // number of girls
		int boy = 0 ; //number of boys
		int kids ; //sum of the kids
		
		//print randomly boy or girl and count it
		while ( boy == 0 || girl == 0){
			double a = Math.random();
			if ( a > 0.5 ){
				System.out.print( "g ");
				girl++ ;
			}
		
			else {
				System.out.print( "b ");
				boy++ ;
			}
		}
		
		kids = girl + boy ; //counting the number of kids
		System.out.println( "" );
		System.out.println( "You made it... and you now have " + kids + " children." );
	}
}
