package ch05;
/*���� ���� ����� �����ϰ� ��ü ������ ���� ������
 * NullPointerException���ܰ� �߻�
 */
public class NullPointExceptionExam {
	public static void main(String[] args) {
		//�����Ͻÿ��� ���������� ������ �����Ƿ� ���ܰ� �߻����� ����.
		int[] intArray = null; //��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����.
		intArray = new int[10];
		intArray[0] =10; //���α׷� ���� �� ���� �߻� = runtime Exception
		
		String str = null; //��ü ���� ���� ���� �ϰ� ���� ��ü�� �������� ����.
		str = "hello"; //"hello"���ڿ� ��ü ����
		System.out.println("�� ���ڼ�:" + str.length()); // ���α׷� ���� �� ���� �߻� - runtime Exception

	}
}
