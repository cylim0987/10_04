package day06Fri;

public class AccuracyExample1 {

	public static void main(String[] args) {

		int apple =1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		//System.out.printf("%f\n", number * pieceUnit);
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result + "������ ���´�. ");
		
		// ������ ��Ȯ�� ���� ����ϰ�
		// 1 * 10 => ����
		int totalPieces = apple * 10;
		int temp = totalPieces - number;
		
		// �Ǽ����·� ��ȯó��
		// 3/10.0 => 3.0
		result = temp/10.0;
		 
		System.out.println("��� �Ѱ�����");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result + "������ ���´�. ");
		
		
		/*��� �Ѱ�����
0.7 ������ ����, 
0.29999999999999993������ ���´�. 
 18�ڸ����� �ݿø�.�ؾ��Ѵ�.
*
*/
		
	}

}
