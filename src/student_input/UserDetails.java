package student_input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import details.StudentDetails;

public class UserDetails {

	
	ArrayList<StudentDetails> arrList;
	StudentDetails studentDetails;
	Scanner sn;
	InputStreamReader r;  
    BufferedReader brr;
	private java.lang.String grade;
	           
   
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
		sn = new Scanner(System.in);
		r=new InputStreamReader(System.in); 
		brr=new BufferedReader(r);
		studentDetails  = new StudentDetails();
		arrList = new ArrayList<StudentDetails>();
			
	}
	
	public ArrayList<StudentDetails> userInputData() throws Exception {
		System.out.println("Welcome To The Student Portel......!");
		System.out.println("Enter Student's Id :");
		int id = sn.nextInt();
		studentDetails.setId(id);
		
		System.out.println("Enter Student's Name:");
		String name  = brr.readLine();
		studentDetails.setName(name);
		
		System.out.println("Enter Student's Contact:");
		String contact  = brr.readLine();
		studentDetails.setContact(contact);
		
		System.out.println("Enter Student's Course:");
		String course  = brr.readLine();
		studentDetails.setCourse(course);
		
		System.out.println("Enter Student's Marks in Sub1:");
		double marks1  = sn.nextDouble();
		studentDetails.setSub1(marks1);
		
		System.out.println("Enter Student's Marks in Sub2:");
		double marks2  = sn.nextDouble();
		studentDetails.setSub2(marks2);
		
		System.out.println("Enter Student's Marks in Sub3:");
		double marks3  = sn.nextDouble();
		studentDetails.setSub3(marks3);
		
		System.out.println("Enter Student's Marks in Sub4:");
		double marks4  = sn.nextDouble();
		studentDetails.setSub4(marks4);
		
		System.out.println("Enter Student's Marks in Sub5:");
		double marks5  = sn.nextDouble();
		studentDetails.setSub5(marks5);
		
		int total=(int) (marks1+marks2+marks3+marks4+marks5);
		studentDetails.setTotal(total);
		
		double avg=total/5;
		studentDetails.setAvg(avg);
		
		
			
		  
		
		studentDetails.setGrade(grade);
		
		
		
		arrList.add(studentDetails);
		return arrList;
		
	}

}
