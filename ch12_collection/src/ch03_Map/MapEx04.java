package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx04 {

	public static void main(String[] args) {
		// 1."ȫ�浿", 2."������", 3."�Ӳ���" 2, "�̼���"
		// 1,2,3�� Ű �ѱ��� value
		// 4���� ���� �����ϴ� Map�� �����, ���� ��
		// Map���� 3�� Ű�� �ش��ϴ� ��ü�� ����غ��ÿ�.

		Map<Integer, String> person = new HashMap<>(); // Double�� �ƴ϶� Integer
		person.put(1, "ȫ�浿"); //�⺻Ÿ�� int -> Integer�� AutoBoxing
		person.put(2, "������");
	//	person.put(new Integer(2), "������"); //�̷��� �ص� ��.
		person.put(3, "�Ӳ���");
		person.put(2, "�̼���"); //int => Integer

		
		System.out.println(person.size()); //3.
		System.out.println(person.get(3)); //AutoBoxing
		System.out.println(person.get(2)); //AutoBoxing
		
		// Ű ���� ���� Ȯ��
		System.out.println(person.containsKey(1)); // true
		//
		System.out.println(person.containsValue("�Ӱ��")); // false
		System.out.println(person.containsValue("�̼���")); // true

	}

}
