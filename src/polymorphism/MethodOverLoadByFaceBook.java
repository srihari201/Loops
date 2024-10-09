package polymorphism;

public class MethodOverLoadByFaceBook {
public void FaceBooklogin(String username,String Password) {
	System.out.println("login facebook using email id ");
}
public void FaceBooklogin(Long ContactNum,String Password) {
System.out.println("login facebook using mobile number");	
	
}
}
