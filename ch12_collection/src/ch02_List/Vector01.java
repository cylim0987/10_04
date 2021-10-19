package ch02_List;

import java.util.List;
import java.util.Vector;
//Vector, List 쓸 수 있는 것 비교하면서 보기.
public class Vector01 {
	public static void main(String[] args) {
//		Vector<Integer> v = new Vector<Integer>(7);
		List<Integer> v = new Vector<Integer>(7);
//		System.out.println(v.capacity());
		// 요소삽입
		v.add(5);
		v.add(new Integer(4));
		v.add(-1);

		// 저장된 개수 = size()
		System.out.println(v.size());

		// 중간 삽입
		v.add(2, 100);
		// v.add(5,100); //사이즈 값보다 크기 때문에 오류 //Exception in thread "main"
		// java.lang.ArrayIndexOutOfBoundsException: 5 > 4

		// 전체 출력
		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));

		// 요소 얻기
		Integer obj = v.get(1); // 4. 인덱스 번호1에는 4가 있다.
		int i = obj.intValue();
		System.out.println(i);

		int j = v.get(1); // auto-unboxing;
		System.out.println(j);

		// 삭제
		v.remove(1);
		// v.remove(4); //Exception in thread "main"
		// java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 4

		// 마지막 요소
//		int last = v.lastElement();
//		System.out.println(last);

		// 모든요소 삭제
//		v.removeAllElements();

		// 비어있는지 확인
		System.out.println(v.isEmpty());

	}
}
