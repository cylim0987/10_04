package ch03;

public class IdentifierExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
//		String @myName = "홍길동"; - 특수문자 @로 시작
//		int #no = 27; -#으로 시작
//		int !age = 30; - ! 사용

		// 특수문자 사용은 $ _ 만 가능하다.
		String _name = "ㅇ"; // 정상... 변수형 - 참조타입(String)
		int $mony = 1000; // $변수형 - 기본타입(int)

//		int 1stJob = 1; //숫자로 시작하는 변수형
		int joblst = 1;
//		int my count = 10; // - my와 count사이에 공백
//		int your	turn = 2; // - your와 turn사이에 tab만큼의 공백이 있으면 안됨

		// 길이 제한 없음
		// 변수형은 소문자로 시작
		// 단어와 단어가 합쳐진 경우 뒤에. 첫글자는 대문자로.
		// 카멜(낙타) 표기법
		String myCountryNameAndCityName = "ㄷㅎㅁㄱ";

		// 변수 선언
		// 타입 변수형(식별자) = 값 ;
		// int true = "참"; // true, false는 식별자로 쓸 수 없다.
		// boolean false = "거짓";

		// String null = "아무것도 없다"; // null도 식별자로 사용 불가.
		// 변수(식별자)는 대소문자를 구분함 Test와 test는 전혀 다른 변수다.
		int Test = 10;
		int test = 20;

		/*
		 * // 아스키 코드 봐보기 
		 * 컴퓨터   // 십진수변환 값
		 * 1100110 // f 102
		 * 1101111 // o 111
		 * 1110010 // r 114
		 * 
		 * 1000110 //F 70
		 * 1001111 //O 79
		 * 1010010 //R 82
		 */

	}

}
