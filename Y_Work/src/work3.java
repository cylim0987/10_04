import java.util.Scanner;

//package work;
/* vctor@naver.com
 * ���� ������� 10/4��(��) 23:59�� ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 * */

 // ������ �Է��ϼ���.
// ���̸� �Է��ϼ���.

// Ű�� �Է��Ͻÿ�.
// �����Ը� �Է��Ͻÿ�.

/*
 * 1. ǥ�� �����淮 ���

����ǥ�� =  (1.10  * ü��kg ) - ( 128 * ( ü��kg���� / Űcm���� ) )

����ǥ�� =  (1.07 * ü��kg ) - ( 128 * (ü��kg���� / Űcm���� ) )

 

2. ǥ�� ü���淮 ���

ü���淮kg = ü��kg - �����淮kg

 

3.ǥ�� ������� ���

�������% = (�����淮kg * 100 ) / ü��kg

 

4. ǥ�� ü����� ���

1) ü�����% = 100 - �������%

2) ü�����% = (ü���淮kg * 100 ) / ü��kg

 

��) ���� (10~39��)

- 12% �̸� : ���� ��

- 12 ~ 17% : ǥ��

- 18 ~ 22% : ��ü��

- 23 ~ 27% : ��

- 28% �̻� : ����

��

��) ���� (10~39��)

- 22% �̸� : ���� ��

- 22 ~ 27% : ǥ��

- 28 ~ 35% : ��ü��

- 36 ~ 40% : ��

- 41% �̻� : ����
 */


public class work3 {
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