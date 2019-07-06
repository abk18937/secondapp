import java.util.ArrayList;

public class ArrayListLecture {

	public static void main(String[] args) 
	{
		ArrayList<Integer> tab=new ArrayList<Integer>();
	//System.out.println(tab.size());
		
		tab.add(35);
		tab.add(15);
		tab.add(25);
		tab.add(12);
		
		
		tab.remove(0);
		
		if(tab.isEmpty()) {
			
			System.out.println("tableau vide");
			
		}else {
			
			System.out.println(tab.get(0));
			
		}
		
		
		System.out.println(tab.get(0));
		System.out.println(tab.get(1));
		System.out.println(tab.get(2));
		System.out.println(tab.get(3));
        
		
		

	}

}
