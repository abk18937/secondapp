package oop;

public class Textoop {
	
	String name;
	 String username;
	 
	 Textoop(String n, String u){
		 
		this.name=n;
		this.username=u;
		 
	 }
	
	public static void main(String args[] ){
		Textoop  ms = new Textoop("Adr", "Lkas");
		System.out.println(ms.name + " " + ms.username);

//		System.out.println(ms.name);
//		System.out.println(ms.username);
		
	}

	class Text extends Textoop{

		Text(String n, String u, String s)
		
		{
			super(n, u);
			
	
		}
		
	}
}
