package ch10;

public interface Robot {

}

class DanceRobot implements Robot{
	void dance() {
		System.out.println("춤을 춘다");
	}
}
class SingRobot implements Robot{
	void sing() {
		System.out.println("노래를 부른다");
	}
}
class DrawRobot implements Robot{
	void Draw() {
		System.out.println("그림을 그린다");
	}
}