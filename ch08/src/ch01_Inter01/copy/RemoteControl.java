package ch01_Inter01.copy;

public interface RemoteControl implements  {

	//상수
	
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	void turnOn();

	void turnOff();

	void setVolume(int volume);

}

//우클릭 리펙터 = Extract interface. 전부 셀렉.