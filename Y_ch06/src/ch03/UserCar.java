package ch03;

public class UserCar {

	public static void main(String[] args) {
		Car car = new Car(); //��ü�� ������ �� �̷��� �����.
		//�ʵ弱��� ���� �ָ� �ش� �� ���
		System.out.println("model: " + car.model);
		System.out.println("maxspeed:" + car.maxSpeed);
		//�ʵ弱��� ���� ���� ������ �ش� Ÿ���� �⺻������ ���
		System.out.println("����ӵ�: " + car.currentSpeed);
		System.out.println("�õ�����: " + car.engineStart);
		System.out.println("Tire:" + car.tire);
		
	}

}
