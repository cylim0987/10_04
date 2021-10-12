package ch08_;

public class Car2 {
	// 필드
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) { // speed는 0이 되면 안됨. 때문에
		if (speed < 0) {
			this.speed = speed;
			return;
		} else {
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
