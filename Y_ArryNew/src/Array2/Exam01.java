package Array2;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		//1. id="hong", pwd="1234"
		//id와 pwe를 scanner로 입력받아서 id와 pwd가 둘 다 같으면 "login성공",
		//아니면 "1회 실패하였습니다". 출력
		//5회 실패하면, "5회 실패하였습니다. 프로그램을 종료합니다." 출력 후 종료
		
		Scanner scanner = new Scanner(System.in);
		int[] cnt = new int[5];
		boolean run = true;
		
		while(true) {
			if(cnt==5) { //기본데이터 타입의 값 비교
				System.out.println(cnt + "회 실패하였습니다. 프로그램을 종료합니다.");
			}
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.println("아이디>");
				if(run="hong");
			System.out.println("패스워드>");
				if(run="1234") {
					
				}
					
			if(id가"hong"이고 pwd가 "1234") //참조객체의 비교와 논리곱연산
				if(System.in("hong" && 1234 = true;))
					
				{"로그인 성공"; break;}
			
			//실패시
			System.out.println(cnt+"회 실패하였습니다.");
		}
		System.out.println("프로그램 종료");
	}

}

//참조 타입 연산자를 사용할때는 equals를 쓴다.
