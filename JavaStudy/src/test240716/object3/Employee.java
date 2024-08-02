package test240716.object3;

public class Employee extends Person{
	private int salary;
	private String dept;
	public Employee() {
		super();
	}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	
	
	@Override
	public String toString() {
		return super.getName() + ", " + super.getAge() + ", " + super.getHeight() + ", " + super.getWeight() + ", " + salary + ", " + dept;
	}
	
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
