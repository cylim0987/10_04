package WorkBMI;

import java.util.Scanner;

public class Work0003 {

	public static void main(String[] args) {
		
boolean run = true;
Scanner scanner = new Scanner(System.in);
final double Lmale = 1.10;
final double Lfemale = 1.07;
final double ST2 = 128;
		
	while(true) {
		System.out.println("������ �Է��Ͻÿ�: M / F");
			String gender = scanner.next();
		System.out.println("���̸� �Է��Ͻÿ�:");
			int age = scanner.nextInt();
		System.out.println("Ű�� �Է��Ͻÿ�.");
			double height = scanner.nextDouble();
		System.out.println("ü���� �Է��Ͻÿ�.");
			double weight = scanner.nextDouble();
		// if�� true, false �� �ۿ� �� �´�... ���ڿ��� �� ��
	
			double leanMass = 0.0;
			double bodyFat = 0.0;
			double leanMassPercent = 0.0;
			double bodyFatPercent = 0.0;
			
			
			
	switch (gender) {
		case "M":
			System.out.println("����");

			//�����淮
			leanMass = (Lmale*weight) - (ST2*(weight*weight/((double)height*height)));
			System.out.println(leanMass);
			
			bodyFat = weight - leanMass;
			System.out.println(bodyFat);
			
			leanMassPercent = leanMass * 100 / weight;
			System.out.println(leanMassPercent);
			
			bodyFatPercent = 100 - leanMassPercent;
			System.out.println(bodyFatPercent);
			
			break;
		
		case "F":
			System.out.println("����");
			
			leanMass = (Lfemale*weight) - (ST2*(weight*weight/((double)height*height)));
			System.out.println(leanMass);

			bodyFat = weight - leanMass;
			System.out.println(bodyFat);
			
			leanMassPercent = leanMass * 100 / weight;
			System.out.println(leanMassPercent);
			
			bodyFatPercent = 100 - leanMassPercent;
			System.out.println(bodyFatPercent);
			
			break;

			
		}
	System.out.println("����Ұ̴ϱ� Y / N");
	String yesNo = scanner.next();
	if (yesNo.equals("N"))
		break;
	}
	}
}

/*
 * 
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
