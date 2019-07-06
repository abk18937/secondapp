
import java.util.*;
import java.util.regex.*;
public class Email{

public static void main(String args[]){

System.out.println("Enter your email Address:");

Scanner s=new Scanner(System.in);

String email=s.next();

Pattern p=Pattern.compile("@");

Pattern p1=Pattern.compile("\\.");

Matcher m=p.matcher(email);

Matcher n=p1.matcher(email);

if(m.find() && n.find()){

	System.out.println("Email Address is vaild");
	}
	else
	{
	System.out.println("Email Address is invaild");
	}
    }
}
