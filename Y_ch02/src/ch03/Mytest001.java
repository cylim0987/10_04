package ch03;

public class Mytest001 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		
		double y = 13.3;
		System.out.println(y);
		
		System.out.println(x+y);
		
		// x + y가 소수점을 버린 결과가 나오게 하려면 어떻게 해야하나?
		
		//(int x + double y); - 오류.. 이렇게 쓰는거 아님
		
		long z = 17; //long은 정수까지만.
		System.out.println(y+z);

		
	// 정수 + 정수의 연산 결과는 정수로 출력. -> 범위가 좁은 타입과 범위가 넓은 타입의 연산결과는. 범위가 넓은 타입으로 출력이 된다.
		int a = 10;
		double b = 15.2;
		// x + y가 소수점을 버린 결과가 나오게 하려면 어떻게 해야하나? - 
		//double타입의 변수 y를 강제로 int(정수)타입으로 변환
		// 형변환->(casting)
		int result = a +(int)b;
		System.out.println(a+b);
		System.out.println(result);
		// 10 -> 10.0(정수 -> 실수), 10.0 + 15.2 = 25.2
		
	// 정수 + 실수의 연산 결과는 실수의 결과값을 출력.
		int a2 = 5; //정수
		double b2 = 2.0; //실수
		System.out.println(a2+b2); 
		// 5 -> 5.0(정수 -> 실수:jvm내부적으로 자동 처리됨.), 5.0 + 2.0 = 7.0;
		
	}

}
