package ch03.copy.copy;

public class OuterMain {
	// ���� main�޼ҵ�� ���ܸ� �޾Ƽ� ��üó���ϴ���
	// ���ѱ� �� �ִ�(jvm����)

	public static void main(String[] args) throws Exception {
		Outter out = new Outter();
		// OutterŬ������ �ʵ�a�� �޼ҵ� ȣ��
		out.method();

	}
}