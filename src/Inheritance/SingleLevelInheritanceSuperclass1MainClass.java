package Inheritance;

public class SingleLevelInheritanceSuperclass1MainClass {

	public static void main(String[] args) {
		SingleLevelInheritanceSubclass1 Ref = new SingleLevelInheritanceSubclass1();
		System.out.println(Ref);
		// System.out.println(Ref.Password);
		Ref.createPaytmAccount();
		Ref.ResetPassword();
	}

}
