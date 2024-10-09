package encapsulation2;

public class Employee {
	private int empid;
	private int empNumber;

	Employee(int empid, int empNumber) {
		this.empid = empid;
		this.empNumber = empNumber;
		System.out.println(empid);
		System.out.println(empNumber);
	}

	public int getempid() {
		return empid;
	}

	public int getempNumber() {
		return empNumber;
	}

	public void setempid(int empid) {
		this.empid = empid;

	}

	public void setempNumber(int empNumber) {
		this.empNumber = empNumber;
	}

}
