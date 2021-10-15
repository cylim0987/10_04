package ch10;

public class RobotEX {

	public static void main(String[] args) {
		Robot[] r = { new DanceRobot(),
					new SingRobot(),
					new DrawRobot() };
		for(Robot robot:r) {
			action(robot);
		}
	
	}
	//매개변수의 다형성. 인터페이스에서 구현...
	static void action(Robot rt) {// main에서 쓰기 위해 static
		if (rt instanceof DanceRobot) 
			((DanceRobot) rt).dance();
		else if (rt instanceof SingRobot)
			((SingRobot) rt).sing();
		else {
			DrawRobot d = (DrawRobot) rt;
			d.Draw();
		}
	}
}
