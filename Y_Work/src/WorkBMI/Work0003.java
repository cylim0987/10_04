package WorkBMI;

import java.util.Scanner;

public class Work0003 {

	public static void main(String[] args) {

		System.out.println("성별을 입력하시오: M / F");
		Scanner scanner = new Scanner(System.in);
		String gender = scanner.next();

		double weight = ' ';
		double height = ' ';
		// if는 true, false 둘 밖에 못 온다... 문자열이 안 돼
	switch (gender) {
		case "M":
			System.out.println("남성222222222.");
			System.out.println("키를 입력하시오.");
			break;
		case "F":
			System.out.println("여성");
			System.out.println("키를 입력하시오.");
		}

	}
}
/*
 * // 제지방량 구하기
		final double Lmale = 1.10;
		final double Lfemale = 1.07;
		final double ST2 = 128;

 * 
//제지방량
		double result = Lmale * weight - ST2 * 
				        ((weight * weight) /(double)(height * height)); 

// 체지방량 구하기
		double result2 = weight - result;
		
// 체지방률 구하기 = 체지방량*100/체중
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;

*/
