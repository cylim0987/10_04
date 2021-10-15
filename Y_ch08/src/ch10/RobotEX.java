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
	//�Ű������� ������. �������̽����� ����...
	static void action(Robot rt) {// main���� ���� ���� static
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