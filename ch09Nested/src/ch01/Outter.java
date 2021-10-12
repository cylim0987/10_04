package ch01;

//자바7 까지 표현방식... final이 붙어있어야
public class Outter {
	void method(final int arg) {
		// arg = 100; //final 이라서 쓸 수 없음.
		final int localVariable;
		localVariable = 1;
		// localVariable = 10;
		// 로컬 클래스
		System.out.println(arg);
		// 메소드내의 로컬클래스에서 사용되는 변수는
		// 무조건 final 필드여야한다.
		class Inter {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
