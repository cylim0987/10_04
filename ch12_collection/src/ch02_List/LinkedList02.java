package ch02_List;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {

	public static void main(String[] args) {
		// 1.String객체를 담는 Linkded List만들고
		// 2."홍길동", "일지매", "임꺽정"을 저장 후 저장된 개수를 리턴하도록 작성 //3
		// 3."이순신"이 들어있는지 확인 //이순신 문장이 없습니다.
		// 3.5 모든 객체를 출력
		// 4.index번호 2번에 해당하는 객체를 "유관순"으로 변경하시오. //유관순
		// 5.index번호 3번에 해당하는 객체를 출력하시오
		// 6.리스트 내의 모든 객체를 삭제 후
		// 7.리스트가 비어있는지 확인 메세지를 출력.

		// List 인터페이스 타입의 변수선언 = Array
		List<String> list = new LinkedList<>();

		// 객체 추가 메소드add(객체);
		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");

		int n = list.size();
		System.out.println(n);

		for (String s : list)
			System.out.println(s);// 전체 출력.
		System.out.println("---------------------------------------");

		System.out.println(list.contains("이순신") ? "이순신이 문장에 있습니다." : "이순신 문장에 없습니다."); // 3번.

		list.add(2, "유관순");
		String str = list.get(3);
		System.out.println(str);

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));// 전체 출력
		for (String s : list) // s <- 반복자
			System.out.println(s);// 전체 출력.

		// 10.
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println("----------");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		// index번호 2번에 해당하는 객체를"유관순"으로 변경
		list.set(2, "유관순");

		System.out.println("---------------");

		System.out.println(list.get(2));

		// // 교체가 되는가? //replace 메소드는 없다. 다른 방법으로.? set메소드. set으로 바꾼다.

		list.clear();
		System.out.println(list.isEmpty() ? "리스트가 비었다" : "리스트가 비어있지 않다.");

	}

}
