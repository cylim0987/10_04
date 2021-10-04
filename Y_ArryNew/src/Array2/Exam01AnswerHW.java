package Array2;

import java.util.Scanner;

public class Exam01AnswerHW {

	public static void main(String[] args) {

		//1. id="hong", pwd="1234"
		//id와 pwe를 scanner로 입력받아서 id와 pwd가 둘 다 같으면 "login성공",
		//아니면 "1회 실패하였습니다". 출력
		//5회 실패하면, "5회 실패하였습니다. 프로그램을 종료합니다." 출력 후 종료
	
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		
		
		String id;
		String pwd;
		
		
		
		while (true) {
			
			System.out.println("id를 입력하세요 : ");
			id = scanner.nextLine();	
			
			System.out.println("pwd를 입력하세요 : ");
			pwd = scanner.nextLine();
			
			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("**** login 성공 ****");
				break;
			} else {
				count++;
				System.out.println("**** " + count + "회 실패하였습니다 ****");
				
				if (count == 5) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		/*
		if (id == "hong" && pwd == "1234") {
			System.out.println("login 성공");			
		} else {  // 실패 
			System.out.println();
		}
		*/
	}
}

//참조 타입 연산자를 사용할때는 equals를 쓴다.
