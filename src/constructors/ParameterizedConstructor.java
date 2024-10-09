package constructors;

public class ParameterizedConstructor {
	String colour;
	int size;
	double price;

	private ParameterizedConstructor(String colour, int size, double price) {
		this.colour = colour;
		this.size = size;
		this.price = price;
		System.out.println("colour is " + colour);
		System.out.println("size is " + size);
		System.out.println("price is " + price);
	}

	public static void main(String[] args) {
		ParameterizedConstructor Ref = new ParameterizedConstructor("blue", 85, 89.6);
		System.out.println(Ref.colour);
		System.out.println(Ref.size);
		System.out.println(Ref.price);

		ParameterizedConstructor Ref2 = new ParameterizedConstructor("green", 65, 65.9);
		System.out.println(Ref2.colour);
		System.out.println(Ref2.size);
		System.out.println(Ref2.price);

	}

}
