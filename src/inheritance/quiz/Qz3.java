package inheritance.quiz;

public class Qz3 {

	public static void main(String[] args) {
		BallPen ballPen = new BallPen();
		ballPen.showInfoBallPen();
		FountainPen fountainPen = new FountainPen();
		fountainPen.ShowInfoFountainPen();
	}

}
class Pen{
	int thickness;
	String amount;
}
class BallPen extends Pen{
	String color;
	public BallPen() {
		thickness = 2;
		amount = "100%";
		color = "blue";
	}
	public void showInfoBallPen() {
		System.out.println("굵기:" +thickness + " 남은양:" + amount + " 색상:" + color );
	}
}
class FountainPen extends Pen{
	String brand;
	public FountainPen() {
		thickness = 3;
		amount = "80%";
		brand = "montblanc";
	}
	public void ShowInfoFountainPen() {
		System.out.println("굵기:" +thickness + " 남은양:" + amount + " 브랜드:" + brand );
	}
}