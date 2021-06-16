package constructors;

public class ConstructorOverloading {

	ConstructorOverloading() {
		System.out.println("zero arg constructor");
	}

	ConstructorOverloading(int a) {
		System.out.println("int arg constructor");

	}

	ConstructorOverloading(double b) {
		System.out.println("double arg constructor");
	}

	public static void main(String[] args) {
		ConstructorOverloading Ref = new ConstructorOverloading();
		ConstructorOverloading Ref2 = new ConstructorOverloading(45);
		ConstructorOverloading Ref3 = new ConstructorOverloading(56.5);
		System.out.println(Ref);
		System.out.println(Ref2);
		System.out.println(Ref3);

	}
}
