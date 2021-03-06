package ch02;

public class Inter2Main {
	public static void main(String[] args) {
		
		//실체클래스 객체를 생성하여 자손 인터페이스에 대입(promotion)
		H4 h4 = new H5();
		//다형성
		h4.h1();
		h4.h2();
		h4.h3();
		h4.h4();
		
	}
}

//부모인터페이스
interface H1{void h1();}
//자식인터페이스
interface H2 extends H1{void h2();}//추가된 메소드
//자식인터페이스
interface H3{void h3();}//추가된 메소드
//자손인터페이스 - 다중상속된 결과 부모클래스로부터 누적된 추상메소드를 모두 누적하여 가지고 있다.
interface H4 extends H2, H3{void h4();}//추가된 메소드

//실체클래스
class H5 implements H4{

public void h2() {//재정의
	
}
//override
public void h1() {
	System.out.println("h1 메소드다");
}
public void h3() {
	System.out.println("사건");
}
public void h4() {
	System.out.println("aa");
}
}