package Ex20T;

public class Stock {
	//필드
	private String item;
	private String name;
	private int qty;
	
	//생성자
	public Stock(String item, String name, int qty) {
		this.item = item;
		this.name = name;
		this.qty = qty;

		//generate getter and setter
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

	}
}
