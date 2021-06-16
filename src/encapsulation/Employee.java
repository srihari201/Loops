package encapsulation;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;

	}

	public double getsalary() {
		return salary;

	}

	public void setsalary(double salary) {
		this.salary = salary;

	}

	public void setid(int id) {
		this.id = id;

	}

	public void setname(String name) {
		this.name = name;

	}

}
