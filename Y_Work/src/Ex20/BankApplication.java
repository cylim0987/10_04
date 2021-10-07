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
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4.��� | 5. ����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
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

		System.out.println("���α׷� ����");

	}

	// ���»����ϱ�

		private static void createAccount() {
			String ano=scanner.next();
			String owner=scanner.next();
			int balance=scanner.nextInt();
			Account acc = new Account(ano,owner,balance);
			accountArray[idx++]=acc;
			System.out.println("���»���.");

	}

	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("���¸��");
		//��ü ��������Ÿ�� �迭�� ���������� �����鼭 ���������� null�� �ƴҶ��� ���.
			for(int i=0; i<accountArray.length; i++) {
				Account account = accountArray[i];
					if(account != null) {// == != = !
						if(account.getAno().equals(ano))
							return account;
					}
				System.out.println(accountArray[i].toString());
				//�����߻�. 2���� �Ǿ�����. ������ 98���� null �׷��� accountArray.length�� ���������� ����.
				//null�� �Ǿ��ִ� ���������� ���� toString()���� ������ nullPoint�����߻�
				//���� �߻��� ���� ���� null�տ��� ��������� ��.
			}
			return account;
	}

	// �����ϱ�
	private static void deposit() {
		private static void deposit() {
			String ano = scanner.next();
			int amount = scanner.nextInt();
			Account acc = findAccount(ano);
			if(acc!=null)
				acc.setBalance(acc.getBalance()+amount);

	}

	// ����ϱ�
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