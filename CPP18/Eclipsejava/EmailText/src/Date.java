
public class Date {

	    public static boolean isValidDate( String date ) {              // jj/mm/aaaa    jj/mm/aa
	        String regExp = "^\\d\\d/\\d\\d/\\d\\d(\\d\\d)?$";
	        // ou String redExp = "^[0-9]{2}/[0-9]{2}/([0-9]{2})?[0-9]{2}$";
	        return date.matches( regExp );
	    }
	    
	    public static void main(String[] args) {
	        
	        // --- Good Dates ---
	        System.out.println( isValidDate( "30/05/2017" ) );
	        System.out.println( isValidDate( "30/05/17" ) );
	        
	        System.out.println( "-----------------------------" );
	        
	        // --- Bad Dates ---
	        System.out.println( isValidDate( "30/05/017" ) );
	        System.out.println( isValidDate( "30/5/17" ) );
	        System.out.println( isValidDate( "3/05/17" ) );
	        
	    }
	    
	}