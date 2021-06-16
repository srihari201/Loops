package constructors;

public class ConstructorWithArguments {
	int a;
	String s;

	ConstructorWithArguments(int a, String s) {
		a = a;
		s = s;
	}

	public static void main(String[] args) {
		ConstructorWithArguments af = new ConstructorWithArguments(45, "raj");
		System.out.println(af.a);
		System.out.println(af.s);
	}

}
