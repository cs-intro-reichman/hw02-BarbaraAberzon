/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		double totalKids = 0.0; //the total kida for average
		int girl = 0; // number of girls
		int boy = 0; //number of boys
		int kids = 0; //sum of the kids
		int twoChild = 0; //family's number with 2 children
		int threeChild = 0; //family's number with 3 children
		int fourChild = 0;//family's number with 4 children or more
		
		//make random family T times
		int i = 1;
		while( i <= T ){
			while ( boy == 0 || girl == 0){
				double a = Math.random();
				if ( a > 0.5 ){girl++ ;}
				else {boy++ ;}
				kids = girl + boy ;
				}
			totalKids += kids;	
			if( kids == 2 ){twoChild++ ;}
			else if( kids == 3 ){threeChild++ ;}
			else {fourChild++ ;}

			i++ ;
		}
		
		//print the result and the average
		double average = totalKids/T ;
		System.out.println( "Average: " + average + " children to get at least one of each gender." );
		System.out.println( "Number of families with 2 children: " + twoChild );
		System.out.println( "Number of families with 3 children: " + threeChild );
		System.out.println( "Number of families with 4 or more children: " + fourChild );
		
		//check which is the common family kids number
		if ( twoChild > threeChild && twoChild > fourChild ){System.out.println( "The most common number of children is 2." );}
		else if ( threeChild > twoChild && threeChild > fourChild ){System.out.println( "The most common number of children is." );}
		else {System.out.println( "The most common number of children is 4 or more." );}
	}
}
