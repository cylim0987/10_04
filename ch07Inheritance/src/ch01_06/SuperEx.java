package ch01_06;

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();
	}

}

class Point {
	private int x, y; // 한점을구성하는 x,y좌표 //private이라서 상속 안됨. 자식 클래스에서 접근할 수 없음.

	public void set(int x, int y) {// 상속
		this.x = x;
		this.y = y;
	}

	public void showPoint() {// 점의 좌표 출력 // 상속
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	// 추가된 필드
	private String color; // 점의 색
	// 추가된 메소드

	public ColorPoint(int x, int y, String color) {
		//super(x, y); //Point의 생성자 Point(x, y) 호출
		this.color = color;
	}

	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();// showPoint라는 메소드 // Point 클래스의 showPoint() 호출
	}
}
