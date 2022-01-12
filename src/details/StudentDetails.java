package details;

public class StudentDetails {

	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public double getSub1() {
		return sub1;
	}


	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}


	public double getSub2() {
		return sub2;
	}


	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}


	public double getSub3() {
		return sub3;
	}


	public void setSub3(double sub3) {
		this.sub3 = sub3;
	}


	public double getSub4() {
		return sub4;
	}


	public void setSub4(double sub4) {
		this.sub4 = sub4;
	}


	public double getSub5() {
		return sub5;
	}


	public void setSub5(double sub5) {
		this.sub5 = sub5;
	}


	public StudentDetails(int id, String name, String contact, String course, double sub1, double sub2, double sub3, double sub4,
			double sub5,int total,double avg,String grade,String result) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.course = course;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.total = total;
		this.avg = avg;
		this.grade = grade;
		this.result=result;
	}

	



	public void setResult(String result) {
		this.result = result;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int id;
	public String name;
	public String contact;
	public String course;
	public double sub1;
	public double sub2;
	public double sub3;
	public double sub4;
	public double sub5;
	public int total;
	public double avg;
	public String grade;
	public String result;

}
