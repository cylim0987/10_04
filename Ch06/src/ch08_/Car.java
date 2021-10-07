package ch08_;

public class Car {

	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	//메소드
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed; //명시적으로 표시(?)
	}
	
	public boolean isStop() { //boolean타입은 is로 써주는 것이 관례.
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		
	}
	
	
	
}
