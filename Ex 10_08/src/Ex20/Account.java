package Ex20;

public class Account {
//�ϳ��� ���������� ������ �ִ� ��ī��Ʈ Ŭ������ �����ϵ��� �ʵ带 ����
	
	//�ʵ� - �� ���¿� ���� �����͸� ���� �� �ִ� �ʵ�
	private String ano;
	private String owner;
	private int balance;

	
	//������ - �ܺο��� ���� �޾Ƽ� �ʵ忡 �ʱ�ȭ�� �� �� �ֵ��� �����ڸ� ����.
	public Account(String ano, String owner, int balance) {
		this.ano = ano; //!!!!!!!!!!!!!!this�� ���� ������ �ؾ��Ѵ�
		this.owner = owner;
		this.balance = balance;
	}


	
	//getter setter�� �����. ����� ������ private���� �Ǿ��ֱ� ������ �ܺο��� ������ ���� ����.
	// Source - generator getters and setters
	//�ڵ������� ������.
	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
