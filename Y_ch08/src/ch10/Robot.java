package ch10;

public interface Robot {

}

class DanceRobot implements Robot{
	void dance() {
		System.out.println("���� ���");
	}
}
class SingRobot implements Robot{
	void sing() {
		System.out.println("�뷡�� �θ���");
	}
}
class DrawRobot implements Robot{
	void Draw() {
		System.out.println("�׸��� �׸���");
	}
}