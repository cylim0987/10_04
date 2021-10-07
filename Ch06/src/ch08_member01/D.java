package ch08_member01;
import ch08_member01.B4;

//B4와 D는 상속관계에 있으므로 D는
//부모클래스의 멤버에 접근가능.
public class D extends B4{
	//int n;
	//void g();
	void f() {
		n=3;
		g();
	}

}
