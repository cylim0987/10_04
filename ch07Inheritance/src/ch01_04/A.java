package ch01_04;

//부모클래스의 생성자를 선택하여 호출 super();
public class A {
	public static void main(String[] args) {
		B b;
		//b = new B(5);
		b = new B();
	}

	// default생성자
	public A() {
		System.out.println("생성자A");// 호출 실행
	}

	// 일반매개변수생성자
	public A(int X) {
		System.out.println("생성자" + X);
	}
}

class B extends A {
	// default생성ㅇ자
	public B() {
		System.out.println("생성자B");
	}
	//super()메소드로 부모클래스의 매개변수 있는 생성자 호출 가능.
	public B(int x) {
		super(x);//x를 받아 x를 super에. 첫줄 x가 부모 클래스에 있는 일반매개변수생성자.로.
		System.out.println("매개변수생성자"); //호출 실행
	}

}