import java.util.Scanner;
import java.util.regex.*;
 
public class EmailScanner
{

 public static void main(String args[])
 {

    @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
    System.out.println("Enter your Email Address");
    String email=s.next();
    Pattern p=Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    Matcher m=p.matcher(email);
    boolean b=m.matches();

 if (b==true)
  System.out.println("The Address is valid ");
 else 
  System.out.println("The Address is Invalid ");
}
}