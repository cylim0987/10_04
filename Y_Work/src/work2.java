import java.util.Scanner;

public class work2 {
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
/*
 *  ch == 'y' || ch == 'Y' // 문자 ch가 'y' 또는 'Y'일 때.
 * 
 *  str.equalsIgnoreCase("yes") // 문자열 str의 내용이 "yes"일 때(대소문자 구분안함)
 * 
 */



