package ch01;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); // Point객체 생성
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); //상속받은 메소드에 접근
		cp.setColor("red"); //자식클래스에서 추가된 메소드
		cp.showColorPoint(); //자식클래스에서 추가된 메소드에서 부모클래스의 메소드 호출을 통한 private필드 접근.
	}

}

class Point{
	private int x, y; //한점을구성하는 x,y좌표 //private이라서 상속 안됨. 자식 클래스에서 접근할 수 없음.
	public void set(int x, int y) {//상속
		this.x = x; this.y = y;
	}
	public void showPoint() {// 점의 좌표 출력 // 상속
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{
	//추가된 필드
	private String color; // 점의 색
	//추가된 메소드
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint();//showPoint라는 메소드 // Point 클래스의 showPoint() 호출 
	}
}



