package ch06.copy;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	public void checkFare() {
		
	}

}

class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}

}
