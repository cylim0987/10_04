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
		if(state == BORROWED) return; //å�� ������ �ݳ����� ���� ����.
		this.name = name;
		this.date = date;
		state = BORROWED; //������� ����
		System.out.println(title + "��" + name + "��/�� �����߽��ϴ�.");
		System.out.println("�������� : " + date);
	}

	@Override
	public void checkIn() {
		name = "";
		date = "";
		state = NORMAL;
		System.out.println(title + "�� �ݳ��߽��ϴ�.");
	}
	
}