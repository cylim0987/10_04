import java.util.Scanner;

public class work2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num = scanner.nextDouble();
		System.out.println(num);
		// �����淮 ���ϱ�
		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		//�����淮
		double result = ST1 * weight - ST2 * 
				        ((weight * weight) /(double)(height * height)); 

		System.out.println(result);

		// ü���淮 ���ϱ�
		double result2 = weight - result;

		System.out.println(result2);

		// ü����� ���ϱ� = ü���淮*100/ü��
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;

		System.out.println(result3);
	}
}
/*
 *  ch == 'y' || ch == 'Y' // ���� ch�� 'y' �Ǵ� 'Y'�� ��.
 * 
 *  str.equalsIgnoreCase("yes") // ���ڿ� str�� ������ "yes"�� ��(��ҹ��� ���о���)
 * 
 */



