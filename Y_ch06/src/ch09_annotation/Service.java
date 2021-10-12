package ch09_annotation;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행내용1");
	}
	@PrintAnnotation
	public void method2("*") {//"-" -> "*"
		System.out.println("실행내용2");
	}
	
	// "-" -> "#", number 15 -> 20
	@PrintAnnotation(value="#", number=20)
	public void method3(){
		System.out.println("실행내용3");
	}
	
}
//어노테이션 : 1. 문법체크 2.자동생성. 3뭐?