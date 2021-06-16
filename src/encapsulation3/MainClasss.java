package encapsulation3;

public class MainClasss {

	public static void main(String[] args) {
		Bank Ref = new Bank(1, 430000, 1452);
		System.out.println("getting the ID number from the bank by using getter =" + Ref.getid());
		System.out.println("getting the bankbal   from the bank by using getter =" + Ref.getbankbal());
		System.out.println("getting the   pin      from the bank by using getter =" + Ref.getpin());
		Ref.setid(2);
		System.out.println("setting new id by using setter method =" + Ref.getid());
		System.out.println("setting new pin by using setter method = " + Ref.getpin());

	}

}
