package encapsulation;

public class Student {
	private String name;
	private int id;
	private String address;

	public Student(String name, int id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;

	}

	public String getname() {
		return name;
	}

	public int getid() {
		return id;

	}

	public String getaddress() {
		return address;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setaddress(String address) {
		this.address=address;
	}

}
