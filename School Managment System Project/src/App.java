import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
	
		Teacher ann = new Teacher(1, "Ann", 600);
		Teacher maya = new Teacher(2, "Maya", 800);
		Teacher michael = new Teacher(3, "Michael", 700);
		
		ArrayList<Teacher> teacherList = new ArrayList<>();
		teacherList.add(ann);
		teacherList.add(maya);
		teacherList.add(michael);
		
		Student melisa = new Student(1, "Melisa", 5);
		Student sean = new Student(2, "Sean", 8);
		Student maria = new Student(3, "Maria", 12);
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(melisa);
		studentList.add(sean);
		studentList.add(maria);
		
		School school = new School(teacherList, studentList);
		
		melisa.payFees(5000);
		sean.payFees(6500);
		
		System.out.println("The School har earned $ " + school.getTotalMoneyEarned());
		
		System.out.println("****School spent money*******");
		
		ann.receiveSalary(ann.getSalary());
		
		
		System.out.println("Schools has spent for salary to " + ann.getName()+ " and now their budget is "+ school.getTotalMoneyEarned());
		
	}

}
