import java.util.ArrayList;

public class School {

	// We create an ArrayLinst insteead of Array so we can add or remove teachers and students
	//we can`t do that with array. That is why we use an ArrayList.
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	//We create a new School objet with list of Student and Teacher in the constructor.
	public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
    //Returns the list o teachers in the school
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	//Add a teacher to the school
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	//Returns the list of students in the school
	public ArrayList<Student> getStudents() {
		return students;
	}

	//Add a stundent to the school
	public void addStudents(Student student) {
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	//Adds the total money earned by the school
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned +=moneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	//Update the money that are spent by the school(in our case the teachers salary)
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}


	
	
	
}
