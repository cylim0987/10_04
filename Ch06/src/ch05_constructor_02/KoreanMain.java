package ch05_constructor_02;

public class KoreanMain {

	public static void main(String[] args) {
		 //�Ű����� �ִ� �����ڰ� �����ϹǷ� �����Ͻ�
			//(�ٷξƷ�)default�����ڰ� �߰� �ȵǾ ȣ��Ұ�.
		//Korean korean = new Korean();
		Korean korean1
			= new Korean("ȫ�浿","011225-1234567");
		System.out.println(korean1.name);
		System.out.println(korean1.sno); // �� ������? �ƹ��͵� ����. null��
		
		Korean korean2
		= new Korean("������","930525-0654321");
		System.out.println(korean2.name);
		System.out.println(korean2.sno);
	
		//�����ڴ� �ʵ带 �ʱ�ȭ����.
	}

}
