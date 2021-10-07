package Work;

import java.util.Scanner;

public class Teeeee {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		final double maleSTD = 1.10, femaleSTD = 1.07;
		final int COMSTD = 128, COMSTD2 = 100;

		while (run) {
			System.out.println("========================================");
			System.out.println(" 정확한 계산을 위하여 아래 정보를 입력 바랍니다");
			System.out.println("========================================");
			System.out.print("성별(남자(M)/여자(F) 입력) >");
			String gender = scanner.next();
			System.out.print("나이를 입력(정수:10~39) > ");
			int age = scanner.nextInt();
			System.out.print("키를 입력(단위:cm) > ");
			double height = scanner.nextDouble();
			System.out.print("몸무게를 입력(단위:kg) > ");
			double weight = scanner.nextDouble();

			//1. 제지방량 구하기
			//남성 = (1.10 * 체중) - (128 * (체중*체중)/(키*키))
			//여성 = (1.07 * 체중) - (128 * (체중*체중)/(키*키))
			double leanBodyMass = 0.0;
			switch (gender) {
			case "M":
				leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
				break;
			case "F":
				leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
				break;
			}
			
			
			
			System.out.println("결과:>");
			System.out.printf("제지방량:%.2f\n", leanBodyMass);


			System.out.println("계속할까요?(yes/No)");
			String yesNo = scanner.next();
			if (yesNo.equals("No"))
				run = !run;
	//
		//2. 체지방량(=체중-제지방량) 구하기
		double bodyFatMass = 0.0;
		bodyFatMass = weight - leanBodyMass;

		// 제지방률(=제지방량*100)/체중
		double leanBodyRatio = (leanBodyMass * 100) / (double) weight;

		//3. 체지방률(=체지방량*100/체중)
		double bodyFatRatio = (bodyFatMass * 100) / (double) weight;


		System.out.println("결과:>");
		System.out.printf("제지방률:%.2f\n", leanBodyRatio);
		System.out.printf("체지방량:%.2f\n", bodyFatMass);
		System.out.printf("체지방률:%.2f\n", bodyFatRatio);

		
		
		//
	
		
		String result = "";
		//4. 남/여 별 비만도 구분
		switch (gender) {
		case "M":
			if (bodyFatRatio < 12)
				result = "야윈 몸";
			else if (bodyFatRatio <= 17)
				result = "표준";
			else if (bodyFatRatio <= 22)
				result = "과체중";
			else if (bodyFatRatio <= 27)
				result = "비만";
			else
				result = "고도비만";

			break;
		case "F":
			if (bodyFatRatio < 22)
				result = "야윈 몸";
			else if (bodyFatRatio <= 27)
				result = "표준";
			else if (bodyFatRatio <= 35)
				result = "과체중";
			else if (bodyFatRatio <= 40)
				result = "비만";
			else
				result = "고도비만";
			break;
		}// switch문 끝.
		
		System.out.println("결과:>");
		System.out.println(result);


		
		
	//	
	
		} // while문 끝.
	
	}
}