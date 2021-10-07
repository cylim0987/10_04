package Work;

import java.util.Scanner;

public class Teeeee {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		final double maleSTD = 1.10, femaleSTD = 1.07;
		final int COMSTD = 128, COMSTD2 = 100;

		while (run) {
			System.out.println("========================================");
			System.out.println(" ��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� �ٶ��ϴ�");
			System.out.println("========================================");
			System.out.print("����(����(M)/����(F) �Է�) >");
			String gender = scanner.next();
			System.out.print("���̸� �Է�(����:10~39) > ");
			int age = scanner.nextInt();
			System.out.print("Ű�� �Է�(����:cm) > ");
			double height = scanner.nextDouble();
			System.out.print("�����Ը� �Է�(����:kg) > ");
			double weight = scanner.nextDouble();

			//1. �����淮 ���ϱ�
			//���� = (1.10 * ü��) - (128 * (ü��*ü��)/(Ű*Ű))
			//���� = (1.07 * ü��) - (128 * (ü��*ü��)/(Ű*Ű))
			double leanBodyMass = 0.0;
			switch (gender) {
			case "M":
				leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
				break;
			case "F":
				leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
				break;
			}
			
			
			
			System.out.println("���:>");
			System.out.printf("�����淮:%.2f\n", leanBodyMass);


			System.out.println("����ұ��?(yes/No)");
			String yesNo = scanner.next();
			if (yesNo.equals("No"))
				run = !run;
	//
		//2. ü���淮(=ü��-�����淮) ���ϱ�
		double bodyFatMass = 0.0;
		bodyFatMass = weight - leanBodyMass;

		// �������(=�����淮*100)/ü��
		double leanBodyRatio = (leanBodyMass * 100) / (double) weight;

		//3. ü�����(=ü���淮*100/ü��)
		double bodyFatRatio = (bodyFatMass * 100) / (double) weight;


		System.out.println("���:>");
		System.out.printf("�������:%.2f\n", leanBodyRatio);
		System.out.printf("ü���淮:%.2f\n", bodyFatMass);
		System.out.printf("ü�����:%.2f\n", bodyFatRatio);

		
		
		//
	
		
		String result = "";
		//4. ��/�� �� �񸸵� ����
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "���� ��";
			else if (bodyFatRatio <= 17)
				result = "ǥ��";
			else if (bodyFatRatio <= 22)
				result = "��ü��";
			else if (bodyFatRatio <= 27)
				result = "��";
			else
				result = "����";

			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "���� ��";
			else if (bodyFatRatio <= 27)
				result = "ǥ��";
			else if (bodyFatRatio <= 35)
				result = "��ü��";
			else if (bodyFatRatio <= 40)
				result = "��";
			else
				result = "����";
			break;
		}// switch�� ��.
		
		System.out.println("���:>");
		System.out.println(result);


		
		
	//	
	
		} // while�� ��.
	
	}
}