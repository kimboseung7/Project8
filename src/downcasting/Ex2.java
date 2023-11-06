package downcasting;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Animal> aniList = new ArrayList<Animal>();
		
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);{
				
				
				if(ani instanceof Human) {
					Human h = (Human) ani;
					h.readBook();
				}
				else if (ani instanceof Tiger) {
					Tiger t = (Tiger) ani;
					t.hunting();
				}
				else if (ani instanceof Eagle) {
					Eagle e = (Eagle) ani;
					e.flying();
				}
			}
		}
	}

}
