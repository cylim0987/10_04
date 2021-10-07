package ch01_02;

public class A {
	public static void main(String[] args) {
		B b;
		b = new B();
	}
	
	// default持失切
	public A() {
		System.out.println("持失切A");
	}

	// 析鋼古鯵痕呪持失切
	public A(int X) {
		System.out.println("持失切" + X);
	}
}

class B extends A {
	// default持失し切
	public B() {
	}

}