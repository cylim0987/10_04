package Ex20X;

import java.util.Arrays;


//�ϳ��� â�������� ������ �ִ� stockŬ������ �����ϵ��� �ʵ带 ����.
public class Stock {
	//�ʵ� //â�� ���� �����͸� ���� �� �ִ� �ʵ� ����
	static final String itemNo = "111"; 
	static int seq = 0;
	private String item; // ������ ��ȣ. 111-(001), 111-(002)
	private String name; // �����, ������
	private int qty;	 // 100, 200 (���)

	{
		seq++;
		String str = String.format("%03d%n", seq);
		item = itemNo + "-" + str;
		
		/*Stock Ŭ��������
		String str = String.format("%03d%n",  seq);
		"%03d%n"�� �ǹ�
		   % : ����� ����
		   0 : ä���� ����
		   3 : �� �ڸ���
		   d : ��������
		   %n : �ٹٲ� ���ڸ� �ǹ� (��� ���� �۵�)

		����Ÿ���� seq�� ���� ��Ģ�� �°� StringŸ������ ��ȯ ��
		 str������ ����
		-> ��ǰ��ȣ�� 001~ �� �����ϴ� ����
		
		*/
		
		

	}
	//������ //������ - �ܺο��� ���� �޾Ƽ� �ʵ忡 �ʱ�ȭ�� �� �� �ֵ��� �����ڸ� ����.
	public Stock(String name, int qty) {
		this.name = name;//!!!!!!!!!!!!!!this�� ���� ������ �ؾ��Ѵ�
		this.qty = qty;
	}
	
	
	
	//getter setter�� �����. ����� ������ private���� �Ǿ��ֱ� ������
	//�ܺο��� ������ ���� ����.
	// Source - generator getters and setters
	// setter �Ű����� �����ؼ� ��ȿ�� ���� �����ͷ� ����.
	// getter �޼ҵ�� �ʵ尪�� ������ �� �ܺη� ����

	//�ڵ������� ������.
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

	} //���ϸ� �̷��� ���? Ex20X.Stock@7d4991ad

}