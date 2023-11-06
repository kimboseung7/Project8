package polymorphism;

import java.util.ArrayList;

/*
 * 리스트의 다향성을 활용하여 회원 관리 프로그램 구현하기
 * */
public class Ex4 {

	public static void main(String[] args) {
		ArrayList<Customer2> customerList = new ArrayList<Customer2>();
		Customer2 customer1 = new Customer2("둘리");
		Customer2 customer2 = new Customer2("또치");
		Customer2 customer3 = new Customer2("도우너");
		Customer2 customer4 = new VIPCustomer2("마이클");
		Customer2 customer5 = new VIPCustomer2("고길동");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("===== 회원등급에따라 할인율과 보너스 포인트 계산=====");
		for(Customer2 customer : customerList) {
			customer.calcPrice(10000);
		}
		for(Customer2 customer : customerList) {
			customer.showInfo();
		}
	}

}
