package ch07.a;
//ch07.a.A
//import ch07.b.D;
//import ch07.b.F;
import ch07.b.*; //와일드카드문자사용. * . 패키지 전체를 import할 수 있음.

public class A {
 void method() {
	 D d = new D();
	 F f = new F();
 }
}
