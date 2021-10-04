package Literal;

public class Exam01 {

	public static void main(String[] args) {
		// 변수의 선언
		
		//int x = 1.5; //1. int정수타입인데 doulbe(실수) 사용
		int x = (int)1.5; // 1.5앞에 (int)를 넣으면 바꿀 수 있음. -> 정수 1로 강제로 바뀜
		
		//int 2nd = 20; //2. 변수명 숫자로 시작은 사용불가
		int nd2 = 20;
		
		//int myMoney# = 25; //3. 특수문자 #사용불가 ( $ _ 만 사용.
		int myMoney = 25;
		
		//float f = 12.25; //4. double(실수)타입의 리터럴을 float(실수)범위 변수에 대입 불가
		float f = (float)12.25;
		//float f = 12.25f; // 이렇게도 쓸 수 있음. 
		//int result = 12 + 15.3; //5. 실수를 정수범위 변수 대입 불가
		int result = 12 + (int)15.3;
		
		//String _name = '홍길동'; //6. char(문자)' '타입의 리터럴은 1자, String(문자열)""로 변환.
		String _name = "홍길동";
		
		
	}

}
