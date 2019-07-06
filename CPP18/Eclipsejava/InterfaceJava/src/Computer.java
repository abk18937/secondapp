
public class Computer implements MyInterface {

	@Override
	public void getComputerName() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("123");
		}catch(Exception e) {
			//e.getMessage();
			System.out.println(e.getMessage());
		}
	}
	
	public void getComputerId() {
		// TODO Auto-generated method stub
		System.out.println("HP 789");
	
	}
	
	public static void main(String args[]) {
		 MyInterface interface1 = new Computer();
		 interface1.getComputerName();
		 interface1.getComputerId();
	}

}
