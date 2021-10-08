package ch02;

public class Parent {
	public static void main(String[] args) {
		Child child = new Child();
		child.method3();
	}
void method1() {}
void method2() {System.out.println("부모메소드");} 
}

//상속
class Child extends Parent{
	//재정의
	void method2() {}
	//추가
	void method3() {
		method2();

	}

}


