package ch08_;

public class Car2 {
	// �ʵ�
	private int speed;
	private boolean stop;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) { // speed�� 0�� �Ǹ� �ȵ�. ������
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