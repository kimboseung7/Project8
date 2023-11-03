package override.quiz;

public class Qz3 {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		Computer computer2 = new Laptop();
		computer2.on();
		computer2.off();
		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();
	}

}

class Computer {
	public void on() {
		System.out.println("컴퓨터를 킨다");
	}

	public void off() {
		System.out.println("컴퓨터를 끈다");
	}
}

class Laptop extends Computer {

	@Override
	public void on() {
		System.out.println("노트북을 킨다"); // 재정의 해서 코드가 다르게 출력됨
	}

	@Override							//오버라이드된 함수는 프로그램이 동작할 때 
	public void off() {
		System.out.println("노트북을 끈다 ");

	}

}

class Desktop extends Computer {

	@Override
	public void on() {
		System.out.println("데스크탑을 킨다");
	}

	@Override
	public void off() {
		System.out.println("데스크탑을 끈다");

	}

}