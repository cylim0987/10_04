package Continue;

import java.util.Scanner;

public class Continue4 {

	public static void main(String[] args) {

	// 5���� ������ Ű����κ��� �Է¹ް� �� �� ����鸸 ���� ��� ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���: ");
		int sum = 0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt(); //Ű���忡�� ���� �Է�
			if(n<0) 
			  continue; //����� �ƴ� ��� ���� �ݺ����� ����
			else
				sum+=n; //����� ��� ���ϱ�
		}
		System.out.println("����� ����: " + sum);
	}

}
