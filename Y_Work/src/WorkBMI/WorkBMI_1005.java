package WorkBMI;


// �ٸ� Ŭ�������� �������� �����???????????????????????????????? ���� �غ���


import java.util.Scanner;

/* ü���� ���ϱ� */
public class WorkBMI_1005 {

	public static void main(String[] args) {

	//	boolean run = true;
		Scanner scanner = new Scanner(System.in);
		final double maleSTD = 1.10;
		final double femaleSTD = 1.07;
		final double ST1 = 128;
		final double ST2 = 100;
		
		boolean run = true; // while�� �ȿ� run.
		
		while(run) {
			
			
			System.out.println("������ �Է��Ͻÿ� m /f");
			String gender = scanner.next();
			System.out.println("���̸� �Է��Ͻÿ�.");
			int age = scanner.nextInt();
			System.out.println("Ű�� �Է��Ͻÿ�.");
			double height = scanner.nextInt();
			System.out.println("ü���� �Է��Ͻÿ�.");
			double weight = scanner.nextInt();
			
// �ߺ��Ǵ� �ܾ�? Ȯ���� ¤�� �Ѿ�� ��. Duplicate

			
			//1.�����淮 ���ϱ�
			double leanMass = 0.0;
			switch(gender) {
			case "m":
				leanMass = (maleSTD * weight) - (ST1 * 
						        ((weight * weight)/(double)(height * height))); 
			case "f":
				leanMass = femaleSTD * weight - ST1 * 
						        ((weight * weight) /(double)(height * height)); 

			}
			//2. ü���淮 ���ϱ�
			double bodyFat = 0.0;
			bodyFat = weight - leanMass;
			
			//3. ������� ���ϱ�
			double leanMassPercent = 0.0;
			leanMassPercent = leanMass * 100 / weight;
			
			//4. ü����� ���ϱ�
			double bodyFatPercent = 0.0;
			bodyFatPercent = 100 - leanMassPercent;
			
			
		//5. �񸸵� ���
			String result = "";
			switch(gender) {
			case "m" :
				if(bodyFat <12) result = "���� ��"; //0~12
				else if(bodyFat <=17) result = 	"ǥ��"; //12~17
				else if(bodyFat <=22) result = "��ü��"; //18~22
 				else if(bodyFat <=27) result = "��"; //22~27
 				else result = "����";
 						break;
 						
			case "f" :
				if(bodyFat <22) result = "���� ��"; //0~12
				else if(bodyFat <=27) result = 	"ǥ��"; //12~17
				else if(bodyFat <=35) result = "��ü��"; //18~22
 				else if(bodyFat <=40) result = "��"; //22~27
 				else result = "����";
				 	break;
			}
			System.out.println("���");
			System.out.printf("�����淮:%.2f\n", leanMass);
			System.out.printf("%2f\n", leanMass);
			System.out.printf("%2f\n", bodyFat);
			System.out.printf("%2f\n", leanMassPercent);
			System.out.printf("%2f\n", bodyFatPercent);
			System.out.println("���: " + result);
		
			
			//��� ���� Ȯ��
			System.out.println("����ұ��? Y/N");
			String yn = scanner.next();
			if(yn.equals("n")) run = !run; //�ܿ�����.
		}//while ��
		
		System.out.println("���α׷� ����");
	}

}
