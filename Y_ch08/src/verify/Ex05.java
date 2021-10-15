package verify;

//ActionExample 클래스의 main() 메소드에서 Action의 익명 구현 객체를 만들어 다음과 같은
//실행 결과가 나올 수 있도록 박스 안에 들어갈 코드를 작성해보세요.


//무명 인터페이스 (new로 생성해서 하니까)
public class Ex05 {
	public static void main(String[] args) {
		/*
		 * 이 프로그램에서만 1회성으로 인터페이스를 구현해서 실체클래스를 사용하고 끝내겠다. 이름없는 실체 클래스를 만들어서 인터페이스에 대입 후
		 * 사용. 인터페이스와 같은 이름은 생성자를 호출하여 선언하면 실체 클래스가 생성, 이 생성한 객체를 Action타입에 대입.
		 *
		 */

		Action action = new Action() {//자식(실체클래스의 객체)을 생성 부모타입에 대입(promotion)
			@Override
			public void work() {//실체클래스에서 재정의와 같음.
				System.out.println("등록작업");
			}
		};
		action.work();
	}
}
