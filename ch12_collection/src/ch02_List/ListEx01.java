package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// StringŸ�� ��ü�� �����ϴ� ����Ʈ ����
		List<String> list = new ArrayList<>();// default 10
		// size() ����� ����� ����
		System.out.println(list.size());
		// �߰�
		list.add("hello");// [0]
		list.add("hi");// [1]
		list.add("bye");// [2]
		System.out.println(list.size());

		// ���� add(index��ȣ, ��ü)
		list.add(1, "good");// ["hello"] ["good"] ["hi"] ["bye"]
		System.out.println(list.size());// 0 3 4

		// get(index��ȣ) list���� ��������
		for (int i = 0; i < list.size(); i++) { // �迭������ length���µ� ���⼭�� size
			System.out.print(list.get(i) + " "); // hello good hi bye
		}

		System.out.println();

		// list�� �ش� ��ü�� ����ִ��� Ȯ�� contains()
		System.out.println(list.contains("hello")); // true. ��ȣ ���� ���� ����ִ���.
		// ����
		list.set(1, "very good");

		for (int i = 0; i < list.size(); i++) { // �迭������ length���µ� ���⼭�� size
			System.out.print(list.get(i) + " "); // hello good hi bye
		}
		System.out.println();

		//����� ��� ���� remove(index) ���ϰ��� ������ ��ü
		String s = list.remove(1);
		System.out.println(s + "�� ������");

		//����� ��Ҹ� ���� remove(��ü) ���ϰ��� booleanŸ��.
		boolean result = list.remove("hi");
		System.out.println(result);// true
		System.out.println(list.size());// 2

		//��� ���� clear()
		list.clear();
		System.out.println(list.size());// 0
		//��Ұ� �ϳ��� ������ Ȯ�� isEmpty();
		System.out.println(list.isEmpty());// true
	}

}
