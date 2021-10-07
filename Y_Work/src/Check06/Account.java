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

public class Account {
	//�����
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	//�ʵ�
	private int balance;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<Account.MIN_BALANCE
			||balance>Account.MAX_BALANCE){ 
			return;
		}
		this.balance = balance;
	}
	
	
	
	
	
}