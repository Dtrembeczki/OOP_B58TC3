package base;

public class Employe {
	
	private String name;
	private int age;
	private int salary;
	
	
	public Employe(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		salary = (int)((age * 0.4)*1000);
	}

	
	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	// my functions
	
	public void raiseSalary(double percent) {
		salary += (salary * (percent/100));
	}
	
	
	// Getters & Setters

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
