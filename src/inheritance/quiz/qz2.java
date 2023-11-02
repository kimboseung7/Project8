package inheritance.quiz;

/*
 * 베이직티비을 정의하는 클래스를 만드세요
 * 속성:전원상태 채널,볼륨
 * 베이직티비를 상속받는 스마트티비(SmartTv)클래스를 만드세요
 * 속성:아이피
 * 베이직티비 인스턴스를 생성하고 (전원 상태는 on, 볼륨은 20, 채널은 7)
 * 스마트티비 인스턴스를 생성하고 (전원 상태는 온, 볼륨은 30, 채널은 11, 아이피는 192.168.0.111)
 * 그리고 인스턴스의 정보를 출력하세요
 * */
public class qz2 {

	public static void main(String[] args) {
		BasicTv basicTv = new BasicTv();
		basicTv.power = true;
		basicTv.vol = 20;
		basicTv.ch = 7;
		basicTv.basictvInfo();
		
		SmartTv smartTv = new SmartTv();
		smartTv.power = true;
		smartTv.vol = 30;
		smartTv.ch = 11;
		smartTv.ip = "192.168.0.111";
		smartTv.smartTvInfo();
	}

}

class BasicTv {
	boolean power;
	int ch;
	int vol;

	public void basictvInfo() {
		String powerStatus = power ? "on" : "off";
		System.out.println("전원:" + powerStatus + " 채널:"+ ch + " 볼륨:"+ vol);
	}
}

class SmartTv extends BasicTv {
	String ip;

	public void smartTvInfo() {
		System.out.println("전원:" + power + " 채널:"+ ch + " 볼륨:"+ vol +" IP:" + ip);
	}

}
