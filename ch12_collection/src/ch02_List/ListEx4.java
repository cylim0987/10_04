package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ListEx4 {

	public static void main(String[] args) {
		//List String타입 "홍길동", "일지매", "임꺽정", Integer타입 10, 20, 30
		//을 같이 저장하는 List를 만들고 값들을 모두 저장 후, 출력
		
		
		List list = new ArrayList();
		list.add("홍길동"); //String -> Object
		list.add("ssss");
		list.add("wwww");
		list.add(10); //Integer -> Object
		list.add(20);
		list.add(30);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i)); //Object -> String/Integer // 반드시 generic을 호출해야 하는 것은 아니다.///////////////
		
		
		
		
		
		
		/*
		 * 
		 * 
		List<Integer> v = new Vector<Integer>(2);
		
		List<Member> list = new LinkedList<>();
		
		//list.add(new Member(1, "홍길동");
		//list.add(new Member(2, "일지매");
		//list.add(new Member(3, "임꺽정");
		
		*
		*
		*/
		
		
		
		
	}

}
