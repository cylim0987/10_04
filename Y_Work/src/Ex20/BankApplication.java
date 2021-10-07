package Ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx; //idx=0;
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4.출금 | 5. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
				;
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");

	}

	// 계좌생성하기

		private static void createAccount() {
			String ano=scanner.next();
			String owner=scanner.next();
			int balance=scanner.nextInt();
			Account acc = new Account(ano,owner,balance);
			accountArray[idx++]=acc;
			System.out.println("계좌생성.");

	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("계좌목록");
		//객체 참조변수타입 배열을 순차적으로 읽으면서 참조변수가 null이 아닐때만 출력.
			for(int i=0; i<accountArray.length; i++) {
				Account account = accountArray[i];
					if(account != null) {// == != = !
						if(account.getAno().equals(ano))
							return account;
					}
				System.out.println(accountArray[i].toString());
				//오류발생. 2개만 되어있음. 나머지 98개는 null 그래서 accountArray.length로 돌려버리면 오류.
				//null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPoint오류발생
				//오류 발생을 막기 위해 null앞에서 멈춰버리면 됨.
			}
			return account;
	}

	// 예금하기
	private static void deposit() {
		private static void deposit() {
			String ano = scanner.next();
			int amount = scanner.nextInt();
			Account acc = findAccount(ano);
			if(acc!=null)
				acc.setBalance(acc.getBalance()+amount);

	}

	// 출금하기
	private static void withdraw() {
		String ano = scanner.next();
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if(acc!=null) {
			if(acc.getBalance()-amount>=0) {
			   acc.setBalance(acc.getBalance()-amount);
			}
	}
}
	}
}