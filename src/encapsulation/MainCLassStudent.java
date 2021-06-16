package encapsulation;

public class MainCLassStudent {

	public static void main(String[] args) {
Student s=new Student("ramesh",1,"varanagal");
System.out.println(s.getaddress());
System.out.println(s.getaddress());
System.out.println(s.getid());
System.out.println(s.getname());
s.setaddress("lb nagar");
s.setid(2);
s.setname("abhi");
System.out.println(s.getaddress());
System.out.println(s.getname());
System.out.println(s.getid());
	}

}
