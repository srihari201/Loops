package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Employee e = new Employee(1, "resma", 56311);
		System.out.println(e.getid());
		System.out.println(e.getname());
		System.out.println(e.getsalary());
		e.setid(2);
		e.setname("rani");
		e.setsalary(4569);
		System.out.println(e.getid());
		System.out.println(e.getname());
		System.out.println(e.getsalary());

	}

}
