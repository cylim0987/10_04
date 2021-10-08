package Ex20;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
			


	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		boolean run = true; 
		while(run) {
			 System.out.println("--------------------------------------");
			 System.out.println("1.���»��� |2.���¸�� |3.���� |4.���|5.����");
			 System.out.println("--------------------------------------");
			 System.out.println("����>");
			
			 //1,2,3 ..�� �޾ƾ� �Ѵ�.
			 int selectNo = scanner.nextInt();
			 
			 if(selectNo == 1) {
				 createAccount(); 
			 }else if(selectNo == 2) {
				 accountList(); //
			 }else if(selectNo == 3) {
				 deposit();
			 }else if(selectNo == 4) {
				 withdraw();
			 }else if(selectNo == 5) {
				 run = false; 
			 }
			 
		}
		System.out.println("���α׷� ����"); 
	}

	private static void withdraw() {
	}

	private static void deposit() {
		
		
	}

	private static void accountList() {
		
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
	
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i]; 
			if(account != null) { 
				 System.out.println("���¹�ȣ:"+account.getAno()); 
				 System.out.println("������:"+account.getOwner()); 
				 System.out.println("���¹�ȣ:"+account.getBalance());
				 System.out.println();
				
				
			}
		}
	}

	private static void createAccount() {
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ:");
		String ano = scanner.next(); 
		System.out.print("������:");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�:");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance); 
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				
				accountArray[i] = newAccount; 
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break; 
		}
	}

}
}
