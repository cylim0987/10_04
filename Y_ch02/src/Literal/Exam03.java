package Literal;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ü���淮 ������
		// chR = ������ - ü���淮;
		// ����ǥ�� ü���淮 = (1.10*ü��kg) - (128*(ü��kg^2/Űcm^2))
		// ü�� 75kg, Ű 175cm �� ������ ü���淮�� ���Ͻÿ�.
	/*
		double x = 75;
		double y = 175;

		double chR = (1.10*x) - (128*(x/y^2));
		
		System.out.println(chR);
		
	
		
	}

}
*/
		// ��ȣġ�� ��.! ������ �Ǽ� ����.!
 //@@@��
	final double ST1 = 1.10;
	final int ST2 = 128;
	
	int x = 75;
	int y = 175;
	double x1 = ST1*x;
	int ww = x*x;
	int hh = y*y;
	
	System.out.println("ww:"+ww);
	System.out.println("hh:"+hh);
	
	double w1 = (x*x)/(y*y);
	double w2 = ST2*w1;
	
	System.out.println("x1:"+x1);
	System.out.println("w1:"+w1);
	System.out.println("w2:"+w2);
	
	double result = ST1*x - (ST2*((x*x)/((double)y*y)));
	System.out.println(result);
	
	//������ ���� : ü����� ���ϱ�.
	
	}
}
