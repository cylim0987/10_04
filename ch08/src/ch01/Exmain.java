package ch01;

public class Exmain {
	public static void main(String[] args) {
		//�������̽��� ��ü�� ���� �� ���� Ŭ����
		//RemoteControl rc = new RemoteControal();

		//�������̵�� �������̽�...
		
		//������ ��ü Ŭ������ ��ü�� �������̽��� ����
		RemoteControl rc = new TVRemoteControl();
		//�������̽��� �޼ҵ� ȣ��
		//������ ��ü Ŭ������ �����ǵ� �޼ҵ� ������ ����.
		rc.method();
	}

}
