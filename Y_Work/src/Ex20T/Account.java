package Ex20T;

import java.text.DecimalFormat;
import java.util.Arrays;

//適掘什

public class Account {ししししししししし
	//琶球
static final String bankNo="111";
static int seq=0;
private String ano;
private String owner;
private int balance;

{
//
//	DecimalFormat df = new DecimalFormat("000");
//	df.format(seq);
//	ano = bankNo + "-" + df.format(seq);

//	String str = String.format("%03d%n", seq);
//	item = 
//
	seq++;
	ano = bankNo +"-"+seq+seq+seq;

	
			
			
}
//持失切
public Account(String ano, String owner, int balance) {
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
}
public Account(String owner, int balance) {
	this.owner = owner;
	this.balance = balance;
}

//持失切
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
//Account 舛左 窒径 五社球
@Override
public String toString() {
	return "Account [域疎腰硲=" + ano 
			+ ", 域疎爽=" + owner 
			+ ", 接壱=" + balance + "]";
}

}
