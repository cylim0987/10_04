import java.util.Scanner;

//package work;
/* vctor@naver.com
 * 과제 제출기한 10/4일(월) 23:59분 까지
 * 스캐너로 입력값 입력받기 성별, 나이, 키, 몸무게
 * 반복처리 가능하게 만들고 
 * 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정하기.
 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 * */

 // 성별을 입력하세요.
// 나이를 입력하세요.

// 키를 입력하시오.
// 몸무게를 입력하시오.

/*
 * 1. 표준 제지방량 계산

남성표준 =  (1.10  * 체중kg ) - ( 128 * ( 체중kg제곱 / 키cm제곱 ) )

여성표준 =  (1.07 * 체중kg ) - ( 128 * (체중kg제곱 / 키cm제곱 ) )

 

2. 표준 체지방량 계산

체지방량kg = 체중kg - 제지방량kg

 

3.표준 제지방률 계산

제지방률% = (제지방량kg * 100 ) / 체중kg

 

4. 표준 체지방률 계산

1) 체지방률% = 100 - 제지방률%

2) 체지방률% = (체지방량kg * 100 ) / 체중kg

 

가) 남성 (10~39세)

- 12% 미만 : 야윈 몸

- 12 ~ 17% : 표준

- 18 ~ 22% : 과체중

- 23 ~ 27% : 비만

- 28% 이상 : 고도비만

　

나) 여성 (10~39세)

- 22% 미만 : 야윈 몸

- 22 ~ 27% : 표준

- 28 ~ 35% : 과체중

- 36 ~ 40% : 비만

- 41% 이상 : 고도비만
 */


public class work3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num = scanner.nextDouble();
		System.out.println(num);
		// 제지방량 구하기
		final double ST1 = 1.10;
		final double ST2 = 128;

		int weight = 75;
		int height = 175;

		//제지방량
		double result = ST1 * weight - ST2 * 
				        ((weight * weight) /(double)(height * height)); 

		System.out.println(result);

		// 체지방량 구하기
		double result2 = weight - result;

		System.out.println(result2);

		// 체지방률 구하기 = 체지방량*100/체중
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;

		System.out.println(result3);
	}
}