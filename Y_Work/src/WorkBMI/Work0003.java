package WorkBMI;

import java.util.Scanner;

public class Work0003 {

	public static void main(String[] args) {

		System.out.println("������ �Է��Ͻÿ�: M / F");
		Scanner scanner = new Scanner(System.in);
		String gender = scanner.next();

		double weight = ' ';
		double height = ' ';
		// if�� true, false �� �ۿ� �� �´�... ���ڿ��� �� ��
	switch (gender) {
		case "M":
			System.out.println("����222222222.");
			System.out.println("Ű�� �Է��Ͻÿ�.");
			break;
		case "F":
			System.out.println("����");
			System.out.println("Ű�� �Է��Ͻÿ�.");
		}

	}
}
/*
 * // �����淮 ���ϱ�
		final double Lmale = 1.10;
		final double Lfemale = 1.07;
		final double ST2 = 128;

 * 
//�����淮
		double result = Lmale * weight - ST2 * 
				        ((weight * weight) /(double)(height * height)); 

// ü���淮 ���ϱ�
		double result2 = weight - result;
		
// ü����� ���ϱ� = ü���淮*100/ü��
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;

*/
