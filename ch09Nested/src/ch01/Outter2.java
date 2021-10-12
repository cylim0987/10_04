package ch01;

//자바8 final 없어도 됨
public class Outter2 {
	void method(int arg) {
		// arg = 100; //final 이라서 쓸 수 없음.
		int localVariable;
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
