package Literal;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//체지방량 계산공식
		// chR = 몸무게 - 체지방량;
		// 남성표준 체지방량 = (1.10*체중kg) - (128*(체중kg^2/키cm^2))
		// 체중 75kg, 키 175cm 인 남성의 체지방량을 구하시오.
	/*
		double x = 75;
		double y = 175;

		double chR = (1.10*x) - (128*(x/y^2));
		
		System.out.println(chR);
		
	
		
	}

}
*/
		// 괄호치는 것.! 정수와 실수 구분.!
 //@@@답
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
	
	//오늘의 과제 : 체지방률 구하기.
	
	}
}
