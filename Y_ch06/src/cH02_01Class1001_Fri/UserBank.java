package cH02_01Class1001_Fri;

public class UserBank {
	public static void main(String[] args) {
		//Bank객체 생성
		Bank bank = new Bank();
		//System.out.println("잔고: " + bank.balance);
		//bank.balance=10000;
		//bank.balance=bank.balance-5000; //이렇게 하면 안.된다
		
		//입금기능 호출
		bank.deposit(10000);

		//출금기능 호출
		bank.withdraw(8000);
	
		//잔고 출력
		bank.currentBalance();
		
	}

}
