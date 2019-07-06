import java.util.Scanner;

public class TP {

	private static Scanner clavier=new Scanner(System.in);
	public static void main(String[] args) {
		
		direBonjour();
		direBonjour();
		direBonjour();
		
		
		
//		String nom;
//		System.out.println("Entrer votre Nom");
//		nom=clavier.nextLine();
//		
//		System.out.printf("Bonjour %s\n",  nom);
		
		
		
	}
	static void direBonjour() {
	String nom;	
	
	System.out.println("Entrer votre Nom");
	nom=clavier.nextLine();
	
	System.out.printf("Bonjour %s\n",  nom);
	}
	
	
	
	
}
