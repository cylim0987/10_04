package ch02;

public class A {
	public static void mian(String[] args) {
		B b = new B();
		b.method1();

		A a = b;
		a.method1();
	}

	public void method1() {
		System.out.println("�θ�޼ҵ�");
	}
}

class B extends A {
	@Override
	public void method1() {
		System.out.println("�ڽĸ޼ҵ�");
	}

}