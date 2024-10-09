package MethodOverLoading;

public class FaceBook {
	public void Search() {
		System.out.println("zero argument method overloading");
			
		}
	public void search(int a) {
		System.out.println("enter the data in search button="+a);
		System.out.println("fetch the data ="+a);
		System.out.println("showing the results ="+a);
	}
	public void search(double b) {
		System.out.println("enter the data as double argument ="+b);
		System.out.println("fetch the data ="+b);
		System.out.println("showing the results=");
		
	}

}
