package ch04;

public class Person {
 //Person에서 Car를 사용하려면?
	//Car객체 생성
	//필드선언을 하고 객체로 초기화. 
	//person입장에서는 car myCar가 그게 되는거다.
	Car myCar = new Car();
	
	//필드 사용
	void useCar() {
		//외북객체(Person)에서
		//Car객체의 필드 접근
		//참조변수.필드명
		myCar.speed=60;
	}
	
}