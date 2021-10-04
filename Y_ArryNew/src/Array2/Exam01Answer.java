package Array2;


public class Exam01Answer {
	public static void main(String[] args) {
		// 교수님 설명 버전

		int a = 10;
		int b = 10;
		System.out.println(a == b ? "정수타입 변수a와 정수타입 변수 b의 값이 같습니다" : "정수타입 변수 a와 정수타입 b의 값이 다르다");
		System.out.println(a != b ? "정수타입 변수a와 정수타입 변수 b의 값이 다르다" : "정수타입 변수 a와 정수타입 b의 값이 같다");

		/// 참조타입 값 비교 //객체를 하나 만들떄마다 new에서 객체를 만들게 되는데, str1객체, str2객체가 만들어졌음. 둘은 서로 다른 객체다.
		// hello라는 내용은 같다. 
		String str1 = new String("hello");
		String str2 = new String("hello"); //내용 비교는 equal연산자.//// == 이거는 주소가 같은지보는 것. 
		
		System.out.println(str1 == str2 ? "str1이 참조하는 주소와 str2가 참조하는 주소가 같습니다" 
									: "str1이 참조하는 주소와 str2가 참조하는 주소가 다릅니다."); //콘솔 : str1이 참조하는 주소와 str2가 참조하는 주소가 다릅니다.로 뜬다. 뭐가 문제인가?
		System.out.println(str1.equals(str2) ? "str1의 내용과 str2의 내용이 논리적으로 동등합니다."
									: "str1의 내용과 str2의 내용이 논리적으로 동등하지 않습니다."); //str1의 내용과 str2의 내용이 논리적으로 동등합니다.

		

	}
}

/*
 * // TODO Auto-generated method stub //1. id="hong", pwd="1234" // id와 pwd를
 * scanner로 입력받아서 id와 pwd가 둘다 같으면 "login성공", // 아니면 "1회 실패하였습니다". 출력 // 5회 실패하면,
 * "5회 실패하였습니다. 프로그램을 종료 합니다" 출력 후 종료 Scanner scanner = new Scanner(System.in);
 * int cnt=0; while(true) { String id,pwd; if(cnt==5) {//기본데이타 타입의 값 비교
 * System.out.println(cnt+"회 실패하였습니다. 프로그램을 종료 합니다"); break; }
 * System.out.println("아이디와 패스워드를 입력하세요."); System.out.println("아이디>");
 * id=scanner.next(); System.out.println("패스워드>"); pwd=scanner.next();
 * if("hong".equals(id) && "1234".equals(pwd))//참조객체의 비교 와 논리곱연산 {"로그인 성공";
 * break;} //실패시 System.out.println(cnt++ +"회 실패하였습니다."); }
 * System.out.println("프로그램 종료"); } }
 * 
 */