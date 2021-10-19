package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
	public static void main(String[] args) {
		//"apple" - "사과", "pear" - "배", "peach" - "복숭아",
		//"puppy" - "강아지", "cow" - "소" , "zebra" - "얼룩말", "chicken" - "닭"
		//맵에 저장 후
		// scanner로 영문을 입력받아서 해당하는 한글을 출력
		// map에 키가 없으면 다시 입력하도록 ........return?
		// 끝낼 때는 "end"가 입력되면 종료;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Map<String, String> member = new HashMap<>();
		member.put("apple", "사과");
		member.put("pear", "배");
		member.put("peach", "복숭아");
		member.put("puppy", "강아지");
		member.put("cow", "소");
		member.put("zebra", "얼룩말");
		member.put("chicken", "닭");
		
		System.out.println(member.size());
		System.out.println(member.get("peach")); //index가 아니다. 키로 받아야 한다.
		
		System.out.println(member.containsKey("zebra"));
		
		
		
	while(true) {	
		//조회할 단어
		System.out.println("조회할 영단어를 입력하시오>");
		String key = scanner.next();
		if(!key.equals("end")) {
		if(member.containsKey(key)) {
			System.out.println(member.get(key));
		}else {
			System.out.println("해당하는 단어가 없습니다.");
		}
		}else 
			break;
	}	
		
		System.out.println("프로그램 종료");
	}

}
/*
 * package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		// Map인터페이스 선언
		Map<String, String> fruits = new HashMap<String, String>();

		// put(key, value);
		fruits.put("apple", "사과"); // key = "apple", value = "사과"

		// get(key)의 리턴 값 value
		String value = fruits.get("apple");
		System.out.println(value); // value인 "사과"출력

	} ----------------참고-------------------------

}

 */





/*
key, value
apple, 사과
key를 입력해서 출력은 value

*/