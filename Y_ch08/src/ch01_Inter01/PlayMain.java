package ch01_Inter01;

public class PlayMain {
	//�ʵ�
//	Television tv = new Television();
	
	//����ϴ� ��ü�� ���� ���ٽ� - ������.
	//����ϴ� ��ü ���� tv->audio��. 
	Audio audio = new Audio();
	
	public static void main(String[] args) {
		PlayMain p = new PlayMain(); 
		//����ϴ� ��ü ���濡 ���� �ҽ� �ڵ� ���.
//		p.tv.turnOn();
//		p.tv.setVolume(5);
//		p.tv.turnOff();
		
		p.audio.turnOn();
		p.audio.setVolume(5);
		p.audio.turnOff();
		
	}

}
