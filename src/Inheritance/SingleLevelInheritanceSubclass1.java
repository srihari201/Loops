package Inheritance;

public class SingleLevelInheritanceSubclass1 extends SingleLevelInheritanceSuperclass1 {
	long phonenumber = 8179653479l;
	String email = "sri@gmail.com";
	String password = "sri@123";
	String NewPassword = "hari@123";

	public void ResetPassword() {
		System.out.println("enter the phonenumber " + phonenumber);
		System.out.println("enter the email " + email);
		System.out.println("enter the password" + password);
		System.out.println("click on forget password");
		System.out.println("set new password  " + NewPassword);
	}

}
