package typecasting.quiz;

public class Qz1 {

	public static void main(String[] args) {
		Parents vc = new Child("한국", "고", "길동");
		System.out.println(vc.lastName);
		System.out.println(vc.nationality);
		
		//System.out.println(vc.firstname); //자식의 특성은 사용x
	}
}

class Parents {
	String nationality; //객체를 생성 후 멤버변수 값 초기화 -> 값을 넣어줘야함
	String lastName;

	public Parents(String nationality, String lastName) { //입력 받아야되니까 generate
		super();
		this.nationality = nationality; 
		this.lastName = lastName;
	}
}

class Child extends Parents {
	String firstName;

	public Child(String nationality, String firstName, String secondName) { //입력 받아야되니까 generate
		super(nationality, firstName);
		this.firstName = firstName;
	}

	public void showInfo() {
		System.out.println("이름:" + firstName);
	}
}