package studentDatabase;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentID;
	private String courses;
	private String z;
	private int TuitionBalance = 0;
	private int costOfCours= 600;
	private static int id=1000;
	
	
	//constructer to enter student name and year
	
	public Student() {
		
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Student first Name: ");
	this.firstName=in.nextLine();
	
	System.out.println("Enter Student last Name: ");
	this.lastName=in.nextLine();
		
	
	System.out.print("1-Adrian\n2-Koffi\n3 -Junior\n4 -Senior\nEnter Studentclasse level: ");
	
	this.gradeYear=in.nextInt();
	
	
	setStudentID();
//	System.out.println(firstName +" "+lastName+" "+ StudentID);pas important
	
	
	}
	//generate id
	
	private  void setStudentID() {
		id++;
		this.StudentID = gradeYear +""+id;
		
		
		
	}
	//enrol in courses
	
	public void enroll() {
		
		do {
			
		
		System.out.print("Enter course to enroll (Q to quit): ");
		
		Scanner in=new Scanner(System.in);
		String course =in.nextLine();
		
		if (!course.equals("Q")) {
			
		courses = courses + "\n" + course;
		
		TuitionBalance	=TuitionBalance + costOfCours;
			
		}
		else {
			
//			System.out.println("Beak");
			break;}
			
		}while(1!=0);
		
		
		//	System.out.println("Enroll in  " + courses);pas important
//		System.out.println("T.Balance  " + TuitionBalance);
//	
	}
	//view balance

	
	public void ViewBalance() {
	
		z= courses+TuitionBalance;
		
	System.out.println("your Balance is: $" + TuitionBalance  );	
		
	}
	//Pasy tuition
	public void payementTuit() {
		
		ViewBalance();
		System.out.print("Enter your payement : $ ");
		Scanner in =new Scanner(System.in);
		int payement = in.nextInt();
		TuitionBalance=TuitionBalance-payement;	
		System.out.println("Thank you for your Payent of $" + payement );
		
		ViewBalance();
		
	}
	//show statut
	
	public String toString() {
		return "Name:" + firstName + " " + lastName +
				"\nGrade Level:" +gradeYear +
				"\nStudentID:"   + StudentID +
				"\nCourses Enrolled:" +courses +
				"\nBalance : $" + TuitionBalance;
		
		
		
	}
	
	
	}
	
	
	
	


