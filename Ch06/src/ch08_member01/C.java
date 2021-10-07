package ch08_member01;

public class C {
	public void k() {
		B b = new B();
		b.n = 7;
		b.g();
	}

	public void k1() {
	 //동일패키지내라도 클래스는 public이므로 접근가능.
	 B2 b2 = new B2();
	}
	public void k3() {
		 //동일패키지내라도 클래스는 public이므로 접근가능.
		 B3 b3 = new B3();
		 b3.n=10;
		 b3.g();
	}	 
	public void k4() {
		// 동일패키지내라도 클래스는 public이므로 접근가능.
		B2 b2 = new B2();
		// 필드와 메소드. 동일 패키지내라도 private이므로 접근불가.
		// b2.n = 10; //접근불가. private라서.
		// b2.g(); //접근불가. private라서.
	}


}

