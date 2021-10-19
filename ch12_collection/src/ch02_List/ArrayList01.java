package ch02_List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
	public static void main(String[] args) {
		// List �������̽� Ÿ���� �������� = ArrayList ��ü ����
		List<String> list = new ArrayList<>();

		// ��ü �߰� �޼ҵ� add(��ü);
		list.add("Hello");
		list.add("hi");
		list.add("Java");

		// ��ü�� ���� Ȯ�� size()
		int n = list.size();
		// int c = list.capacity(); - ���� �޼ҵ尡. ����Ʈ�� ���� ���Ϳ� �ִ�.
		System.out.println(n);

		// �߰� ���� add(index, ��ü)
		list.add(2, "Shani");
		// list.add(5, "Shani"); // �� ������� ũ�� ������ ������ �߻��Ѵ�.
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 5,
		// Size: 4

		// ��ü ���忩�� Ȯ�� contains(��ü)
		System.out.println(list.contains("Java") ? "Java������ �ֽ��ϴ�" : "Java������ �����ϴ�.");

		// ����� ��ü ��� get(index)
		String str = list.get(1);
		System.out.println(str); // hi . hi�� 1��°. 0,1,2

		//
		Object[] strArr = list.toArray();
		for (Object s : strArr)
			System.out.println(s + "EEEE");
		System.out.println();

		// ���� remove(index��ȣ)
		list.remove(1);

		// list.remove(4); // �� ������� ũ�� ������ ���� �߻�
		// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4,
		// Size: 3

		// ��� ����
		list.clear();

		System.out.println(list.isEmpty() ? "����Ʈ�� ����ֽ��ϴ�. " : "����Ʈ�� ������� �ʽ��ϴ�."); // ����Ʈ�� ����ֽ��ϴ�.

	}

}
