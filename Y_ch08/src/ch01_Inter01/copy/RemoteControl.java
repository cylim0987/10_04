package ch01_Inter01.copy;

public interface RemoteControl implements  {

	//���
	
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	void turnOn();

	void turnOff();

	void setVolume(int volume);

}

//��Ŭ�� ������ = Extract interface. ���� ����.