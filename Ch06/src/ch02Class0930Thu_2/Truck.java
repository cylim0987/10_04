package ch02Class0930Thu_2;

//클래스의 상속의 대상 - 부모클래스의 필드, 메소드
//자식클래스명 extends 부모클래스명{}
public class Truck extends Car{// 속성//기능 가져오지 말고 extends를 쓴다.
	
	//필드(속성, property, 멤버변수)
	public String model = "truck";

	//메소드
	@Override //트럭클래스에있는 run이라는 메소드는 상속했는데 수정했다.
	public void run() {
		System.out.println("트럭이 달립니다.");
		
		
		//super.run();
	}
	
	
}
