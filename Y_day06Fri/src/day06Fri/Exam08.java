package day06Fri;

public class Exam08 {

	public static void main(String[] args) {

		double x = 5.0;
		double y = 0.0;
		
		double z = x % y; // 5.0/0.0은...? 어떤 수를 0으로 나누면 
	//	System.out.println(z);	//숫자로 표현 불가 NaN, Null, String 연산결과 NaN, Null, String
		
		if (Double.isNaN(z)){
		System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z + 10; // NaN + 10 => NaN
			// 오류는 나지 않지만 결과는 원하지 않는 결과 발생
		System.out.println("결과: " + result);

		
		
		}
	}

}
