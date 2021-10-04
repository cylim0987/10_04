package Literal;

public class Mbmi {

	public static void main(String[] args) {
		
		//1. 표준 제지방량 계산
		//남성표준 =  (1.10  * 체중kg ) - ( 128 * ( 체중kg제곱 / 키cm제곱 ) )		
		
		final double ST1 = 1.10;
		final double ST2 = 128;
		
		int weight = 75;
		int height = 175;
		//자바에서는 제곱연산이 없음.
		double leanMass = (ST1*weight) - (ST2*(weight*weight/((double)height*height)));
		// 정수 나누기 정수는 정수라 0이 나왔음. 이게 안 나오게 하려면 double을 써야함.
		// 이 중의 하나는 실수로 만들어줘야하기 때문
		System.out.println(leanMass);
	
		//2. 표준 체지방량 계산
		//체지방량kg = 체중kg - 제지방량kg		
		double bodyFat = weight - leanMass;
		System.out.println(bodyFat);

		//3.표준 제지방률 계산
		//제지방률%(제지방  = (제지방량kg * 100 ) / 체중kg
		
		double leanMassPercent = leanMass * 100 / weight;
		System.out.println(leanMassPercent);
		
		
		//4. 표준 체지방률 계산
		//1) 체지방률% = 100 - 제지방률%
		//2) 체지방률% = (체지방량kg * 100 ) / 체중kg
		double bodyFatPercent = 100 - leanMassPercent;
		System.out.println(bodyFatPercent);
			
		double bodyFatPercent2 = (bodyFat * 100)/weight;
		System.out.println(bodyFatPercent2);

		
		// 아스키 코드 이름
		char l = '\uC784';
		char c = '\uCC44';
		char y = '\uC601';
		System.out.println(l);
		System.out.println(c);
		System.out.println(y);
		
	}

}
