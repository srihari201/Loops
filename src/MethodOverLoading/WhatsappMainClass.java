package MethodOverLoading;

public class WhatsappMainClass {

	public static void main(String[] args) {
		Whatsapp Ref = new Whatsapp();
		Ref.Textmessage(8179653479l);
		Ref.Textmessage("hello bro how are you");
		Ref.Textmessage("you hr round srihari", 45678);
		System.out.println(Ref);

	}

}
