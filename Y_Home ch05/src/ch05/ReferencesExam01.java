package ch05;

public class ReferencesExam01 {

	public static void main(String[] args) {
		//���ͷ��� ���ڿ� ����
		String strA = "ȫ�浿";//���ͷ�
		String strB = "ȫ�浿";//���ͷ�
		if(strA==strB) System.out.println("���� ���ڿ��� �����Ѵ�.");
		else System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");
		
		// new String() - �����ڷ� ���ڿ� ���� - ����Ÿ�� Ư�� ����
		//����Ÿ���� ������ new Ŭ������();���� ����
		String str1 = new String("ȫ�浿"); //����Ÿ��
		String str2 = new String("ȫ�浿"); //����Ÿ��
		if(strA==strB) System.out.println("���� ���ڿ��� �����Ѵ�.");
		else System.out.println("�ٸ� ���ڿ��� �����Ѵ�.");
		
		//
		str1="������";
		str1="ȫ��������";
		
	}

}
