package polymorphism;


public class Ex2 {

	public static void main(String[] args) {
		Customer2 customer1 = new Customer2("둘리");
		customer1.calcPrice(10000);
		customer1.showInfo();
		
		Customer2 customer2 = new VIPCustomer2("또치");
		customer2.calcPrice(10000);
		customer2.showInfo();


	}

}
class Customer2 {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	// 이름을 매개변수로 받는 생성자 추가

	public Customer2(String cutomerName) {
		this.customerName = cutomerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이" + price + "원을 결제했습니다");
	}

	public void showInfo() {
		System.out.println(customerName + "님의 등급은" + customerGrade + "입니다");
	}
}

class VIPCustomer2 extends Customer2 {
	double saleRatio;//

	public VIPCustomer2(String customerName) { 
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		

	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price *saleRatio); //(int)를 안쓰면 double로 나옴 그래서 (int)를 붙여서 형변환 시켜줌
		System.out.println(customerName + "님이" + salePrice + "원을 결제했습니다");
	}
}