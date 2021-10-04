package ch02Class0930Thu_2;

public class UseCalcExam {

	public static void main(String[] args) {
		//객체 생성 (Calculator를 쓰기 위해 Calculator객체를 생성해야 한다)
		Calculator cal = new Calculator();
		cal.getCalc("+", 10, 20); // 콘솔:30.0 // Sysou를 안써도 된다.
	System.out.println(cal.model); // 콘솔 : 00001
	System.out.println(cal.result); // 콘솔 : 30.0
	
	//Cal에서 result를 private로 선언하면 여기서 접근 불가하다.
	int res = cal.sub(10,20);
	
	cal.result = cal.sub(10,20);
	System.out.println(cal.result); // 콘솔 : -10.0
	
	//외부에서 수정 불가
	//cal.model = "99999"; //Calculator에서 final 선언 때문에 오류남.
	System.out.println(cal.model); // 콘솔 : 99999
	
	
	}

}
