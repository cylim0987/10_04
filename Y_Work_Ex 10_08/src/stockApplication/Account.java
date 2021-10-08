package stockApplication;

import java.text.DecimalFormat;
import java.util.Arrays;

//클래스

public class Account {
	//필드
 static final String bankNo="111";
 static int seq=0;
 private String ano;
 private String owner;
 private int balance;

 {
	seq++;
	DecimalFormat df = new DecimalFormat("000");
	df.format(seq);
	ano = bankNo +"-"+df.format(seq);
 }
 //생성자 //생성자 - 외부에서 값을 받아서 필드에 초기화를 할 수 있도록 생성자를 선언.
public Account(String ano, String owner, int balance) {
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
}
public Account(String owner, int balance) {
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
//Account 정보 출력 메소드
@Override
public String toString() {
	return "Account [계좌번호=" + ano 
			+ ", 계좌주=" + owner 
			+ ", 잔고=" + balance + "]";
}

}