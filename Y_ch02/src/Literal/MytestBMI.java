package Literal;

public class MytestBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ü���淮 ������
		// chR = ������ - ü���淮;
		// ����ǥ�� ü���淮 = (1.10*ü��kg) - (128*(ü��kg/Űcm^2))
		// ü�� 75kg, Ű 175cm �� ������ ü���淮�� ���Ͻÿ�.

		int x = 75; // @@@@@@@ double�� ���� ���� -9517.5�� ������
		int y = 175; // @@@@@@ int�� ���� ���� 82.5�� ���´�. 

		double result = (1.10*x) - (128*(x/y*y));
		//(ST1*weight) - (ST2*(weight/height*height));
		System.out.println(result);
		
	// �̷��� �Ǳ� �ȴ�. �ٵ� ST1���� ����ִ°� �� ����... ����?
		
	}

}