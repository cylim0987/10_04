package cH02_01Class1001_Fri;
//은행업무 큰래스
public class Bank {
	//현재잔고 금액 필드
	private int balance = 0;
	//입금기능
	public void deposit(int amount) {
		balance = balance += amount;
	}
	//출금
	public void withdraw(int amount) {
		//balance = balance - amount;
		if(balance-amount>=0)
			balance -=amount;
	}
	//잔고 출력
	public void currentBalance() {
		System.out.println("잔고:" + balance);
	}
	
}
