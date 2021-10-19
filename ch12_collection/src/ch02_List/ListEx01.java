package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// String타입 객체를 저장하는 리스트 생성
		List<String> list = new ArrayList<>();// default 10
		// size() 저장된 요소의 개수
		System.out.println(list.size());
		// 추가
		list.add("hello");// [0]
		list.add("hi");// [1]
		list.add("bye");// [2]
		System.out.println(list.size());

		// 삽입 add(index번호, 객체)
		list.add(1, "good");// ["hello"] ["good"] ["hi"] ["bye"]
		System.out.println(list.size());// 0 3 4

		// get(index번호) list에서 가져오기
		for (int i = 0; i < list.size(); i++) { // 배열에서는 length였는데 여기서는 size
			System.out.print(list.get(i) + " "); // hello good hi bye
		}

		System.out.println();

		// list에 해당 객체가 들어있는지 확인 contains()
		System.out.println(list.contains("hello")); // true. 괄호 안의 말이 들어있느냐.
		// 수정
		list.set(1, "very good");

		for (int i = 0; i < list.size(); i++) { // 배열에서는 length였는데 여기서는 size
			System.out.print(list.get(i) + " "); // hello good hi bye
		}
		System.out.println();

		//저장된 요소 삭제 remove(index) 리턴값은 삭제된 객체
		String s = list.remove(1);
		System.out.println(s + "가 삭제됨");

		//저장된 요소를 삭제 remove(객체) 리턴값은 boolean타입.
		boolean result = list.remove("hi");
		System.out.println(result);// true
		System.out.println(list.size());// 2

		//모두 삭제 clear()
		list.clear();
		System.out.println(list.size());// 0
		//요소가 하나도 없는지 확인 isEmpty();
		System.out.println(list.isEmpty());// true
	}

}
