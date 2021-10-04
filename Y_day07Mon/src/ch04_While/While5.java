package ch04_While;

public class While5 {
 public static void main(String[] args)  {

	 int i=1, j=2; //초기값 설정
	 
	 System.out.println("구구단");
	 while(i<=9) {
		 while(j<=9) {// for(int j=2; j<=9; j++) {}
			 System.out.printf("%d * %d = %d \t", i, j, (i*j)); //digit
			 j++;
		 }
		 j=2; // j값 재 초기화, vs for문은 블럭을 시작할때마다 초기화되지만, while문은 초기화를 별도로
		 i++; // 증감 처리
		 System.out.println();
	 }
 }
}

// for문은 비교조건 증감조건이 하나에 다 들어있다..
// while문은 초기화 조건, 증감 부분을 따로 추가적으로 해줘야한다.



