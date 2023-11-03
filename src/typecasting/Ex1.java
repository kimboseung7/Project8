package typecasting;


public class Ex1 {

	public static void main(String[] args) {
		VIPCustomer vip = new VIPCustomer();
		
	}

}


class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint; 
	double bonusRatio;

	public Customer() {
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


class VIPCustomer extends Customer {
	double saleRatio;// 

	public VIPCustomer() {
		super(); //super키워드 - 부모클래스호출 -> 부모 출력 후 자식 출력, 없어도 컴파일러가 자동 삽입. , 슈퍼의 규칙은 맨 처음 자리에 와야한다
		customerGrade = "VIP";
		bonusRatio = 0.05; 
		saleRatio = 0.1; 
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
}