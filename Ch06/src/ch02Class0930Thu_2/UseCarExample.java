package ch02Class0930Thu_2;

public class UseCarExample {

	public static void main(String[] args) {
		//CarŸ�� ���� = new Car();
		Car car = new Car();
		System.out.println(car.model);
		car.run();
	
		//Truck��ü ����
		Truck truck = new Truck();
		System.out.println(truck.model);
		truck.run();
	
		//Bus��ü ����
		Bus bus = new Bus();
		System.out.println(bus.model);
		bus.run(); // BusŬ������ extends�� �߰��ϴ� ������ ��������.
			
	}

}
