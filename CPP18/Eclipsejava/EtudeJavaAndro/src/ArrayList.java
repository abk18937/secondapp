public class ArrayList
	{
		public static void main(String args[])
		{
			int a[]=new int[6];

			a[0]=2;
			a[1]=4;
			a[2]=6;
			a[3]=8;
			a[4]=10;
			a[5]=12;
			int sum=0;

			for(int i=0;i<6;i++)
			{
				sum=sum+a[i];
				System.out.println(a[i]+" ");


			}
			System.out.println("The total sum is ="+sum);
		}
	}
