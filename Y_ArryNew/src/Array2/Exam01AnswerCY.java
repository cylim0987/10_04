package Array2;

import java.util.Scanner;

public class Exam01AnswerCY {
	
	public static void main(String[] args) {
		
		/*
		 *  입력받아: id, pwd
		 *  체크 고고
		 *  
		 *  경우1 : 성공 -> 프린트:성공 -> 종료
		 *  경우2: 실패 -> 프린트: 실패 -> 처음으로 
		 *  
		 *  - > 다시 입력받아아야 돼 -> count. 실패를 5번 하면 종료. 
		 */
		
		
	
		//String id;
		//id = "hong";
		
		//String pwd;
		//pwd = "1234";
		
		
		//1. 입력받아.  scanner    확인요망../ ????
		Scanner scanner = new Scanner(System.in);
		
		int count;
		count = 0;
		
		while (true) {
			
			//1. 입력받아.  scanner
			//Scanner scanner = new Scanner(System.in);
			//왜지? 이건 반복 안 해도 되나?
			
			// 2. 입력받은 걸 저장한다.
			System.out.println("id를 입력하세요");
			String id;
			id = scanner.nextLine();
			//System.out.println("id: " + id);
			
			System.out.println("pwd를 입력하세요");
			String pwd;
			pwd = scanner.nextLine();
			//System.out.println("pwd: " + pwd);
			
			
			if (id.equals("hong") && pwd.equals("1234")) {
				System.out.println("**** login성공 ****");
				break;
			} else {
				
				count++;
				System.out.println("**** " + count + "회 실패하였습니다 ****");
				//System.out.println(count + "회 실패하였습니다");
				
				
				// 5가 될 때 break;
				// 조건 count == 5
				// -> break;
				if (count == 5) {
					
					break;
				}
				

				/*
				for (count = 0; count <= 5; count++) {
					System.out.println(count + "회 실패하였습니다");
				}
				*/
			}
		} 
		
		System.out.println("프로그램을 종료합니다.");
		
	
		/*
		if ((id == "hong") && (pwd == "1234")) {
			System.out.println("login성공");
		} else {
			System.out.println("실패하였습니다");
		}
		*/
	}
}