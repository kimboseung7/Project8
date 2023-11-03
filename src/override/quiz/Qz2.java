package override.quiz;

public class Qz2 {

	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.drink();
		Coffee coffee2 = new Americano();
		coffee2.drink();
		Coffee coffee3 = new Latte();
		coffee3.drink();

	}

}
class Coffee {
	public void drink() {
		System.out.println("커피를 마신다");
	}
}
class Americano extends Coffee{

	@Override
	public void drink() {
		System.out.println("아메리카노를 마신다");
	}
	
}
class Latte extends Coffee{

	@Override
	public void drink() {
		System.out.println("라떼를 마신다");
	
		
	}
	
}