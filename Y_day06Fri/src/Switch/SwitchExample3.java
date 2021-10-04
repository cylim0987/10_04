package Switch;

import java.util.Scanner;

public class SwitchExample3 {

	public static void main(String[] args) {

		//월요일, 화, 수, 목, 금, 토, 일
		//월~목요일 : 열심히 공부합니다.
		//금요일 : 쇼핑을 합니다
		//토~일요일 : 레저를 즐깁니다.
		
		// : : : : 잘 기억하기.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("요일을 입력해주세요(ex:월요일)");
		String weekDay = scanner.next();
		switch(weekDay) {
		
		//random()을 이요해서 값을 출력
		// int weekDay = (int)(Math.random()*7); // 0<=7;
	
		case "월요일": 
		case "화요일":
		case "수요일":
		case "목요일": System.out.println("열심히 공부합니다.");
			break;
		case "금요일" : System.out.println("열심히 공부합니다.");
			break;
		case "토요일":
		case "일요일" : System.out.println("쇼핑을 합니다");
			break;
		default : System.out.println("잘못된 접근입니다.");	
		}
		
	}

}
