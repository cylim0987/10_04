package ch02Class0930Thu_2;

//public 키워드는 외부에서 접근가능한 접근 제어자임.
public class Calculator {
	// model명은 수정되면 안됨.
	public final String model = "00001"; //파이널 선언하면 Use 99999에서 오류가 난다!
	// result값은 getCalc에 의해서 처리된 값만 받음. 외부에서 접근{불가?} . 객체를 받아서 쓴다는 것은 로직들을 묶어서 모듈화 한다는 것. 부품...
	private double result = 0;

	// 같은 클래스내의 메소드들끼리는 상호 호출 가능.
	public void getCalc(String op, int x, int y) {
		switch (op) {
		case "+":
			result = add(x, y);
			System.out.println(result);
			break;
		case "-":
			result = sub(x, y);
			System.out.println(result);
			break;
		case "x":
			result = mul(x, y);
			System.out.println(result);
			break;// ????? *이게 아니라? 아. 표시되는거니까.
		case "/":
			result = div(x, y);
			System.out.println(result);
			break;
		}
	}

	// 아래의 메소드들은 getCalc()메소드만 호출가능. - 외부에서 호출불가.
	public int add(int x, int y) {
		return x + y;
	}

	private int sub(int x, int y) { //private, public. | 접근불가, 접근 가능\\ 이것이 바로 캡슐화. 객체 지향의 특징.
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public double div(int x, int y) {
		return x / (double) y;
	}
}
