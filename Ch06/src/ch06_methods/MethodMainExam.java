package ch06_methods;

public class MethodMainExam {

	public static void main(String[] args) {

		//�޼ҵ带 �����ϰ��ִ� Ŭ������ ��ü ����
	MethodExam m = new MethodExam(); // ������ ���� ���ο� ����.
	
	//���������� �޼ҵ� ����
	//1.����(�Ű�����O, ����Ÿ��O)
	//�޼ҵ�����̱����̶�� Ŭ�������� ����� [�ٷξƷ�] �Լ��� ȣ������ �ʰ� ����
	//������� ��. � Ÿ���̴��Ŀ� ���� ����Ǵ� �Լ��� �޶�����.
	//���� �Ʒ��� �����̶�� �޼ҵ��̱��뿡 ��Ʈ�� ����� ���������Ѵ�.
	// ù ��°, �ι�° ������ �޾Ƽ� ���� �� �����
	// intŸ������ �ǵ�����.	
	int result = m.sum(10, 10);
	System.out.println(result);
	

	//2.����(�Ű�����X, ����Ÿ��O)
	String str1 = m.greeting();
	System.out.println(str1);
	
	//3.����(�Ű�����O, ����Ÿ��X)
	m.sumVoid(10, 30);
	
	//4.����(�Ű�����X, ����Ÿ��X)
	m.greetingVoid();
	
	}

}

