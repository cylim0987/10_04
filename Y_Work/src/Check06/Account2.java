/* 19. ���� ���� ��ü�� Account ��ü�� �ܰ�(balance) 
 * �ʵ带 ������ �ֽ��ϴ�. balance �ʵ�� �������� �� �� ����,
 *  �ִ� �鸸 �������� ������ �� �ֽ��ϴ�. �ܺο��� balance �ʵ带 �������
�������� ���ϵ��� �ϰ�, 0 <= balance <= 1,000,000 ������ ����
 ���� �� �ֵ��� Account Ŭ��
���� �ۼ��غ�����.
�� Setter�� Getter�� �̿��ϼ���.
�� 0�� 1,000,000�� MIN_BALANCE�� MAX BALANCE
 ����� �����ؼ� �̿��ϼ���.
�� Setter�� �Ű����� �����̰ų� �鸸 ���� �ʰ��ϸ�
 ���� balance ���� �����ϼ���. */

package Check06;

public class Account2 {
	public static void main(String[] args) {
		Account2 account = new Account2();
		
		account.setBalance(10000);
			System.out.println(account.getBalance());
		account.setBalance(-100);
			System.out.println(account.getBalance());
		account.setBalance(2000000);
			System.out.println(account.getBalance());
		account.setBalance(300000);
			System.out.println(account.getBalance());
	}
		
	//�ʵ�
	private int balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(this.balance-balance<MIN_BALANCE||this.balance+balance>MAX_BALANCE)
			return; // this.balance - + �̿��ؼ� �� ���� �ִ�.
		//if(balance>=MIN_BALANCE && balance=<MAX_BALANCE)
		
		this.balance = balance;
		}
	}
	
	
	
	
	

