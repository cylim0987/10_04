package Ch04Exercise;

import java.util.Scanner;

public class Ch04Exercise7 {
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
	
		int menuNum = scanner.nextInt();
	
		switch(menuNum) {
		case 1:
			System.out.println("예금액> ");
			balance += scanner.nextInt();
			break;
		case 2:
			System.out.println("출금액> ");
			int money = scanner.nextInt();
			if(balance - money >0) 
			balance -= money;
			break;
			
		case 3:
			System.out.print("잔고> ");
			System.out.println(balance);
			break;
		case 4:
			run = false; //run = !run;
			break;
		}//switch끝
		System.out.println();
	
	}//while끝
		
	System.out.println("프로그램 종료");
	
	}

}