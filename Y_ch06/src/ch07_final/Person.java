package ch07_final;

import java.util.Scanner;

public class Person {
	// final�ʵ�� ����� ���ÿ� �ʱ�ȭ
	final String nation = "Korea";
	// �����ڿ��� final�ʵ带 �ʱ�ȭ�� �� �ִ� ��� ���� �س��� ���� �߻���������.
	final String ssn;
	String name;

	// �����ڿ� final�ʵ带 �ʱ�ȭ�ϴ� ��ɹ� ����.
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
		
		Person person = new Person("20010101-1234567", "ȫ�浿");
		// person.nation = "USA"; //final�̱� ������ �ȵ�.
		// person.ssn = "1234"; //���̳� �־ �ȵ�.
		System.out.println(person.nation); // static���ָ� ���.
		System.out.println(person.ssn);
		System.out.println(person.name);

	}
}
