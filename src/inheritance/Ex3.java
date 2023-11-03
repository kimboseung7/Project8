package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		// 일반회원 생성
		Customer customer = new Customer();
		customer.customerName = "둘리";
		customer.calcPrice(10000);
		customer.showInfo();
		// vip회원 생성
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치";
		vip.calcPrice(10000);
		vip.showInfo();
		

	}

}
//일반회원 클래스
class Customer{
	String customerName;//회원 이름
	String customerGrade;//등급
	double bonusPoint; //보너스 포인트
	double bonusRatio; //적립률
	
	public Customer() {
		customerGrade = "SILVER"; //일반 회원 등급은 실버
		bonusRatio = 0.01;		  // 적립률 1%
	}
	//보너스 포인트 적립하고 , 가격을 계산하는 메소드
	public void calcPrice(int price) { //회원이 쇼핑물에서 구매하는 메소드 인자에 물건가격
		bonusPoint = bonusPoint + (price * bonusRatio);  //적립률 계산 //누적을 시킬려고 자신 자신이 들어있음
		System.out.println(customerName + "님이" + price + "원을 결제했습니다");
	}
	public void showInfo() {
		System.out.println(customerName + "님의 등급은" + customerGrade + "입니다");
	}
}
//VIP 회원 클래스
class VIPCustomer extends Customer{ //상속 받기
	double saleRatio;// 할인률

public VIPCustomer() {
	super();
	customerGrade = "VIP";
	bonusRatio = 0.05; //5%
	saleRatio = 0.1;   //10%
}
	
	
}