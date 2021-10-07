package ch07_final;

public class PersonScanner {
	// final�ʵ�� ����� ���ÿ� �ʱ�ȭ
	final String nation = "Korea";
	// �����ڿ��� final�ʵ带 �ʱ�ȭ�� �� �ִ� ��� ���� �س��� ���� �߻���������.
	final String ssn;
	String name;

	// �����ڿ� final�ʵ带 �ʱ�ȭ�ϴ� ��ɹ� ����.
	public PersonScanner(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	public static void main(String[] args) {
		PersonScanner person = new PersonScanner("20010101-1234567", "ȫ�浿");
		// person.nation = "USA"; //final�̱� ������ �ȵ�.
		// person.ssn = "1234"; //���̳� �־ �ȵ�.
		System.out.println(person.nation); // static���ָ� ���.
		System.out.println(person.ssn);
		System.out.println(person.name);
		PersonScanner person2 = new PersonScanner("1232131-4555567", "������");

	}
}
