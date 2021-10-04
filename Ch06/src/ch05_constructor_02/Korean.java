package ch05_constructor_02;

//멤버 - 필드, 생성자, 메소드
public class Korean { //코리안 클래스
	// 필드
	String name; //이름
	String sno; // 주민번호
	//생성자 - 
	// default 생성자가 아닌 매개변수 2개짜리 생성자 선언 (irum, jumin)
	public Korean(String irum, String jumin)	{
		name = irum;
		sno = jumin;
	}
}

/*
컴파일 수
public class Korean { //코리안 클래스
	// 필드
	String name; //이름
	String sno; // 주민번호
	//생성자 -
	  없음. public class Korean(){}
	 



*/