package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx04 {

	public static void main(String[] args) {
		// 1."홍길동", 2."일지매", 3."임꺽정" 2, "이순신"
		// 1,2,3이 키 한글이 value
		// 4개의 값을 저장하는 Map을 만들고, 저장 후
		// Map에서 3번 키에 해당하는 객체를 출력해보시오.

		Map<Integer, String> person = new HashMap<>(); // Double이 아니라 Integer
		person.put(1, "홍길동"); //기본타입 int -> Integer로 AutoBoxing
		person.put(2, "일지매");
	//	person.put(new Integer(2), "일지매"); //이렇게 해도 됨.
		person.put(3, "임꺽정");
		person.put(2, "이순신"); //int => Integer

		
		System.out.println(person.size()); //3.
		System.out.println(person.get(3)); //AutoBoxing
		System.out.println(person.get(2)); //AutoBoxing
		
		// 키 존재 여부 확인
		System.out.println(person.containsKey(1)); // true
		//
		System.out.println(person.containsValue("임경업")); // false
		System.out.println(person.containsValue("이순신")); // true

	}

}
