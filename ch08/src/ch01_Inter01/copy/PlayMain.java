package ch01_Inter01.copy;

public class PlayMain {
	//�ʵ�
//	Television tv = new Television();
	
	//����ϴ� ��ü�� ���� ���ٽ� - ������.
	//����ϴ� ��ü ���� tv->audio��. s
	RemoteControl audio = new Audio();
	
	public static void main(String[] args) {
//		PlayMain p = new PlayMain(); 
		
		RemoteControl rc = new Audio();
		//����ϴ� ��ü ���濡 ���� �ҽ� �ڵ� ���.
//		p.tv.turnOn();
//		p.tv.setVolume(5);
//		p.tv.turnOff();
//		
//		p.audio.turnOn();
//		p.audio.setVolume(5);
//		p.audio.turnOff();
//		
		//����ϴ� ��ü�� ������ �Ǿ �ҽ��ڵ庯�� ����.
		p.rc.turnOn();
		p.rc.setVolume(5);
		p.rc.turnOff();
	}

}
