package ch08_;

public class Car {

	//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed; //��������� ǥ��(?)
	}
	
	public boolean isStop() { //booleanŸ���� is�� ���ִ� ���� ����.
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		
	}
	
	
	
}
