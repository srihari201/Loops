package constructors;

public class ConstructorWithArguments2 {
	int a;
	String s;

	private ConstructorWithArguments2(int a, String s) {
		this.a = a;
		this.s = s;
	}

	public static void main(String[] args) {
		ConstructorWithArguments2 af = new ConstructorWithArguments2(45, "raj");
		System.out.println(af.a);
		System.out.println(af.s);
	}

}
