package ch07_final;

import java.util.Scanner;

public class Person {
	// final필드는 선언과 동시에 초기화
	final String nation = "Korea";
	// 생성자에서 final필드를 초기화할 수 있는 경우 선언만 해놔도 오류 발생하지않음.
	final String ssn;
	String name;

	// 생성자에 final필드를 초기화하는 명령문 포함.
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	public static void main(String[] args) {
		Person person = new Person[9999];
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int index = 0;
		while(run) {
			String ssn = scanner.next();
			String ssn = scanner.next();
			Person2 person = new Person2(ssn, name);
			persons[index++] = person;
		}
		
		Person person = new Person("20010101-1234567", "홍길동");
		// person.nation = "USA"; //final이기 때문에 안됨.
		// person.ssn = "1234"; //파이널 있어서 안됨.
		System.out.println(person.nation); // static써주면 상수.
		System.out.println(person.ssn);
		System.out.println(person.name);

	}
}
