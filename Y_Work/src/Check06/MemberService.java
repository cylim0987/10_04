package Check06;

public class MemberService {

	boolean login(String id, String pwd) {
		if (id.equals("hong") && pwd.equals("12345")) { // ���ڿ� �񱳴� equals.
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
}


/*
boolean login(String id, String pwd) {
		boolean result = false;
		if (id.equals("hong") && pwd.equals("12345")) { // ���ڿ� �񱳴� equals.
			result true;
		} else {
			result false;
		} return result; //�̷��Ե� ��. 
	}

	void logout(String id) {
		if("hong".equals(id))
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
}

*/