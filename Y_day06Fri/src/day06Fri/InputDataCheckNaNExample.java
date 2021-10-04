package day06Fri;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자가 아닌 NaN을 입력받아서 연산 처리
		
		String userInput = "NaN";
		//Double은 double타입의 데이타를 만들고 수정처리해주는 클래스
		//wrapper클래스라고 함.
		//
		Double a = Double.valueOf(5.0);// double값으로 생성
		Double b = Double.valueOf("5.0");// double값을 가진 문자열로 생성
		
		System.out.println(a);
		System.out.println(b);
		
		double val = Double.valueOf(userInput);
		double currentBalanace = 10000.0;
		
		currentBalance += val;
		
		System.out.println(currentBalance);
		
		
	}

}
