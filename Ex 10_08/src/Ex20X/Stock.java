package Ex20X;

import java.util.Arrays;


//하나의 창고정보를 가지고 있는 stock클래스를 생성하도록 필드를 선언.
public class Stock {
	//필드 //창고에 대한 데이터를 담을 수 있는 필드 생성
	static final String itemNo = "111"; 
	static int seq = 0;
	private String item; // 아이템 번호. 111-(001), 111-(002)
	private String name; // 새우깡, 고구마깡
	private int qty;	 // 100, 200 (재고량)

	{
		seq++;
		String str = String.format("%03d%n", seq);
		item = itemNo + "-" + str;
		
		/*Stock 클래스에서
		String str = String.format("%03d%n",  seq);
		"%03d%n"의 의미
		   % : 명령의 시작
		   0 : 채워질 문자
		   3 : 총 자리수
		   d : 십진정수
		   %n : 줄바꿈 문자를 의미 (없어도 정상 작동)

		정수타입인 seq를 포맷 규칙에 맞게 String타입으로 변환 후
		 str변수에 참조
		-> 상품번호가 001~ 로 시작하는 이유
		
		*/
		
		

	}
	//생성자 //생성자 - 외부에서 값을 받아서 필드에 초기화를 할 수 있도록 생성자를 선언.
	public Stock(String name, int qty) {
		this.name = name;//!!!!!!!!!!!!!!this에 대한 설명을 해야한다
		this.qty = qty;
	}
	
	
	
	//getter setter를 만든다. 만드는 이유는 private으로 되어있기 때문에
	//외부에서 접근할 수가 없다.
	// Source - generator getters and setters
	// setter 매개값을 검증해서 유효한 값만 데이터로 저장.
	// getter 메소드로 필드값을 가공한 후 외부로 전달

	//자동적으로 생성된.
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

//Stock 정보 출력 메소드

	@Override

	public String toString() {

		return "Stock [상품번호=" + item

				+ ", 상품명=" + name

				+ ", 재고=" + qty + "]";

	} //안하면 이렇게 뜬다? Ex20X.Stock@7d4991ad

}