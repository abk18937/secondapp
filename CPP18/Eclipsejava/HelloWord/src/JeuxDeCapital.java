import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JeuxDeCapital {

	public static void main(String[] args) {
		
		final int QN = 18;
		int index;
		String pays;
		String capital;
		String UserAnser;
		int score=0;
		
		
		ArrayList<Integer>indexesAlreadytaken = new ArrayList<>();
		
		
		String[][] data= {
		
				{"Senegal","Dakar"},
				{"Italie","Rome"},
				{"Togo","Lome"},
				{"Nigeria","Lagos"},
				{"France","Paris"},
				{"Mali","Bamaco"},
				{"Allemangne","Berlin"},
				{"Liberia","Morovia"},
				{"Perou","Lima"},
		      
				
				
				{"Benin","cotonou"},
				{"Espagne","Brussel"},
				{"Amerik","Wanschiton Dc"},
				{"Cote Divoir","Abidjan"},
				{"Maroc","Cassablanca"},
				{"Egypte","Caire"},
				{"Kenya","Nahirobie"},
				{"Sudan","Djuba"},
				{"Ghana","Accra"}
		
	
		
		};
		
		//System.out.println(data[1][0]);
		
		Scanner clavier=new Scanner(System.in);
		
		for(int i=0; i< QN ;i++) {
			
		do {
			
		   Random random=new Random();	
		   index=random.nextInt(data.length);
			
		}while(indexesAlreadytaken.contains(index));
			
		indexesAlreadytaken.add(index);	
			
		
		pays=data[index][0];
		capital=data[index][1];	
		
		System.out.printf("Quelle est la capital de ce pays : %s?\n", pays);
		
		UserAnser= clavier.nextLine();
		if(capital.equalsIgnoreCase(UserAnser)) {
			
			System.out.printf("Bonne Reponse \n");	
			score++;
			
		}else {
			
			System.out.printf("Erreur cest plutot  %s.\n  " , capital   );
		}
		
		
		}
		System.out.printf("Cest terminee.<< Score: %d/%d >>", score,QN);
		
		
		clavier.close();
	}

}
