package Ex07;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //promotion(upcasting)
		
		//�������̵��� �޼ҵ��� �������ε�
		//�޼ҵ��� ���೻���� ȣ������� ����
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ�� �θ�Ÿ������ ����ȯ�� �Ǿ
		//�ڽ�Ŭ�������� �����ǵ� �޼ҵ��� ������ ����� - ������
		
		snowTire.run();
		tire.run(); //�������̵�� ������ �����ǵ� �ڽ� �޼ҵ尡 ȣ��
	}

}
