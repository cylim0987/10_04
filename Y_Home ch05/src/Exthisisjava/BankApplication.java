package Exthisisjava;

import java.util.Scanner;

public class BankApplication {��������������
//���µ��� ������ �� �ִ� ����Ҹ� ������ �Ѵ�.
//	Account��ü�� ������ ������ �� �ִ� Ÿ���� �迭�̴�.
//	Account �迭�� �̸� �ʵ�� �����س��´�.
	private static Account[] accountArray = new Account[100]; // new!!!!!!!! ����.20������
			//static ������ main���� �� �迭�� ����ϱ� ����. static�� ������ main���� ����� ���� ����.

	//Ű����κ��� �Է��� �޾ƾ��ϴϱ� Scanner�� ����.
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) { //������ �ؾ��ϱ� ������ mai1n�޼ҵ带 ������ش�.
		//�����̶�� �޼ҵ忡��
		boolean run = true; // run�̶�� ���ú����� ��� ����� �ǳĸ� while������ run�� Ʈ�簡 �Ǹ� �ݺ�, false�� ����������.
		while(run) {//ó���� boolean�� Ʈ��ϰ� ���� ��� �����Ѵ�.
			 System.out.println("--------------------------------------");
			 System.out.println("1.���»��� |2.���¸�� |3.���� |4.���|5.����");
			 System.out.println("--------------------------------------");
			 System.out.println("����>");
			
			 //1,2,3 ..�� �޾ƾ� �Ѵ�.
			 int selectNo = scanner.nextInt(); // �� �ѹ��� � ���� ������ �ִ��Ŀ� ����.
			 
			 if(selectNo == 1) {
				 createAccount(); //��� �޼ҵ带 ȣ���ϵ���. ���θ޼ҵ忡�� �ٷ� ȣ���߱� ������ static���� �����ؾ��Ѵ�.
			 }else if(selectNo == 2) {
				 accountList(); //
			 }else if(selectNo == 3) {
				 deposit();
			 }else if(selectNo == 4) {
				 withdraw();
			 }else if(selectNo == 5) {
				 run = false; //run�� false�� ����ϱ�. 5���� ����ϱ�.
			 }
			 
		}
		System.out.println("���α׷� ����"); //while�� �߰�ȣ. ���Ϲ� �ٱ�.
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		//���� �޼ҵ峻���� ä�����Ѵ�.
		System.out.println("----------");
		System.out.println("���");
		System.out.println("----------");
		System.out.println("���¹�ȣ");
		String ano = scanner.next();
		System.out.println("��ݾ�: ");
		int money = scanner.nextInt();
		
		//����ڰ� �Է��� ���¿� ������ ��ü�� �迭���� ã�ƿ;� �Ѵ�.
		Account account = findAccount(ano); //find��� �޼ҵ带 ȣ���ؼ�. �� �޼ҵ��� �Ű������� ã�����ϴ� ano(a,number��¶�)���� �Ѱ��ָ� �� a�ѹ����� �ش��ϴ� ��ī��Ʈ�� ���ϵǾ�����������.
	
		//ã�Ҵٸ�,
		if(account == null) { // �� ã�Ҵٸ�. //���� ã�� ���ϰ� null�� �����ϴ� ���. . /for������ �迭�� ���̸�ŭ �ݺ��ϴµ� ������ �ݺ��� �ص�. a�ѹ��� ������ account��ü������ ������ ��ü�� �� ã�Ҵٸ� account�� ��� null���·� �����ִ�. null���°� ��� �����־ for���� ��� �����ϰ�, a�ѹ��� ������ �� ã�� ������ ���. null�� ���·� ����.
			System.out.println("���: ���°� �����ϴ�.");//ano�� �ش��ϴ� ���¸� �� ã�Ҵٸ�.
			return; //�޼ҵ� ���� ����
		}
		account.setBalance(account.getBalance() - money); //����� - ���̳ʽ�.
		System.out.println("���: ����� �����Ǿ����ϴ�.");
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("----------");
		System.out.println("����");
		System.out.println("----------");
		System.out.println("���¹�ȣ");
		String ano = scanner.next();
		System.out.println("���ݾ�: ");
		int money = scanner.nextInt();
		
		//����ڰ� �Է��� ���¿� ������ ��ü�� �迭���� ã�ƿ;� �Ѵ�.
		Account account = findAccount(ano); //find��� �޼ҵ带 ȣ���ؼ�. �� �޼ҵ��� �Ű������� ã�����ϴ� ano(a,number��¶�)���� �Ѱ��ָ� �� a�ѹ����� �ش��ϴ� ��ī��Ʈ�� ���ϵǾ�����������.
	
		//ã�Ҵٸ�,
		if(account == null) { // �� ã�Ҵٸ�. //���� ã�� ���ϰ� null�� �����ϴ� ���. . /for������ �迭�� ���̸�ŭ �ݺ��ϴµ� ������ �ݺ��� �ص�. a�ѹ��� ������ account��ü������ ������ ��ü�� �� ã�Ҵٸ� account�� ��� null���·� �����ִ�. null���°� ��� �����־ for���� ��� �����ϰ�, a�ѹ��� ������ �� ã�� ������ ���. null�� ���·� ����.
			System.out.println("���: ���°� �����ϴ�.");//ano�� �ش��ϴ� ���¸� �� ã�Ҵٸ�.
			return; //�޼ҵ� ���� ����
		}
		account.setBalance(account.getBalance() + money); //���� �ܰ��� ���� getbalance�� ���� �� �ְ�,
		System.out.println("���: �Ա��� �����Ǿ����ϴ�.");
	}

	private static Account findAccount(String ano) {//�޼ҵ� �����, ������ ������ ����.
		// TODO Auto-generated method stub
		Account account = null; //account��� �ϴ� ��ü�� ã�ƾ��ϴϱ� account������ �����ϰ�,
		
		for(int i=0; i<accountArray.length; i++) { //��ü �迭�� ���̸�ŭ �ݺ�.
			if(accountArray[i] != null) { // i��ü�� ���ִ� ���� null�� �ƴ� ���
				String dbAno = accountArray[i].getAno(); //����Ǿ��ִ� ��ī��Ʈ�� a�ѹ��� �о��. i�ѹ�°�� �ִ� ano�� �о. getAno()�� �����Ѵ�.
				if(dbAno.equals(ano)) {//dbAno�� ano�� ���ٸ�,
					account = accountArray[i];
					break;
				}
			}
		}
		return account; //��ī��Ʈ�� �����ϴ� ��ü������ �����ϵ���. 
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("------");
		System.out.println("���¸��");
		System.out.println("------");
		//����ڷκ��� �Է¹޴� ������ ������ for�� �ٷ� ����.
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i]; //��ī��Ʈ�� i������� ���
			if(account != null) { // ��ī��Ʈ ��ü�� null�� �ƴ϶��, �׷��ϱ� ������ �Ǿ��ִٸ�.
				 System.out.println("���¹�ȣ:"+account.getAno()); //get�� ������????????????????????
				 System.out.println("������:"+account.getOwner()); //�ʵ尡 private�̶� �ٷ� ������ �� ���� getter�� ���ؼ� private���� ���Ϲ޾Ƽ� ���.
				 System.out.println("�ܰ�:"+account.getBalance());
				 System.out.println();
				// System.out.println(account.toString()); //null�� �Ǿ��ִ� ���������� ���� toString()���� ������ nullPointer�����߻�
				
			}
		}
	}

	//�޼ҵ�
	private static void createAccount() { // ���� createAccount ������ �ڵ������� �޼ҵ尡 ���������. �̰� �޼ҵ���.
		// TODO Auto-generated method stub
		System.out.println("------");
		System.out.println("���»���");
		System.out.println("------");
		System.out.print("���¹�ȣ:");
		String ano = scanner.next(); //����ڰ� �Է��ϸ� scanner�� next(�ڿ� ���� ���� ���ڿ��̱� ������.)��� �޼ҵ�� �Էµ� ���ڸ� ����.
		System.out.print("������:");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ�:");
		int balance = scanner.nextInt();//�Էµ� ���� ���ڴϱ� nextInt��.
		
		Account newAccount = new Account(ano, owner, balance); //�ϳ��� ���°�ü�� ����.
		//�� ��ü�� ��� �����Ұų�. �� ���� ��ī��Ʈ �迭�� ������ �Ѵ�. ����ؾ��� ��.;
		//�迭.�迭�� 0������ �����Ѵ�. �� �迭 Ÿ���� Ŭ����Ÿ���̱� ������ nullŸ������ �� ���ִ�. 		
		//index1�� ��ü�� �����ϸ� null�� �ȴ�.... �׷��� ������ ������ �� null��ġ�� �����ؾ��Ѵ�.
//		3������ �־��ٰ� �ϴ���. � ���¸� �����ϸ� �� ���°� null�� �Ǵϱ�.
//		null��ü�� ã�Ƽ� �����ϵ��� �ϴ� ���� ����. 1���� ����ִµ� 4������ ������
//		������ 99��° �������ʹ� ��ü ������ ����. �׷��� ����ִ� ������ ���� ����� ȿ�����̴�.
//		�׷��� for������.
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {//accountArray�� i��°�� null�ΰ��� �����ϴ�
				//��.����ִ� ���� ����.
				accountArray[i] = newAccount; //����ִ� ���� ������ �Ѵ�.
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break; //������ �ϸ� ������ �����Ŵϱ� for���� ��������.
		}
	}
	}
}

//�����ڵ�.....i++ {} ��ȣ �� ����.