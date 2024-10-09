package constructors;

public class ConstructorOverloading2 {
	int a = 45;

	ConstructorOverloading2() {
		System.out.println("zero arg constructor");
	}

	ConstructorOverloading2(int a) {
		this();
		System.out.println("int arg constructor");
	}

	ConstructorOverloading2(double b) {

		this(45);

		System.out.println("double arg constructor");
	}

	public static void main(String[] args) {
		ConstructorOverloading2 Ref = new ConstructorOverloading2(3.5);
		System.out.println(Ref);
		System.out.println();
		System.out.println(Ref.a);

	}
}
