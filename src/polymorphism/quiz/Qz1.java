package polymorphism.quiz;

public class Qz1 {

	public static void main(String[] args) {
		runCar(new Bus());
		runCar(new SportsCar());
	}
	public static void runCar(Bus bus){
		bus.run();
	}
	public static void runCar(SportsCar sportscar){
		sportscar.run();
	}


}
class Car{
	public void run() {
		System.out.println("자동차가 달린다");
	}
	
}
class Bus extends Car{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달린다");
	}
	
}
class SportsCar extends Car{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("스포츠카가 달린다");
	}
	
}