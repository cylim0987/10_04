package Work;

import java.util.Scanner;

/* ü���� ���ϱ� */
public class MethodBMI2 {
	static Scanner scanner = new Scanner(System.in);
	static String gender;
	static int age;
	static double weight, height;
	static final double maleSTD = 1.10, femaleSTD = 1.07;
	static final int COMSTD = 128, COMSTD2 = 100;
	static boolean run = true;
	static double leanBodyMass;
	static double bodyFatMass;
	static double bodyFatRatio;
	static double leanBodyRatio;

	public static void main(String[] args) {
		while (run) {
			String gender;
			int age;
			double height, weight;
			printMenu();
			inputInfo();
			leanBodyMass = getLeanBodyMass();
			System.out.println("�����淮:" + leanBodyMass);
			bodyFatMass = getBodyFatMass();
			leanBodyRatio = getLeanBodyRatio();
			bodyFatRatio = getBodyFatRatio();
			String result = "";
			result = getResult();
			printResult();
			isRun();
		}
		System.out.println("���α׷� ����");
	}

	static void printMenu() {
		System.out.println("=====================================");
		System.out.println(" ��Ȯ�� ����� ���Ͽ� �Ʒ� ������ �Է� �ٶ��ϴ�");
		System.out.println("=====================================");
	}

	static void inputInfo() {
		System.out.println("����(����(M)/����(F)�Է�)>");
		gender = scanner.next();
		System.out.println("����(����:10~39 �Է�)>");
		age = scanner.nextInt();
		System.out.println("Ű �Է�(����:cm)>");
		height = scanner.nextDouble();
		System.out.println("������ �Է�(����:kg)>");
		weight = scanner.nextDouble();
	}

	static double getLeanBodyMass() {
		double leanBodyMass = 0.0;
		switch (gender) {
		case "M":
			leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
		case "F":
			leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
		}
		System.out.println(leanBodyMass);
		return leanBodyMass;
	}

	static double getBodyFatMass() {
		return weight - leanBodyMass;
	}

	static double getLeanBodyRatio() {
		return (leanBodyMass * COMSTD2) / (double) weight;
	}

	static double getBodyFatRatio() {
		return (bodyFatMass * COMSTD2) / (double) weight;
	}

	static String getResult() {
		String result = "";
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "���� ��"; // 0~12�̸�
			else if (bodyFatRatio <= 17)
				result = "ǥ��"; // 12~17
			else if (bodyFatRatio <= 22)
				result = "��ü��";// 18~22
			else if (bodyFatRatio <= 27)
				result = "��"; // 22~27
			else
				result = "����";// >=28
			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "���� ��"; // 0~22�̸�
			else if (bodyFatRatio <= 27)
				result = "ǥ��"; // 22~27
			else if (bodyFatRatio <= 35)
				result = "��ü��";// 28~35
			else if (bodyFatRatio <= 40)
				result = "��"; // 36~40
			else
				result = "����";// >=40
			break;
		}
		return result;
	}

	static void printResult() {
		System.out.println("���:>");
		System.out.printf("�����淮:%.2f\n", leanBodyMass);
		System.out.printf("��������:%.2f\n", leanBodyRatio);
		System.out.printf("ü���淮:%.2f\n", bodyFatMass);
		System.out.printf("ü������:%.2f\n", bodyFatRatio);
		System.out.println("���:" + getResult());
	}

	static void isRun() {
		System.out.println("����ұ��?(yes/no)");
		String yesNo = scanner.nextLine();
		if (yesNo.equals("no"))
			run = !run;
	}
}