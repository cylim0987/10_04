package cH02_01Class1001_Fri;

public class UserBank {
	public static void main(String[] args) {
		//Bank��ü ����
		Bank bank = new Bank();
		//System.out.println("�ܰ�: " + bank.balance);
		//bank.balance=10000;
		//bank.balance=bank.balance-5000; //�̷��� �ϸ� ��.�ȴ�
		
		//�Աݱ�� ȣ��
		bank.deposit(10000);

		//��ݱ�� ȣ��
		bank.withdraw(8000);
	
		//�ܰ� ���
		bank.currentBalance();
		
	}

}
