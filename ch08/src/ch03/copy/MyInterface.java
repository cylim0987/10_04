package ch03.copy;

public interface MyInterface {
	void method1();

	//인터페이스 내에 실체가 있는 메소드, 구현시 재정의 불필요(안해도됨)
	default void method2() {} //default를 붙여 실체 메소드로 만듦.

	default void method3() {}
	
	default void method4() {}
}

