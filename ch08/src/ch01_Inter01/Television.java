package ch01_Inter01;

public class Television {
//�ʵ�
	private int volume;
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	public void turnOn() {
		System.out.println("TV ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV ������ ���ϴ�.");
	}
	
	public void setVolume(int volume) { 
		System.out.println("���� TV ����");
	}
	
}

	