package MethodOverLoading;

public class Whatsapp {
	public void Textmessage(String s) {
		System.out.println("search the contact ");
		System.out.println("select the contact" + s);
		System.out.println("type the message" + s);
		System.out.println("click on send button");

	}

	public void Textmessage(long a) {
		System.out.println("long arg method");
		System.out.println("select the contact" + a);
		System.out.println("type the message" + a);
		System.out.println("click on send button");

	}

	public void Textmessage(String s1, int a1) {
		System.out.println("string and int arg methods" + s1 + a1);

		System.out.println("select the contact " + s1 + a1);
		System.out.println("type the message" + s1 + a1);
		System.out.println("click on send button");
	}

}
