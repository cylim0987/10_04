package ch11;

class SeperateVolume implements Lendable{
	String requestNo; String title; String writer;
	int state; String name ="", date = "";
	
	public SeperateVolume(String requestNo, String title, String writer) {
		super();
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}

	@Override
	public void checkOut(String name, String date) {
		if(state == BORROWED) return; //책을 빌려가 반납하지 않은 상태.
		this.name = name;
		this.date = date;
		state = BORROWED; //대출상태 변경
		System.out.println(title + "을" + name + "이/가 대출했습니다.");
		System.out.println("대출일자 : " + date);
	}

	@Override
	public void checkIn() {
		name = "";
		date = "";
		state = NORMAL;
		System.out.println(title + "을 반납했습니다.");
	}
	
}
