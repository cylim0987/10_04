package ch02_List;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList02 {

	public static void main(String[] args) {
		// 1.String��ü�� ��� Linkded List�����
		// 2."ȫ�浿", "������", "�Ӳ���"�� ���� �� ����� ������ �����ϵ��� �ۼ� //3
		// 3."�̼���"�� ����ִ��� Ȯ�� //�̼��� ������ �����ϴ�.
		// 3.5 ��� ��ü�� ���
		// 4.index��ȣ 2���� �ش��ϴ� ��ü�� "������"���� �����Ͻÿ�. //������
		// 5.index��ȣ 3���� �ش��ϴ� ��ü�� ����Ͻÿ�
		// 6.����Ʈ ���� ��� ��ü�� ���� ��
		// 7.����Ʈ�� ����ִ��� Ȯ�� �޼����� ���.

		// List �������̽� Ÿ���� �������� = Array
		List<String> list = new LinkedList<>();

		// ��ü �߰� �޼ҵ�add(��ü);
		list.add("ȫ�浿");
		list.add("������");
		list.add("�Ӳ���");

		int n = list.size();
		System.out.println(n);

		for (String s : list)
			System.out.println(s);// ��ü ���.
		System.out.println("---------------------------------------");

		System.out.println(list.contains("�̼���") ? "�̼����� ���忡 �ֽ��ϴ�." : "�̼��� ���忡 �����ϴ�."); // 3��.

		list.add(2, "������");
		String str = list.get(3);
		System.out.println(str);

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));// ��ü ���
		for (String s : list) // s <- �ݺ���
			System.out.println(s);// ��ü ���.

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

		// index��ȣ 2���� �ش��ϴ� ��ü��"������"���� ����
		list.set(2, "������");

		System.out.println("---------------");

		System.out.println(list.get(2));

		// // ��ü�� �Ǵ°�? //replace �޼ҵ�� ����. �ٸ� �������.? set�޼ҵ�. set���� �ٲ۴�.

		list.clear();
		System.out.println(list.isEmpty() ? "����Ʈ�� �����" : "����Ʈ�� ������� �ʴ�.");

	}

}
