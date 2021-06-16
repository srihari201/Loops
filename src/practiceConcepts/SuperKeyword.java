package practiceConcepts;

public class SuperKeyword {
	String s = "jaisriram";
	String s2 = "jaiHanuman";
	int i = 2344;

	SuperKeyword() {
		System.out.println(this.s);
		System.out.println(this.s2);
		System.out.println(SuperKeyword.this);
	}

}
