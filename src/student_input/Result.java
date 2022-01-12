package student_input;

public class Result {
	public String getGrade(double avg) {
		if(avg>=90 & avg<=100){
			System.out.println("Your Grade is: A");

		}else if(avg>=80 & avg<=90){
			System.out.println("Your Grade is: B");

		}else if(avg>=70 & avg<=80){
			System.out.println("Your Grade is: C");

		}else if(avg>=60 & avg<=70){
			System.out.println("Your Grade is: D");

		}else if(avg>=50 & avg<=60){
			System.out.println("Your Grade is: E");

		}else{
			System.out.println("No Grade");
		}
	return "0";
}

public String getResult(double marks1,double marks2,double marks3,double marks4,double marks5) {
	
	if(marks1>=35 & marks2>=35 & marks3>=35 & marks4>=35 &marks5>=35){
		System.out.println("Your Result is: Pass");
	}else{
		System.out.println("Your Result is: Fail");
	}
	return "result";
}

}
