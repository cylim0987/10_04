package ch02_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	public static void main(String[] args) {
		// List 인터페이스 타입의 변수선언 = ArrayList 객체 생성
		List<String> list = new LinkedList<>();

		// 객체 추가 메소드 add(객체);
		list.add("Hello");
		list.add("hi");
		list.add("Java");

		// 객체의 개수 확인 size()
		int n = list.size();
		// int c = list.capacity(); - 없음 메소드가. 리스트에 없고 벡터에 있다.
		System.out.println(n);

		// 중간 삽입 add(index, 객체)
		list.add(2, "Shani");
		// list.add(5, "Shani"); // 총 사이즈보다 크기 때문에 오류가 발생한다.
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5,
		// Size: 4

		// 객체 저장여부 확인 contains(객체)
		System.out.println(list.contains("Java") ? "Java문장이 있습니다" : "Java문장이 없습니다.");

		// 저장된 객체 얻기 get(index)
		String str = list.get(1);
		System.out.println(str); // hi . hi는 1번째. 0,1,2

		//
		Object[] strArr = list.toArray();
		for (Object s : strArr)
			System.out.println(s + "EEEE");
		System.out.println();

		// 삭제 remove(index번호)
		list.remove(1);

		// list.remove(4); // 총 사이즈보다 크기 때문에 오류 발생
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4,
		// Size: 3

		// 모두 삭제
		list.clear();

		System.out.println(list.isEmpty() ? "리스트가 비어있습니다. " : "리스트가 비어있지 않습니다."); // 리스트가 비어있습니다.

	}

}
