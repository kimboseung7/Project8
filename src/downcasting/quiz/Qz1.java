package downcasting.quiz;

import java.util.ArrayList;

public class Qz1 {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();

		personList.add(new Student("둘리"));
		personList.add(new Worker("또치"));

	
		for (Person person : personList) {
			person.eat(); //eat호출
			if (person instanceof Student) {
				Student student = (Student) person;
				student.doStudy();
			} else if (person instanceof Worker) { //person 이 가리키고 있는 객체가 Worker인지 확인 하고 다운캐스팅(주소 값을 카피)
				Worker worker = (Worker) person;
				worker.doWork();

			}

		}
	}
}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "가 먹는다");
	}
}

class Student extends Person {
	public Student(String name) {
		super(name);
	}

	public void doStudy() {
		System.out.println(name + "가 공부를 한다");
	}
	
}

class Worker extends Person {
	public Worker(String name) {
		super(name);
	}

	public void doWork() {
		System.out.println(name + "가 일을 한다");
	}
}
