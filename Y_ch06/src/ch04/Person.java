package ch04;

public class Person {
 //Person���� Car�� ����Ϸ���?
	//Car��ü ����
	//�ʵ弱���� �ϰ� ��ü�� �ʱ�ȭ. 
	//person���忡���� car myCar�� �װ� �Ǵ°Ŵ�.
	Car myCar = new Car();
	
	//�ʵ� ���
	void useCar() {
		//�ܺϰ�ü(Person)����
		//Car��ü�� �ʵ� ����
		//��������.�ʵ��
		myCar.speed=60;
	}
	
}