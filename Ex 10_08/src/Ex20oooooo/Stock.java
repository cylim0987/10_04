package Ex20oooooo;


import java.util.Arrays;



//Ŭ����



public class Stock {

	//�ʵ�

static final String itemNo="111";

static int seq=0;

private String item;

private String name;

private int qty;



{

	seq++;

	String str = String.format("%03d%n",  seq);

	item = itemNo +"-"+str;

}

//������

public Stock(String name, int qty) {

	this.name = name;

	this.qty = qty;

}



public String getItem() {

	return item;

}



public void setItem(String item) {

	this.item = item;

}



public String getName() {

	return name;

}



public void setName(String name) {

	this.name = name;

}



public int getQty() {

	return qty;

}



public void setQty(int qty) {

	this.qty = qty;

}



//Stock ���� ��� �޼ҵ�

@Override

public String toString() {

	return "Stock [��ǰ��ȣ=" + item 

			+ ", ��ǰ��=" + name 

			+ ", ���=" + qty + "]";

}



}