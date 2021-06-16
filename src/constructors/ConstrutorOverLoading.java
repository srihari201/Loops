package constructors;

public class ConstrutorOverLoading {

	ConstrutorOverLoading() {
		System.out.println("zero argumenrt");
	}

	ConstrutorOverLoading(int a) {
		this();
		System.out.println("int arg constructor");
	}

	ConstrutorOverLoading(double b) {

		this(68);
		System.out.println("double arg constructor");
	}

	public static void main(String[] args) {
		ConstrutorOverLoading Ref = new ConstrutorOverLoading(6.3);
		ConstrutorOverLoading Ref2 = new ConstrutorOverLoading(6);
		System.out.println(Ref2);
		System.out.println(Ref);

	}
}
