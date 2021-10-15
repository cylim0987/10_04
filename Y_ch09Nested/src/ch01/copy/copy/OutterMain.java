package ch01.copy.copy;

public class OutterMain {
	public static void main(String[] args) {
	
		//인스턴스 객체 생성
		A a = new A();
		A.B b = a.new B();
		b.print();
		
		
		
	}
}
/*
		//인스턴스 객체 생성
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();


		//클래스. static멤버로 접근 
		A.C c = new A.C();
		//C의 인스턴스 멤버
		c.field1 = 3;
		c.method1();
		//C의 static 멤버
		A.C.field2 = 3;
		//A.class.method2();
		
	}

}

*/

