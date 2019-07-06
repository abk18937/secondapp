package toto;

import java.util.Scanner;

public class Text {
	
	 

	public static void main(String[] args) {
		
		//swichCaseExample();
		Text text = new Text();
		text.swichCaseExample();
		text.forLoopExample();
		text.findFactorialNumber();

		
		int j=0;
        do
	{
	   if (j==7)
		  
	   {
		 j++;
		 
		 break;
	   }
	   System.out.print(j+ " ");
	  j++;
       
	}while(j<10);
		
           
	}
	public  void swichCaseExample() {
		
		double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
		
		 
	}
	
	
	public void forLoopExample() {
		
		for (int j=6; j>0; j--)
		{
	           if (j==4)
	           {
	        	   continue;
	           }

	           System.out.print(j+" ");
		}
		
		
		
	}
	
	public void findFactorialNumber() {
		//We will find the factorial of this number
        int number = 5;
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
	}
	

}
