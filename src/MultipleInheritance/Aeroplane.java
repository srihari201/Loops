package MultipleInheritance;

public class Aeroplane implements vehicle, FllyingMachine {

	@Override
	public void fly() {
		System.out.println("flying ");
	}

	@Override
	public void move() {
		System.out.println("moving ");
	}

}
