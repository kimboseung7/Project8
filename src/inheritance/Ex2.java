package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		Student student = new Student();
		student.sound();
		student.eat();
		student.study();
		
		System.out.println();
		Professor professor = new Professor();
		professor.sound();
		professor.eat();
		professor.work();
	}

}
//사람 클래스  //부모 클래스는 자식 클래스 여러개 생성가능
class Person{
	public void sound() {
		System.out.println("대화를 한다");
	}
	public void eat() {
		System.out.println("밥을 먹는다");
	}
}
//학생 클래스
class Student extends Person{
	public void study() {
		System.out.println("공부를 한다");
	}
	
}
//교수 클래스
class Professor extends Person{
	public void work() {
		System.out.println("일을 한다");
	}
}