package constructors;

public class ConstrutorOverLoading2 {

	ConstrutorOverLoading2(double b) {
		this(56);
		System.out.println("double arg constructor");
	}

	ConstrutorOverLoading2(int a) {
		this();
		System.out.println("int areg consyrucutor");
	}

	ConstrutorOverLoading2() {

		System.out.println("zero arg constructor");
	}

	public static void main(String[] args) {
		ConstrutorOverLoading2 ref2 = new ConstrutorOverLoading2(1.2);
		System.out.println(ref2);

	}

}
