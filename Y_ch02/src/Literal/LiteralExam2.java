package Literal;

public class LiteralExam2 {

	public static void main(String[] args) {
	/* 정수 리터럴 */
	// 10진수가 아닌 8진수, 16진수, 2진수 리터럴들은
	// 10진수 변환되어서 대입이 됨.
	int n = 15; // 정수타입 변수를 선언하고 십진수 리터럴 15를 대입
	int m = 015; // 정수타입 변수를 선언하고 8진수 015를 대입
	int k = 0x15; // 정수타입 변수를 선언하고 16진수 0x15를 대입
	int b = 0b0101; // 정수타입 변수를 선언하고 2진수 0b0101을 대입
	
	System.out.println(n); // 15 - 1*10^1 + 5*10^0 (그냥 표시할 때)
	System.out.println(m); // 1*8^1 + 5*8^0 + 5;
	System.out.println(k); // 1*16^1 + 5*16^0
	System.out.println(b); // 0*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 0 + 4 + 0 + 1 = 5
	
	//2배수 정수 - 32비트 64비트
	//long타입의 정수는 리터럴 뒤에 L이나 l을 붙임.
	long l1 = 24l; // long타입 정수 변수를 선언하고 long타입 리터럴을 대입
	
	// = 은 대입을 처리하는 대입 연산자임.
	// =을 기준으로 왼쪽 타입과 오른쪽타입을 비교하면
	// 연사자인 = 의 왼쪽은 범위가 넓은 정수타입(long) 오른쪽은 범위가 좁은 정수타입(int)
	// 정수타입 24가 24L로 변환해서 저장
	long l2 = 24; // long타입 변수를 선언하고 int정수타입 리터럴을 대입 
	
	
	//이진수로 출력
	System.out.println(Integer.toBinaryString(n));

	}

}

