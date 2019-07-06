
public class CountingNumber 
{
public static void main(String args[])
{
int p=0;
int	n=0;
int	z=0;

	System.out.println("Your record is :");
	
    for (int i=-5;i<=10;i++)
    {
 	System.out.print(i+"   ");
	 
	if(i<0)
	{
 	n=n+1;
	}
	else if(i>0)
	{
	p=p+1;
	}
	else
	{
	z=z+1;
	}
}
System.out.println("\n ");
 
System.out.println("Positive Number is :-->"+p);
 
System.out.println("Negative Number is :-->"+n);
 
System.out.println("Zero Number is :-->"+z);

}
}
