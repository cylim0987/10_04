package Ch04Exercise;

import java.util.Scanner;

public class Ch04Exercise007 {
public static void main(String[] args) {

	//반복처리시 조건문확인 변수
	boolean run = true;
	//현재금액 변수
	int balance = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	
	while(run) { //run은 true처음부터실행된다.(?)

		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------");
		System.out.println("선택> ");
	
		int menu = scanner.nextInt();
		
		if(menu==1) {
			System.out.print("예금액>");
			balance = balance + scanner.nextInt();

		}else if(menu==2) {
			System.out.print("출금액>");
			balance = balance - scanner.nextInt();
		
		}else if(menu==3) {
			System.out.println("잔고>" + balance);
		}else if(menu==4) {
			run = !run;
		}else {
			System.out.print("메뉴번호확인-");
		
		}
	}
		
	System.out.println("프로그램 종료");
	
	}

}