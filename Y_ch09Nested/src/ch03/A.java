package ch03;

public class A {
	// �ʵ带 �����ϰ� �ڽ�(����ü)���� �ʱ�ȭ
	Parent p = new Child();

	void method() {
		// ����ü���� �߰��� �����, �θ�Ÿ������ ��ȯ �� ���� �Ұ�
//		p.childF = 3;
//		p.childM();
		p.parentMethod();
	}

	// �����������̽� ����
	// ����ü(���)�� ���� ParentŸ������ promotion�� ����
	Parent p2 = new Parent() {
		// ����Ŭ�������� �߰��� ���
		int childF;// �ʵ�

		void childM() {
		}// �޼ҵ�

		@Override
		public void parentMethod() {
			childF = 3;
			childM();
		}
	};

}
