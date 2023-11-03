package typecasting;

public class Ex2 {

	public static void main(String[] args) {
		VIPCustomer2 vip = new VIPCustomer2("둘리");

	}

}
class Customer2 {
	String customerName;
	String customerGrade;
	double bonusPoint; 
	double bonusRatio; 
	//이름을 매개변수로 받는 생성자 추가

	public Customer2(String cutomerName) {
		this.customerName = cutomerName;
		customerGrade = "SILVER"; 
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출"); 
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

	public VIPCustomer2(String customerName) { //매개변수 받아야함
		super(customerName); //부모클래스에 맞게 호출 -> 안하면 에러
		customerGrade = "VIP";
		bonusRatio = 0.05; 
		saleRatio = 0.1; 
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
}