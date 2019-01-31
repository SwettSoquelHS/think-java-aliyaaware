import java.util.ArrayList;

public class School{
	public static void main(String[] args){
		
		School soquel = new School();
		soquel.addStudent("fred", 16, 11);
		soquel.addStudent("sally", 15, 10);

		soquel.printSchool();
		System.out.println("students in this school is: " + soquel.numberOfStudents());

		
	}

	ArrayList<Student> students;

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
	}

	void printClass(){
		for(Student stu: students){
            System.out.println("\t" + stu.getName() + ": " + stu.getAge() +
                " / " + stu.getGrade());
        }
	}
}