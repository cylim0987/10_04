package Work;

import java.util.Scanner;

public class Work4 {

	public static void main(String[] args) {
		
boolean run = true;
Scanner scanner = new Scanner(System.in);
final double Lmale = 1.10;
final double Lfemale = 1.07;
final double ST2 = 128;
		
	while(run) {
		System.out.println("����, ����, Ű, ������ �� �Է�");
		String input = scanner.nextLine(); //nextLine���� ������ ���������� Line���� ������?
		String[] arr = input.split(" ");
		String gender = arr[0];
		int age = Integer.parseInt(arr[1]); //Integer.parseInt��� �Լ��� ����Ѵ�.
		double height = Double.parseDouble(arr[2]);
		double weight = Double.parseDouble(arr[3]);
	} //��Ʈ���� �ڸ��� �۾� �� �߰� �۾��� �ʿ��� �ڵ�.
	
	}
}	
		
/*
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
	String yesNo = scanner.next(); //Line Line���� �޾ƾ��Ѵ�.? Integer.parseInt �̺κ�.
	if (yesNo.equals("N"))
		break;
	}
	}
}

*/