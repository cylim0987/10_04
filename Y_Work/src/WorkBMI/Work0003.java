package WorkBMI;

import java.util.Scanner;

public class Work0003 {

	public static void main(String[] args) {
		
boolean run = true;
Scanner scanner = new Scanner(System.in);
final double Lmale = 1.10;
final double Lfemale = 1.07;
final double ST2 = 128;
		
	while(true) {
		System.out.println("성별을 입력하시오: M / F");
			String gender = scanner.next();
		System.out.println("나이를 입력하시오:");
			int age = scanner.nextInt();
		System.out.println("키를 입력하시오.");
			double height = scanner.nextDouble();
		System.out.println("체중을 입력하시오.");
			double weight = scanner.nextDouble();
		// if는 true, false 둘 밖에 못 온다... 문자열이 안 돼
	
			double leanMass = 0.0;
			double bodyFat = 0.0;
			double leanMassPercent = 0.0;
			double bodyFatPercent = 0.0;
			
			
			
	switch (gender) {
		case "M":
			System.out.println("남성");

			//제지방량
			leanMass = (Lmale*weight) - (ST2*(weight*weight/((double)height*height)));
			System.out.println(leanMass);
			
			bodyFat = weight - leanMass;
			System.out.println(bodyFat);
			
			leanMassPercent = leanMass * 100 / weight;
			System.out.println(leanMassPercent);
			
			bodyFatPercent = 100 - leanMassPercent;
			System.out.println(bodyFatPercent);
			
			break;
		
		case "F":
			System.out.println("여성");
			
			leanMass = (Lfemale*weight) - (ST2*(weight*weight/((double)height*height)));
			System.out.println(leanMass);

			bodyFat = weight - leanMass;
			System.out.println(bodyFat);
			
			leanMassPercent = leanMass * 100 / weight;
			System.out.println(leanMassPercent);
			
			bodyFatPercent = 100 - leanMassPercent;
			System.out.println(bodyFatPercent);
			
			break;

			
		}
	System.out.println("계속할겁니까 Y / N");
	String yesNo = scanner.next();
	if (yesNo.equals("N"))
		break;
	}
	}
}

/*
 * 
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
