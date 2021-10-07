package Work;

import java.util.Scanner;

public class Work4 {

	public static void main(String[] args) {
		
boolean run = true;
Scanner scanner = new Scanner(System.in);
final double Lmale = 1.10;
final double Lfemale = 1.07;
final double ST2 = 128;
		
	while(run) {
		System.out.println("성별, 나이, 키, 몸무게 순 입력");
		String input = scanner.nextLine(); //nextLine으로 받으면 마지막에도 Line으로 받으라?
		String[] arr = input.split(" ");
		String gender = arr[0];
		int age = Integer.parseInt(arr[1]); //Integer.parseInt라는 함수를 써야한다.
		double height = Double.parseDouble(arr[2]);
		double weight = Double.parseDouble(arr[3]);
	} //스트링을 자르는 작업 등 추가 작업이 필요한 코드.
	
	}
}	
		
/*
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
	String yesNo = scanner.next(); //Line Line으로 받아야한다.? Integer.parseInt 이부분.
	if (yesNo.equals("N"))
		break;
	}
	}
}

*/