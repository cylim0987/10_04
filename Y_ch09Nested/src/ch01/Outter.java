package ch01;

//�ڹ�7 ���� ǥ�����... final�� �پ��־��
public class Outter {
	void method(final int arg) {
		// arg = 100; //final �̶� �� �� ����.
		final int localVariable;
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