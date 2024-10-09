package AbstractPractice;

public class MainClassAbstract2 {

	public static void main(String[] args) {
		AbstractClass2 Ref = new COncreteClass2();
		Ref.start();
		COncreteClass2 Ref2 = new COncreteClass2();
		Ref2.end();
		System.out.println("String length is  =" + Ref.s.length());
		System.out.println("charcter is printing  =" + Ref2.s.charAt(4));
		System.out.println("lowercase letters in my string is =  " + Ref2.s.toLowerCase());
		System.out.println("uppercase letters in my string is = " + Ref2.s.toUpperCase());
		System.out.println(Ref.s.toCharArray());
	}

}
