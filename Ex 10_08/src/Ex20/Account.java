package Ex20;

public class Account {
//하나의 계좌정보를 가지고 있는 어카운트 클래스를 생성하도록 필드를 선언
	
	//필드 - 한 계좌에 대한 데이터를 담을 수 있는 필드
	private String ano;
	private String owner;
	private int balance;

	
	//생성자 - 외부에서 값을 받아서 필드에 초기화를 할 수 있도록 생성자를 선언.
	public Account(String ano, String owner, int balance) {
		this.ano = ano; //!!!!!!!!!!!!!!this에 대한 설명을 해야한다
		this.owner = owner;
		this.balance = balance;
	}


	
	//getter setter를 만든다. 만드는 이유는 private으로 되어있기 때문에 외부에서 접근할 수가 없다.
	// Source - generator getters and setters
	//자동적으로 생성된.
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
