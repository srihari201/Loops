package MultipleInheritance2;

public class MainClasss {

	public static void main(String[] args) {
		MobilePhone Ref = new MobilePhone();
		System.out.println(Ref);
		Ref.adapter();
		Ref.charging();
		Ref.colour();
		System.out.println(Ref.s.length());
		System.out.println(Ref.s.charAt(5));
		System.out.println(Ref.s.toString());
		System.out.println(Ref.s.toCharArray());
		System.out.println(Ref.a);
	}

}
