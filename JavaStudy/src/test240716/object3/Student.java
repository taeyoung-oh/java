package test240716.object3;

public class Student extends Person{
	private int grade;
	private String major;
	
	
	
	public Student() {
		super();
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	
	
	@Override
	public String toString() {
		return super.getName() + ", " + super.getAge() + ", " + super.getHeight() + ", " + super.getWeight() + ", " + grade + ", " + major;
	}
	
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
}
