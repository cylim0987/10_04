package ch01_Inter01;

public class Television {
//필드
	private int volume;
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}
	
	public void setVolume(int volume) { 
		System.out.println("현재 TV 볼륨");
	}
	
}

	