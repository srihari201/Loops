package practiceConcepts;

public class SuperKeywordSub extends SuperKeyword {
	int b = 78 + 94;
	int c = 4567;

	SuperKeywordSub() {
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(super.s);
		System.out.println(SuperKeywordSub.this);
	}

}
