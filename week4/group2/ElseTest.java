public class ElseTest {
	
	public static void main(String args[]) {
		int x = 4;
		int y = 10;
		
		if ( x > 5 ) {
			if ( y > 5 ) {
				System.out.println( "x and y are > 5" );
			}
		} else {
			System.out.println( "x is <= 5" );
		}
		
	}
}