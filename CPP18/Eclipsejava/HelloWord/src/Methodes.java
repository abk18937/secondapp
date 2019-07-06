
public class Methodes {

	public static void main(String[] args) {
	
		direBonjour("Koffi", "Ingenieur");
		direBonjour("patrick", "Proffesseur");
		direBonjour("Honore", "Ingenieur");
		direBonjour("Martin", "eleve");
		int i= doublure(25);
		System.out.println(doublure(i-4)+1);
		
	}

	static void direBonjour(String nom,String fon){
		
	System.out.printf("Bonjour  %s %s\n ", nom,fon);	
			
	}
	
 static	int doublure(int nbr) {
		return nbr*2;
		
	}
	
}
