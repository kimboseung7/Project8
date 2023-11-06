package downcasting;

public class Ex1 {

	public static void main(String[] args) {

		Animal animal = new Human(); //원래 타입의 변수로 다운 캐스팅
		if (animal instanceof Human) {//다운 캐스팅을 하기전에 instanceof를 사용하여 타입이 맞는지 확인

			Human human = (Human) animal; //다운 캐스팅이 실행됨 ( 애니멀의 주소 -- 인스터스의 주소 ) 
			human.readBook();
		}
		
		/*Tiger tiger = (Tiger) animal;      //코드를 작성할 때 알 수 없음 --> 런타임 오류 프로그램을 실행해야 알 수 있는 오류를 가지고 있음
		*작성 할 때는 문제가 없지만 실행 할 때 오류가 걸림
		*형변환은 상속관계일 때 성립이 되는데 (형변환은 되지만 인스턴스 x)
		*위에 코드는 animal이 사람을 가르키고 있기 때문에 x
		*인스턴스 타입 체크는 실행하면 체크를 함
		*/
		if (animal instanceof Tiger) {  //instanceof로 타입 체크를 했기 때문에 왼쪽과 같이 사용가능, if문으로 블록이 실행이 안되었으므로 사실상 실행이 안되었음
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		}
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉펴고 멀리 날아갑니다");
	}

}


class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}

}
