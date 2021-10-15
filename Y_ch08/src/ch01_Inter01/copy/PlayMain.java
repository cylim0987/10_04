package ch01_Inter01.copy;

public class PlayMain {
	//필드
//	Television tv = new Television();
	
	//사용하는 객체에 직접 접근시 - 종속적.
	//사용하는 객체 변경 tv->audio로. s
	RemoteControl audio = new Audio();
	
	public static void main(String[] args) {
//		PlayMain p = new PlayMain(); 
		
		RemoteControl rc = new Audio();
		//사용하는 객체 변경에 따라 소스 코드 면경.
//		p.tv.turnOn();
//		p.tv.setVolume(5);
//		p.tv.turnOff();
//		
//		p.audio.turnOn();
//		p.audio.setVolume(5);
//		p.audio.turnOff();
//		
		//사용하는 객체의 변경이 되어도 소스코드변경 없음.
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
	}

}
