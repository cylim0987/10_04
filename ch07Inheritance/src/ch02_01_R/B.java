package ch02_01_R;
//서로 다른 패키지에서. . R에서 Q패키지에 있는 A클래스를 상속하고 싶으면 클래스에서 브라우저 검색 A . Q선택
import ch02_01_Q.A;

public class B extends A {
	void method() {
		pub=1; //public
		pro=1; //protected
	//	def=1; //default .이 둘은 못함 다른패키지라서. - 다른 패키지에 있는 부모클래스의 default접근지정자 필드에 접근불가
	//	pri=1; //private .이 둘은 못함 다른패키지라서. - 부모클래스의 private접근지정자 필드 접근불가
}
