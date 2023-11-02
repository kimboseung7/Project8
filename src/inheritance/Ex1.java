package inheritance;

public class Ex1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.nationality = "한국";
		child.lastName = "고";
		child.firstName = "길동";

	}

}

class Parents{
	String nationality; //국적
	String lastName; // 성씨
}

class Child extends Parents{
	String firstName; //이름
}