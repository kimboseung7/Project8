package inheritance.quiz;

public class Qz4 {

	public static void main(String[] args) {
		Monster monster = new Monster();
		monster.attackLevel = 10;
		monster.health = 100;
		monster.showInfo();
		monster.doAttack();
		
		System.out.println();
		Slime slime = new Slime();
		slime.attackLevel = 30;
		slime.health = 200;
		slime.skill = "마비";
		slime.showSlimeInfo();
		slime.doSlimeAttack();
		slime.doSkill();
	}

}
class Monster {
	int attackLevel;
	int health;
	public void doAttack() {
		System.out.println("몬스터가" + attackLevel +"만큼 공격했다");
	}
	public void showInfo() {
		System.out.println("몬스터의 공격력은" + attackLevel +"이고" + "체력은" + health + "이다");
	}
	
}
class Slime extends Monster {
	String skill;
	public void showSlimeInfo() {
		System.out.println("슬라임의 공격력은" + attackLevel +"이고" + "체력은" + health + "이다");
	}
	public void doSlimeAttack() {
		System.out.println("슬라임이 " + attackLevel +"만큼 공격했다"); //굳이 안써도됨 
	}
	public void doSkill() {
		System.out.println("슬라임이 " + skill +"을 시전했다!");
	}
}
