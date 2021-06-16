package encapsulation2;

public class MainClass {

	public static void main(String[] args) {
		Employee REf = new Employee(12, 897456);
		System.out.println("gettting the empid = " + REf.getempid());
		System.out.println("gettting the empNumber = " + REf.getempNumber());
		REf.setempid(13);
		System.out.println("set new employee id  =" + REf.getempid());
		REf.setempNumber(897458);
		System.out.println("set new employee number  =" + REf.getempNumber());

	}

}
