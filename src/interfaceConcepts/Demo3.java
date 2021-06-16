package interfaceConcepts;

public class Demo3 implements Demo2 {

	@Override
	public void test() {
		System.out.println(
				"hello test method i am concrete classs and i am providing the implimentation for you here do not worry ");

	}

	@Override
	public void end() {
		System.out.println(
				"hello end method  i am concrete class and i am providing the imlimentation for you here do not worrry ");
	}

	@Override
	public void start() {
		System.out.println(
				"hello start method i am concrete class and i am  providing the implimentarion for you here do not worry");
	}

}
