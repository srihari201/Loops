package polymorphism;

public class MethodOverLoading {
	public void GoogleSearch(String s) {
		System.out.println("enter the data=" + s);
		System.out.println("fetching the data=" + s);
		System.out.println("showing the results=" + s);

	}

	public void GoogleSearch(int a) {
		System.out.println("enter the data=" + a);
		System.out.println("fetching the the data=" + a);
		System.out.println("showing  the results=" + a);
	}

	public void GoogleSearch(double b) {
		System.out.println("enter the data=" + b);
		System.out.println("fetching  the data=" + b);
		System.out.println("showing  the data=" + b);
	}
}
