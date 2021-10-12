package ch01;

//인터페이스 선언(참조타입). 인터페이스도 클래스의 한 종류. //bin폴더에 가면 class로 되어있음. 이름만 interface.
//인터페이스의 구성멤버 - 상수, 추상메소드.
public interface RemoteControl {
	//상수
//	public static final int MAX_VOLUME = 10;
//	public static final int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10; //변수라면 volme까지만. 상수니까 선언과 동시에 값을 넣는 것. 상수는 선언과 동시에 초기화 처리.
	public int MIN_VOLUME = 0;

	//메소드
	void method(); // 오류. 왜 {} 쓰지말고. 이렇게 선언부만 써라.

}


//인터페이스로부터 실체 클래스 구현
	class TVRemoteControl implements RemoteControl{

		@Override
		public void method() {
			System.out.println("실체 클래스메소드");
		}
		
	}

	class A {
		//변수
		public int MAX_VOLUME; //자동으로 0으로 초기화
		//상수
		public int MIN_VOLUME = 0;
		//메소드 - 추상메소드
		void method() {MAX_VOLUME = 10;} //선언부. 오류. 왜 {} 쓰지말고. 이렇게 선언부만 써라.

	
	
	

}