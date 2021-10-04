package ch03;

public class VariableVsConstanceExam2 {

	public static void main(String[] args) {
		int x = 10;
		int y;
		
		y = 20;
		x = 20;
		System.out.println(x+y);
		
		//상수 선언 
		//final 타입 변수명; = 값; 값을 final로 고정(?)
		//상수는 일반적으로 대문자로 표시한다.
		final double PI = 3.141592;
		//반지름 r=5 인 원의 넓이
		//PI*r*r
		//실수타입 변수를 선언하고,
		//실수 변수PI의 값과 정수5를 제곱한 결과값을 저장
		double area = PI*5*5; //3.141592*5.0*5.0
		//파이썬은 ^(제곱)을 쓰는데 자바는 못 쓴다.
		//출력
		System.out.println(area);//실수값으로 출력

		// 상수로 선언된 변수의 값은 초기화 후 변경시 오류 발생.해서 바로 아래줄을 바꿔줌.
		//PI = 3.14;
		area = PI*5*5;
		System.out.println(area);
	
	}

}
