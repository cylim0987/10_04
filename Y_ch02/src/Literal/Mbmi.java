package Literal;

public class Mbmi {

	public static void main(String[] args) {
		
		//1. ǥ�� �����淮 ���
		//����ǥ�� =  (1.10  * ü��kg ) - ( 128 * ( ü��kg���� / Űcm���� ) )		
		
		final double ST1 = 1.10;
		final double ST2 = 128;
		
		int weight = 75;
		int height = 175;
		//�ڹٿ����� ���������� ����.
		double leanMass = (ST1*weight) - (ST2*(weight*weight/((double)height*height)));
		// ���� ������ ������ ������ 0�� ������. �̰� �� ������ �Ϸ��� double�� �����.
		// �� ���� �ϳ��� �Ǽ��� ���������ϱ� ����
		System.out.println(leanMass);
	
		//2. ǥ�� ü���淮 ���
		//ü���淮kg = ü��kg - �����淮kg		
		double bodyFat = weight - leanMass;
		System.out.println(bodyFat);

		//3.ǥ�� ������� ���
		//�������%(������  = (�����淮kg * 100 ) / ü��kg
		
		double leanMassPercent = leanMass * 100 / weight;
		System.out.println(leanMassPercent);
		
		
		//4. ǥ�� ü����� ���
		//1) ü�����% = 100 - �������%
		//2) ü�����% = (ü���淮kg * 100 ) / ü��kg
		double bodyFatPercent = 100 - leanMassPercent;
		System.out.println(bodyFatPercent);
			
		double bodyFatPercent2 = (bodyFat * 100)/weight;
		System.out.println(bodyFatPercent2);

		
		// �ƽ�Ű �ڵ� �̸�
		char l = '\uC784';
		char c = '\uCC44';
		char y = '\uC601';
		System.out.println(l);
		System.out.println(c);
		System.out.println(y);
		
	}

}
