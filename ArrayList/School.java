import java.util.ArrayList;
import java.util.Scanner;

public class School{
	public static void main(String[] args){
		
		School soquel = new School();
		soquel.addStudent("fred", 17, 11);
		soquel.addStudent("Sally", 15, 10);
		soquel.addStudent("juan", 16, 12);
		soquel.addStudent("lisa", 18, 12);
		soquel.addStudent("jenna", 15, 10);
		soquel.addStudent("pam", 14, 9);
		soquel.addStudent("josh", 16, 11);

		soquel.printClass();
		System.out.println(" ");
		// System.out.println("Number of students in this school is: " + soquel.numberOfStudents());
		// System.out.println("Average age of students in this school is " + soquel.averageAgeOfStudents() + " years old.");
		
		//ADDING A STUDENT
		Scanner console = new Scanner (System.in);
		System.out.print("Would you like to add a student? y/n: ");
		String new_student = console.next();
		if (new_student.equals("y")){
			System.out.print("enter their name: ");
			new_student = console.next();
			System.out.print("enter their age: ");
			int age = console.nextInt();
			System.out.print("enter their grade: ");
			int grade = console.nextInt();

			soquel.addStudent(new_student, age, grade);
			soquel.printClass();

		}else{ //REMOVING A STUDENT AND FINDING
			Scanner removal = new Scanner (System.in);
			System.out.print("would you like to remove a student? y/n: ");
			String myStudent = removal.next();
			if (myStudent.equals("y")){
				System.out.print("enter their name: ");
				myStudent = removal.next();
				if(soquel.findStudent(myStudent))
				{
					System.out.println("");
					System.out.print("student has been found: ");
					System.out.println("");

					Scanner assure = new Scanner (System.in);
					System.out.print ("Are you sure you want to remove " + myStudent +"? y/n ");
					String yes = assure.next();
					if (yes.equals("y")){
						soquel.removeStudent(myStudent);
						System.out.println("here are all of the students left: ");
						soquel.printClass();
					}else
					{
						System.out.println("try again");
					}
				}else{
					System.out.println("couldnt find that student, here are all of the students ");
					soquel.printClass();
				}
			}else{
				System.out.print("here are all of the students");
				soquel.printClass();
			}
		}

		Scanner lookUp = new Scanner (System.in);
		System.out.print("Look up a student by typing their name: ");
		String newName = lookUp.next();
		if(soquel.findStudent(newName)){
			System.out.println("Your student is here ");
		}else{
			Scanner add = new Scanner (System.in);
			System.out.print("Would you like to add a student? y/n: ");
			String nname = add.next();
			if (nname.equals("y")){
				System.out.print("enter their name: ");
				nname = add.next();
				System.out.print("enter their age: ");
				int age = add.nextInt();
				System.out.print("enter their grade: ");
				int grade = add.nextInt();

				soquel.addStudent(nname, age, grade);
				soquel.printClass();
			}else{
				System.out.print("BYE!!!");
			}
		}
		//student 

		
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

	boolean findStudent(String stuName){
		boolean result = false;
		int found = -1;
		for (int i=0; i < students.size(); i++){
			Student stu = students.get(i);
            if( stuName.equals(stu.getName())){
                found = i;
                System.out.print("\t" + stu.getName() + " is " + stu.getAge() + " years old and in grade " +  stu.getGrade());
                break;
            }
		}

		//System.out.print("\t" + stu.getName() + " is " + stu.getAge() + " years old and in grade " +  stu.getGrade());

		if (found > 0){
			result = true;
			//Student newStudent = new Student(stuName, stuAge, stuGrade);
		}

		return result;
	}

	void printClass(){
		for(Student stu: students){
            System.out.println("\t" + stu.getName() + " is " + stu.getAge() + " years old and in grade " + 
                stu.getGrade());
        }
	}

	// int averageAgeOfStudents(){
	// 	int result =0;
	// 	int age =0;
	// 	for(Object o: students){
	// 		Student stu = (Student)o;
	// 		age+=stu.getAge();
	// 	}
	// 	//age = age/students;
	// 	if (age>0)
	// 		result =age/2;
	// 	return result;
	// }

	int numberOfStudents(String[] names){
		int name =0;
		int totalStudents =0;
		students = new ArrayList<Student>();

		for(int i=0; i < names.length; i++){
			String firstName = names[i];
			for(int k =i+1; k<names.length; i++){
				Student s = new Student(firstName, 0, 0);
				students.add(s);
			}
		}

		// for(Object o: students){
		// 	Student stu = (Student)o;
		// 	grade += stu.getGrade();
			
		// }
		// if(grade > 0)
		// 	result = grade;

        return totalStudents;
        // totalStudents=0;
        // for (int i=0; i <students.length; i++){
        // 	students[i]=totalStudents;
        // }
        // return totalStudents;
	}
}