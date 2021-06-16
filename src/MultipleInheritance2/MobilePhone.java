package MultipleInheritance2;

public class MobilePhone implements phone {

	@Override
	public void charging() {
		System.out.println("charging");

	}

	@Override
	public void adapter() {
		System.out.println("adapter");
	}

	@Override
	public void colour() {
		System.out.println("colour");
	}

	@Override
	public void weight(int a) {
		System.out.println("weight=" + a);
	}

}
