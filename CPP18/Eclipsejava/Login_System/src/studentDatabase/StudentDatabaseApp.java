package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
//		
//		
//		Student st2=new Student();
//		st2.enroll();
//		st2.ViewBalance();
//		st2.payementTuit();
//		st2.showInfo();
//		System.out.println(st1.toString());
//		
//		
//		
//		Student st3=new Student();
//		st3.enroll();
//		st3.ViewBalance();
//		st3.payementTuit();
//		st3.showInfo();
//		System.out.println(st1.toString());
//		
		
		
		//ask data
		
	System.out.print("Enter Number of Student to enrool:  ");	
	Scanner in =new Scanner(System.in);
	int numOfStudents = in.nextInt();
	Student[] students = new Student[numOfStudents];
	
	
	for(int n = 0; n < numOfStudents; n++) {
		
        students[n]=new Student();
        students[n].enroll();
        students[n].payementTuit();
//        students[n]=new Student();
//        
//        
//		Student stu=new Student();
//		stu.enroll();
//		stu.ViewBalance();
//		stu.payementTuit();
//		stu.showInfo();
		System.out.println(students[n].toString());	
        
    }    
        
     System.out.println(students[0].toString());    
     System.out.println(students[1].toString());       
	 System.out.println(students[2].toString());   	
      
		
		
		//Creat n number Of new Student
	}

}
