package Literal;

public class MytestBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//체지방량 계산공식
		// chR = 몸무게 - 체지방량;
		// 남성표준 체지방량 = (1.10*체중kg) - (128*(체중kg/키cm^2))
		// 체중 75kg, 키 175cm 인 남성의 체지방량을 구하시오.

		int x = 75; // @@@@@@@ double로 했을 때는 -9517.5가 나오고
		int y = 175; // @@@@@@ int로 했을 때는 82.5가 나온다. 

		double result = (1.10*x) - (128*(x/y*y));
		//(ST1*weight) - (ST2*(weight/height*height));
		System.out.println(result);
		
	// 이래도 되긴 된다. 근데 ST1으로 잡아주는게 더 좋을... 지도?
		
	}

}