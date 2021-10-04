package ch02Class0930Thu_2;

public class UseCarExample {

	public static void main(String[] args) {
		//Car타입 변수 = new Car();
		Car car = new Car();
		System.out.println(car.model);
		car.run();
	
		//Truck객체 생성
		Truck truck = new Truck();
		System.out.println(truck.model);
		truck.run();
	
		//Bus객체 생성
		Bus bus = new Bus();
		System.out.println(bus.model);
		bus.run(); // Bus클래스에 extends를 추가하니 오류가 없어졌음.
			
	}

}
