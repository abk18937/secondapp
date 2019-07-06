import java.util.Scanner;

public class JeuxUtil {

	public static void main(String[] args) {
		int SecretNombre,nombre_user;
		@SuppressWarnings("resource")
		Scanner clavier=new Scanner(System.in);
		
		SecretNombre=(int)(Math.random()*999)+1;
		
		do { System.out.println("Entrer nombre(1-1000)");
			
		  nombre_user=clavier.nextInt();	
		if(nombre_user==SecretNombre) {
			
			System.out.println("Felicitation!!!");
			
			
		}else if(nombre_user > SecretNombre) {
			
			System.out.println("Nombre Trop grand");	
		
		}else {
			
			System.out.println("Nombre Trop petit");
			
			
		}
      
		}while(nombre_user !=  SecretNombre);

	}

}
