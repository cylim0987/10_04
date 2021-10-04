package ch02Class0930Thu_2;

public class Bus extends Car {
	String model = "Bus";

	@Override
	public void run() {
		//super.run(); //super는 예약어. run은 부모클래스에 있는 run을 실행하라는 것.
		System.out.println("Bus가 달립니다.");
	}

	
}