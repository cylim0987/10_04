package cH02_01Class1001_Fri;
//������� ū����
public class Bank {
	//�����ܰ� �ݾ� �ʵ�
	private int balance = 0;
	//�Աݱ��
	public void deposit(int amount) {
		balance = balance += amount;
	}
	//���
	public void withdraw(int amount) {
		//balance = balance - amount;
		if(balance-amount>=0)
			balance -=amount;
	}
	//�ܰ� ���
	public void currentBalance() {
		System.out.println("�ܰ�:" + balance);
	}
	
}
