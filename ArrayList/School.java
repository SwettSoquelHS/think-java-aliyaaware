import java.util.ArrayList;

public class School{
	public static void main(String[] args){
		
		School soquel = new School();
		soquel.addStudent("fred", 17, 11);
		soquel.addStudent("sally", 15, 10);

		soquel.printClass();
		System.out.println("Number of students in this school is: " + soquel.numberOfStudents());
		System.out.println("Average age of students in this school is " + soquel.averageAgeOfStudents() + " years old.");
		System.out.println("Number of students in each grade is: " + soquel.studentsInGrade());			
		
	}

	ArrayList<Student> students = new ArrayList<Student>();

	School(){
		students = new ArrayList();
	}

	void addStudent(String stuName, int stuAge, int stuGrade){
		Student newStudent = new Student(stuName, stuAge, stuGrade);
		students.add(newStudent);
	}

	boolean removeStudent(String stuName){
		boolean result = false;
        int deleteAt = -1;
        for(int i = 0; i < students.size(); i++){
            Student stu = students.get(i);
            if( stuName.equals(stu.getName()) ){
                deleteAt = i;
                break;
            }
        }

        if( deleteAt >= 0){
            result = true;
            students.remove(deleteAt);
        }

        return result;
	}

	int averageAgeOfStudents(){
		int result =0;
		int age =0;
		for(Object o: students){
			Student stu = (Student)o;
			age+=stu.getAge();
		}
		//age = age/students;
		if (age>0)
			result =age/2;
		return result;

	}

	int studentsInGrade(){
		return 5;
	}

	int numberOfStudents(){
		int result=0; 
		int grade =0;
		int totalStudents =0;

		for(Object o: students){
			Student stu = (Student)o;
			grade += stu.getGrade();
			
		}
		if(grade > 0)
			result = grade;

        return result;
        // totalStudents=0;
        // for (int i=0; i <students.length; i++){
        // 	students[i]=totalStudents;
        // }
        // return totalStudents;

	}

	void printClass(){
		for(Student stu: students){
            System.out.println("\t" + stu.getName() + " is " + stu.getAge() + " years old and in grade " + 
                stu.getGrade());
        }
	}
}