import java.util.ArrayList;

public class Arraylist2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> array=new ArrayList<String>();
		
		array.add("Koffi");
		array.add("Yaovi");
		array.add("Adjo");
		array.add("Joseph");
		array.add("mimo");
//		for(String item:array) {
		
		System.out.println(array.contains("Koffi"));
		System.out.println(array.contains("ibiekise"));
		
		System.out.println(array.indexOf("mimo"));
		}
		
	}


