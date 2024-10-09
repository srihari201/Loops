package constructors;

public class COnstructorOverloading4 {

	COnstructorOverloading4() {
		this(78.6);
		System.out.println("zero arg constructor");

	}

	COnstructorOverloading4(int a) {
		System.out.println("int arg constructor");

	}

	COnstructorOverloading4(double b) {
		this(45);
		System.out.println("double arg constructor");

	}

	public static void main(String[] args) {

		new COnstructorOverloading4();
	}
}
