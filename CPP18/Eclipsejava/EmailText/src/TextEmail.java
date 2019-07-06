import java.util.Scanner;

public class TextEmail {
        
	    @SuppressWarnings("unused")
		public static boolean isValidEmail( String email ) {
	        String regExp = "^.+@.+\\..+$";  
	        String reg_Exp = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";
	        String reg3Exp = "^\\d\\d/\\d\\d/\\d\\d(\\d\\d)?$";
	        // Notice the sequence \\
	        
	        
	        System.out.println("Enter your email Address:");

	        Scanner s=new Scanner(System.in);

	        //String email=s.next(); 
	        
	        
	        
	        return email.matches( regExp );
	    }
	    
	    
	    public static void main(String[] args) {
	        
	      // --- Good Emails ---
	      System.out.println( isValidEmail( "dominique.liard@infini-software.com" ) );
	      System.out.println( isValidEmail( "martin@societe.com" ) );
	      System.out.println( isValidEmail( "martin@societe.fr" ) );
	      
	      System.out.println( "-----------------------------" );
	      
	      // --- Bad Emails ---
	      System.out.println( isValidEmail( "martin.societe.com" ) );   // No @ character
	      System.out.println( isValidEmail( "martin@societe" ) );       // No . character
	      System.out.println( isValidEmail( "martin@societe.f" ) );
	      System.out.println( isValidEmail( "@@@.@" ) );
	      
		}
	    
	}