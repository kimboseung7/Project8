package polymorphism.quiz;

import java.util.ArrayList;


public class Qz2 {

	public static void main(String[] args) {
		System.out.println("===== 회원등급에따라 할인율과 보너스 포인트 계산=====");
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
//		Customer customer1 = new Customer("둘리");
//		Customer customer2 = new VIPCustomer("마이클");
//		Customer customer3 = new GoldCustomer("고길동");
//		
//		customerList.add(customer1);
//		customerList.add(customer2);
//		customerList.add(customer3);
		//위에 주석이랑 같음
		customerList.add(new Customer("둘리"));
		customerList.add(new GoldCustomer("또치"));
		customerList.add(new VIPCustomer("도우너"));
		
		for (Customer customer : customerList) {
			customer.calcPrice(10000);
		}
		for (Customer customer : customerList) {
			customer.showInfo();
		}
//		for (int i = 0; i< customerList.size(); i++) {
//			Customer customer = customerList.get(i);
//			customer.calcPrice(10000);
//		}
	}
}

class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;
	// 이름을 매개변수로 받는 생성자 추가

	public Customer(String cutomerName) {
		this.customerName = cutomerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;

	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName + "님이" + price + "원을 결제했습니다");
	}

	public void showInfo() {
		System.out.println(customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다");
	}
}

class VIPCustomer extends Customer {
	double saleRatio;//

	public VIPCustomer(String customerName) { // 매개변수 받아야함
		super(customerName); // 부모클래스에 맞게 호출 -> 안하면 에러
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		

		
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이" + salePrice+ "원을 결제했습니다");
	}
}

class GoldCustomer extends Customer {
	double saleRatio;

	public GoldCustomer(String customerName) { // 매개변수 받아야함
		super(customerName); // 부모클래스에 맞게 호출 -> 안하면 에러
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;

	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio);
		System.out.println(customerName + "님이" + salePrice+ "원을 결제했습니다" );
	}
}
