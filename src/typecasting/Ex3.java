package typecasting;

public class Ex3 {

	public static void main(String[] args) {
		// 부모타입 변수 = 자식 인스턴스 생성
		Customer3 vc = new VIPCustomer3("둘리"); //클래스 간에 형변환 
		System.out.println(vc.customerName);	
		//System.out.println(vc.saleRatio); //자식에서 추가한 속성과 개념은 사용못함 ex) 할인률
 
	}

}
class Customer3 {
	String customerName;
	String customerGrade;
	double bonusPoint; 
	double bonusRatio; 
	//이름을 매개변수로 받는 생성자 추가

	public Customer3(String cutomerName) {
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


class VIPCustomer3 extends Customer3 {
	double saleRatio;// 

	public VIPCustomer3(String customerName) { //매개변수 받아야함
		super(customerName); //부모클래스에 맞게 호출 -> 안하면 에러
		customerGrade = "VIP";
		bonusRatio = 0.05; 
		saleRatio = 0.1; 
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
}