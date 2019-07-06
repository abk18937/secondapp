import java.util.Scanner;

public class Boucle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner clavier=new Scanner(System.in);
	
		int age;
		
		do {
			System.out.println("Entrer votre age: ");
			age=clavier.nextInt();
			
			if(age<=0) {
				
				System.out.println("Lage ne pas contenir un nombre negatif");
			}
			
	
		}while(age<=0);
		
		System.out.println("Suite du programme ");
		
	}

}
