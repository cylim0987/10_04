package ch06_methods_01;

public class Ex02 {

	public static void main(String[] args) {

		B1 b1 = new B1();
		int result = b1.add(10, 20);
		System.out.println(result);
		float res2 = b1.add2(10, 20);
		System.out.println(res2);
		
	}
}




class B1{
	//1유형
	int add(int x, int y) {
		return x+y;
	}
	//1유형 매개변수 받는 것을 정수로 받아서 처리 후 결과를 float타입으로 변환해서 리턴
	//int -> float 자동 형변환
	float add2(int x, int y) {
		return x+y;
	}
}