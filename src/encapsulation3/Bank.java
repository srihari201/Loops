package encapsulation3;

public class Bank {
	private int id;
	private int bankbal;
	private int pin;

	protected Bank(int id, int bankbal, int pin) {
		this.id = id;
		this.bankbal = bankbal;
		this.pin = pin;
		System.out.println(id);
		System.out.println(bankbal);
		System.out.println(pin);

	}

	public int getid() {
		return id;
	}

	public int getbankbal() {
		return bankbal;

	}

	public int getpin() {
		return pin;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void setpin(int pin) {
		this.pin = pin;
	}
}
