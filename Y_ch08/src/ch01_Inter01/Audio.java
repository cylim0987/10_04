package ch01_Inter01;

public class Audio {
//필드
	private int volume;
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	public void turnOn() {
		System.out.println("Audio 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio 전원을 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			volume = MAX_VOLUME;
		}else if(volume>MIN_VOLUME) {
			volume = MIN_VOLUME;
		}	
			System.out.println("현재 Audio 볼륨");
	}
	
}

	