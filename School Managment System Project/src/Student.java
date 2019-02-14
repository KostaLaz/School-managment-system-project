
//This class is responsible for keeping track of students

public class Student {

	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int totalFees;
	
	public Student(int id, String name, int grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.totalFees = 30000;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getTotalFees() {
		return totalFees;
	}
	

	
	
}
