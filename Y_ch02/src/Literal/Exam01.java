package Literal;

public class Exam01 {

	public static void main(String[] args) {
		// ������ ����
		
		//int x = 1.5; //1. int����Ÿ���ε� doulbe(�Ǽ�) ���
		int x = (int)1.5; // 1.5�տ� (int)�� ������ �ٲ� �� ����. -> ���� 1�� ������ �ٲ�
		
		//int 2nd = 20; //2. ������ ���ڷ� ������ ���Ұ�
		int nd2 = 20;
		
		//int myMoney# = 25; //3. Ư������ #���Ұ� ( $ _ �� ���.
		int myMoney = 25;
		
		//float f = 12.25; //4. double(�Ǽ�)Ÿ���� ���ͷ��� float(�Ǽ�)���� ������ ���� �Ұ�
		float f = (float)12.25;
		//float f = 12.25f; // �̷��Ե� �� �� ����. 
		//int result = 12 + 15.3; //5. �Ǽ��� �������� ���� ���� �Ұ�
		int result = 12 + (int)15.3;
		
		//String _name = 'ȫ�浿'; //6. char(����)' 'Ÿ���� ���ͷ��� 1��, String(���ڿ�)""�� ��ȯ.
		String _name = "ȫ�浿";
		
		
	}

}
