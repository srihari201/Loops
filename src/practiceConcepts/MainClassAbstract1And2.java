package practiceConcepts;

public class MainClassAbstract1And2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Program2Abstract Ref = new Program2Abstract();
		System.out.println(Ref);
		Ref.test();
		System.out.println(Ref.a);

		System.out.println("main method ended");
	}

}
