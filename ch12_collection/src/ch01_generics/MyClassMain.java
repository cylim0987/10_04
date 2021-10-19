package ch01_generics;

public class MyClassMain {
	public static void main(String[] args) {
		// �����Ͻ� T -> Integer�� ��ȯ
		MyClass<Integer> s = new MyClass<>();// ����Ŭ���� ȭ��ǥ��ȣ�� Integer�����ص� ��.
		// s.set("hello"); //Integer�� �ߴµ� ���ڿ��� ���� ����.
		s.set(10);// 10-> Integer10���� autoBoxing�Ǿ� ��
		s.set(new Integer(10));
		System.out.println(s.get());// 10

		//�����Ͻ� T -> String���� ��ȯ
		MyClass<String> s1 = new MyClass<String>();
		//s1.set(10); //String�ε� ���ڰ� ����???
		s1.set("hello");
		System.out.println(s1.get());
		
		MyClass<Double> s2 = new MyClass<Double>();// ����Ŭ���� ȭ��ǥ��ȣ�� Double�����ص� ��.
		s2.set(10.0);
		s2.set(new Double(10.0));
		System.out.println(s2.get());
		
		
	}
}
