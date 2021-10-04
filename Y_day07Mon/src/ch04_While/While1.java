package ch04_While;

public class While1 {
 public static void main(String[] args) {
	 
	 int i=0;
	 //while(조건){실행문;} //{}내에 증감 처리.
	 while(i<10) {
		 System.out.println("Hello !!");
		 System.out.println(i);
		 i++; //while문은 조건이 false가 될 수 있도록 하는 명령문이 블럭내에 추가되어야함.
	 }
 }
	//for문은 조건 값을 안에 입력...? while문은 조건이 하나밖에 없음.
}
