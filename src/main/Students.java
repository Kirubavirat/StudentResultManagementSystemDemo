package main;

import java.util.ArrayList;

import details.StudentDetails;
import student_input.Result;
import student_input.UserDetails;

public class Students {

	public static void main(String[] args) throws Exception {
		UserDetails st = new UserDetails();
		Result s1 = new Result();
		ArrayList<StudentDetails> arr =  st.userInputData();
		
		for(StudentDetails s : arr)
		{
			System.out.println("Your Results Are.......!");
			System.out.println("Id is : "+s.getId());
			System.out.println("Name :"+s.getName());
			System.out.println("Course is : "+s.getCourse());
			System.out.println("Subject1 : "+s.getSub1());
			System.out.println("Subject2 : "+s.getSub2());
			System.out.println("Subject3 : "+s.getSub3());
			System.out.println("Subject4 : "+s.getSub4());
			System.out.println("Subject5 : "+s.getSub5());
			System.out.println("Total is: "+s.getTotal());
			System.out.println("Average is: "+s.getAvg());
			s1.getGrade(s.avg);
			s1.getResult(s.getSub1(),s.getSub2(),s.getSub3(),s.getSub4(),s.getSub5());
		}

	}

}
