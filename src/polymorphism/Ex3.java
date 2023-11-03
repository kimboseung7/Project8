package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		moveAnimal(new Human());
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}

	public static void moveAnimal(Animal animal) { //move 메소드 호출
		animal.move(); //생성되는 시점이 같아야되서 static을 붙임
	}
}
