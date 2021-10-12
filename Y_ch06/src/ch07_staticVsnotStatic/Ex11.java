package ch07_staticVsnotStatic;

public class Ex11 {

	public static void main(String[] args) {

		Bank bnk = Bank.getBank();
		System.out.println("�ŷ�����: " + bnk.name);
		Bank bnk2 = Bank.getBank();
		System.out.println("�ŷ�����: " + bnk.name);
		
	}

	
}
//CalendarŬ������ ��üó�� �� �ý��ۿ� �ϳ��� ��ü�� �����Ͽ�
//����ؾ��ϴ� ��� ����ϴ� Ŭ���� ���� ��� - �̱���

class Bank{
	String name;
	//static ��� - private
	//�ܺο��� ������ �� ������ ĸ��ȭ
	//Ŭ���� �ε�� BankŬ������ ��ü�� �ʱ�ȭ
	private static Bank b = new Bank("�ϳ�����");
	//private - �ܺο��� ���� �� �� ������ ĸ��ȭ - new Bank()�� �ܺο��� ���� �Ұ�
	//private
	private Bank(String n) {
		name = n;
	}
	
	//static���
	//�ܺο��� ���� ������ �޼ҵ�. (static)
	static Bank getBank() {
		return b;
	}
	
}



