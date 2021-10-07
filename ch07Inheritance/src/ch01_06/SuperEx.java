package ch01_06;

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}

class Point {
	private int x, y; // �����������ϴ� x,y��ǥ //private�̶� ��� �ȵ�. �ڽ� Ŭ�������� ������ �� ����.

	public void set(int x, int y) {// ���
		this.x = x;
		this.y = y;
	}

	public void showPoint() {// ���� ��ǥ ��� // ���
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	// �߰��� �ʵ�
	private String color; // ���� ��
	// �߰��� �޼ҵ�

	public ColorPoint(int x, int y, String color) {
		//super(x, y); //Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}

	public void showColorPoint() { // �÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint();// showPoint��� �޼ҵ� // Point Ŭ������ showPoint() ȣ��
	}
}
