package WorkBMI;


// 다른 클래스에서 가져오는 방법은???????????????????????????????? 직접 해보기


import java.util.Scanner;

/* 체지방 구하기 */
public class WorkBMI_1005 {

	public static void main(String[] args) {

	//	boolean run = true;
		Scanner scanner = new Scanner(System.in);
		final double maleSTD = 1.10;
		final double femaleSTD = 1.07;
		final double ST1 = 128;
		final double ST2 = 100;
		
		boolean run = true; // while문 안에 run.
		
		while(run) {
			
			
			System.out.println("성별을 입력하시오 m /f");
			String gender = scanner.next();
			System.out.println("나이를 입력하시오.");
			int age = scanner.nextInt();
			System.out.println("키를 입력하시오.");
			double height = scanner.nextInt();
			System.out.println("체중을 입력하시오.");
			double weight = scanner.nextInt();
			
// 중복되는 단어? 확실히 짚고 넘어가야 함. Duplicate

			
			//1.제지방량 구하기
			double leanMass = 0.0;
			switch(gender) {
			case "m":
				leanMass = (maleSTD * weight) - (ST1 * 
						        ((weight * weight)/(double)(height * height))); 
			case "f":
				leanMass = femaleSTD * weight - ST1 * 
						        ((weight * weight) /(double)(height * height)); 

			}
			//2. 체지방량 구하기
			double bodyFat = 0.0;
			bodyFat = weight - leanMass;
			
			//3. 제지방률 구하기
			double leanMassPercent = 0.0;
			leanMassPercent = leanMass * 100 / weight;
			
			//4. 체지방률 구하기
			double bodyFatPercent = 0.0;
			bodyFatPercent = 100 - leanMassPercent;
			
			
		//5. 비만도 계산
			String result = "";
			switch(gender) {
			case "m" :
				if(bodyFat <12) result = "야윈 몸"; //0~12
				else if(bodyFat <=17) result = 	"표준"; //12~17
				else if(bodyFat <=22) result = "과체중"; //18~22
 				else if(bodyFat <=27) result = "비만"; //22~27
 				else result = "고도비만";
 						break;
 						
			case "f" :
				if(bodyFat <22) result = "야윈 몸"; //0~12
				else if(bodyFat <=27) result = 	"표준"; //12~17
				else if(bodyFat <=35) result = "과체중"; //18~22
 				else if(bodyFat <=40) result = "비만"; //22~27
 				else result = "고도비만";
				 	break;
			}
			System.out.println("결과");
			System.out.printf("제지방량:%.2f\n", leanMass);
			System.out.printf("%2f\n", leanMass);
			System.out.printf("%2f\n", bodyFat);
			System.out.printf("%2f\n", leanMassPercent);
			System.out.printf("%2f\n", bodyFatPercent);
			System.out.println("결과: " + result);
		
			
			//계속 여부 확인
			System.out.println("계속할까요? Y/N");
			String yn = scanner.next();
			if(yn.equals("n")) run = !run; //외워보자.
		}//while 끝
		
		System.out.println("프로그램 종료");
	}

}
