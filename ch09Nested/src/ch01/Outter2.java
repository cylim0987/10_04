package ch01;

//�ڹ�8 final ��� ��
public class Outter2 {
	void method(int arg) {
		// arg = 100; //final �̶� �� �� ����.
		int localVariable;
		localVariable = 1;
		// localVariable = 10;
		// ���� Ŭ����
		System.out.println(arg);
		// �޼ҵ峻�� ����Ŭ�������� ���Ǵ� ������
		// ������ final �ʵ忩���Ѵ�.
		class Inter {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
