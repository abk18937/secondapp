
import java.util.Scanner;
 public class CalculatePercentage
 {
   private static Scanner s;

public static void main(String args[])
   {
   	double p,q;
	s = new Scanner(System.in);
	System.out.println("Enter your price to get discount!!!:");
	p=s.nextDouble();
	
	if (p >= 100)
	{
			if(p<=300)
			
			{
				q=p-(p*.1) ;
  				System.out.println("Your price after discount is:  "+q);
			}
	
			else if (p>300 && p<=700)
			{
				q=p-(p*.15) ;
				System.out.println("Your price after discount is:  "+q);
			}
	
			else if (p>700 && p<=1000)
			{
				q=p-(p*.20) ;
				System.out.println("Your price after discount is:  "+q);
			}

			else
			{
				q=p-(p*.25) ;
				System.out.println("Your price after discount is:  "+q);
			}
	}
	
	else
	{
	System.out.println("You are not eligible for our discount");
	System.out.println("You have to pay:  "+p);
	}
  }
}
