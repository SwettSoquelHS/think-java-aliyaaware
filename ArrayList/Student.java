public class Student{
	protected String studentName;
	protected int age;
	protected int grade;

	Student(String name, int age, int grade){
		studentName=name;
		this.age=age;
		this.grade=grade;
	}

	String getName(){
		return studentName;
	}

	int getAge(){
		return age;
	}

	int getGrade(){
		return grade;
	}
}