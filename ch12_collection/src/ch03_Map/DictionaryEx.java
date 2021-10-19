package ch03_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {
	public static void main(String[] args) {
		//"apple" - "���", "pear" - "��", "peach" - "������",
		//"puppy" - "������", "cow" - "��" , "zebra" - "��踻", "chicken" - "��"
		//�ʿ� ���� ��
		// scanner�� ������ �Է¹޾Ƽ� �ش��ϴ� �ѱ��� ���
		// map�� Ű�� ������ �ٽ� �Է��ϵ��� ........return?
		// ���� ���� "end"�� �ԷµǸ� ����;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Map<String, String> member = new HashMap<>();
		member.put("apple", "���");
		member.put("pear", "��");
		member.put("peach", "������");
		member.put("puppy", "������");
		member.put("cow", "��");
		member.put("zebra", "��踻");
		member.put("chicken", "��");
		
		System.out.println(member.size());
		System.out.println(member.get("peach")); //index�� �ƴϴ�. Ű�� �޾ƾ� �Ѵ�.
		
		System.out.println(member.containsKey("zebra"));
		
		
		
	while(true) {	
		//��ȸ�� �ܾ�
		System.out.println("��ȸ�� ���ܾ �Է��Ͻÿ�>");
		String key = scanner.next();
		if(!key.equals("end")) {
		if(member.containsKey(key)) {
			System.out.println(member.get(key));
		}else {
			System.out.println("�ش��ϴ� �ܾ �����ϴ�.");
		}
		}else 
			break;
	}	
		
		System.out.println("���α׷� ����");
	}

}
/*
 * package ch03_Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		// Map�������̽� ����
		Map<String, String> fruits = new HashMap<String, String>();

		// put(key, value);
		fruits.put("apple", "���"); // key = "apple", value = "���"

		// get(key)�� ���� �� value
		String value = fruits.get("apple");
		System.out.println(value); // value�� "���"���

	} ----------------����-------------------------

}

 */





/*
key, value
apple, ���
key�� �Է��ؼ� ����� value

*/