package ch06_methods;

//Ŭ���� ��� - �ʵ�, ������, �޼ҵ�
public class Car2 {
	// �޼ҵ�
int gas;

//����Ÿ�� ���� �޼ҵ忡�� return����
//�޼ҵ带 �����ϴ� ���� - ����� �ǵ����ִ� ���� �ƴϴ�.
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:" + gas + ")");
				gas--;
			} else {
				System.out.println("����ϴ�.(gas�ܷ�:" + gas + ")");
				return;// �޼ҵ� ����
			}
		}
	}
}