package ch07_staticVsnotStatic;

public class StaticVsInstanceMemberEx {

	public static void main(String[] args) {

		//static에 this를 못 쓰는 이유.-. 왜 this사용불가인가? 이유 : 
			//instance는 클래스가 아니다, 인스턴스는 객체, 클래스는 설계도.
			// new a>0이 이후에 this를 쓸 수 있다. instance의 정보를 가지고 있기 때문.
		
		//static은 클래스다. 인스턴스가 아니라. static이 먼저 만들어지고 instance는 뒤에 만들어지기 때문에. 만들어진 이후에 . 
		//static instance. 
		
		
		
	}

}

class A1 {
	// 인스턴스 필드와 메소드
	static int field1; 
	void method1() { // 앞에 static.
	}

	// 정적 필드와 메소드
	static int field2;
	static void method2() {}

	// 인스턴스 메소드에서 같은 클래스내의 static멤버, instance멤버 모두 접근(호출) 가능.
	// 인스턴스 메소드에서 같은 클래스내의 static멤버, instance멤버 모두 접근(호출) 가능.
	// 인스턴스 메소드에서 같은 클래스내의 static멤버, instance멤버 모두 접근(호출) 가능.
	void method4() {
		this.field1 = 0; // 인스턴스 필드
		field2 = 10; // static 필드
		this.method1(); // 인스턴스 메소드
		method2(); // static 메소드
	}

	// static 메소드 내에는 static으로 선언된 멤버(필드와 메소드)만 접근 가능
	static void method3() { 
		//field1=0; // 인스턴스 필드
		//this.field1=10; //this 키워드 사용불가.
		field2=10; // static 필드
		//method1(); // 인스턴스 메소드
		//this.method1(); //this.키워드 사용불가.
		method2(); // static 메소드
}
// 인스턴스는 상관없는데 static에서 이런 현상이 발생.
}
