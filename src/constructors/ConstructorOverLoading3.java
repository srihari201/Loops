package constructors;

public class ConstructorOverLoading3 {
	//int a = 50 + 1;

	ConstructorOverLoading3() {

		System.out.println("zero arg constructor");
	}

	ConstructorOverLoading3(int a) {
		this(56.6, 65 + 1);

		System.out.println("int arg constructor");
	}

	ConstructorOverLoading3(double b, int a) {
		this();

		System.out.println("double and int arg constructor");

	}

	public static void main(String[] args) {
		ConstructorOverLoading3 Ref = new ConstructorOverLoading3(45);
		System.out.println(Ref);
		//System.out.println(Ref.a);
		ConstructorOverLoading3 Ref2 = new ConstructorOverLoading3(45);
		System.out.println(Ref2);
		//System.out.println(Ref2.a);
	}

}
