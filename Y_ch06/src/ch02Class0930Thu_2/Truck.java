package ch02Class0930Thu_2;

//Ŭ������ ����� ��� - �θ�Ŭ������ �ʵ�, �޼ҵ�
//�ڽ�Ŭ������ extends �θ�Ŭ������{}
public class Truck extends Car{// �Ӽ�//��� �������� ���� extends�� ����.
	
	//�ʵ�(�Ӽ�, property, �������)
	public String model = "truck";

	//�޼ҵ�
	@Override //Ʈ��Ŭ�������ִ� run�̶�� �޼ҵ�� ����ߴµ� �����ߴ�.
	public void run() {
		System.out.println("Ʈ���� �޸��ϴ�.");
		
		
		//super.run();
	}
	
	
}
