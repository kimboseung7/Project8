package inheritance.quiz;
/*
 * 동물(Animal)을 정의하는 클래스를 만드세요
 * 속성:다리
 * 동물 클래스를 상속받는 호랑이(tiger)클래스를 만드세요
 * 속성:꼬리
 * 동물 클래스를 상속받는 독수리(Eagle) 클래스를 만드세요
 * 속성:날개
 * 
 * 호랑이 인스턴스를 생성하세요(다리 4개,꼬리 1개)
 * 독수리 인스턴스를 생성하세요(다리 2개, 날개 2개)
 * */
public class qz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.leg = 4; //부모클래스에서 물려받은 속성
		tiger.tail = 1;
		
		Eagle eagle = new Eagle();
		eagle.leg = 2; //부모클래스에서 물려받은 속성
		eagle.wing = 2;

	}

}//동물클래스
class Animal{
	int leg;//다리
}//호랑이클래스
class  Tiger extends Animal{
	int tail;//꼬리
}//독수리클래스
class  Eagle extends Animal{
	int wing;//날개
}
