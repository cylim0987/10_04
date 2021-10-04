package ch04_While;

import java.io.IOException;

public class While4 {
 public static void main(String[] args)  {
	 
	 System.out.println("2~9사이의 숫자를 입력하세요.");
	 //키보드로 숫자 0을 누르면 입력되는 값은? 48 <- ASCII코드값
	 try {
		 int num = System.in.read()-'0'; //스캐너가 나오기 전에 썼던 것. (표준입력 스트림 '0'키를 누른 경우 : 48-48, '1'=>49-48=1))
		 System.out.println("구구단 " + num + "단");
		 int i=1;
		 while(i<=9) {// while블럭{}을 빠져나가는 조건
			 System.out.println(num + " * " + i + " = " + (i*num)); //출력
			 i++; //증가 명령문
		 }
	 } catch (IOException e) {
		 System.out.println("오류발생");
	 }
 }
}