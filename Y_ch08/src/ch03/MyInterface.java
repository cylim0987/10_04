package ch03;

public interface MyInterface {
	void method1();

	void method2(); // 인터페이스로 구현된 ABC.. BC는 여기 메소드2의 영
	// 향을 받아.. 오류가 난다..

	void method3();
	
	
}


//인터페이스는 기능만 쓴다는 것. 어쩔 수 없이 A에 불필요해보이는 메소드를 가져와야한다.
//인터페이스는 이게 불편해서. 그래서 나온게 ch03.copy