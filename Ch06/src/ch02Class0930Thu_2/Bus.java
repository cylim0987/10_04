package ch02Class0930Thu_2;

public class Bus extends Car {
	String model = "Bus";

	@Override
	public void run() {
		//super.run(); //super�� �����. run�� �θ�Ŭ������ �ִ� run�� �����϶�� ��.
		System.out.println("Bus�� �޸��ϴ�.");
	}

	
}