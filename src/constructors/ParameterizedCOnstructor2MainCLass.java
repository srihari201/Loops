package constructors;

public class ParameterizedCOnstructor2MainCLass {

	public static void main(String[] args) {
		ParameterizedCOnstructor2 Ref = new ParameterizedCOnstructor2("white", 61000.00, 109);
		System.out.println(Ref);
		System.out.println(Ref.colour);
		System.out.println(Ref.price);
		System.out.println(Ref.keyboardSwitches);

		ParameterizedCOnstructor2 Ref2 = new ParameterizedCOnstructor2("black", 660000.00, 106);
		System.out.println(Ref2);
		System.out.println(Ref2.colour);
		System.out.println(Ref2.price);
		System.out.println(Ref2.keyboardSwitches);

	}

}
