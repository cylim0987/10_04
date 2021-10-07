package Check06;

public class MemberService {

	boolean login(String id, String pwd) {
		if (id.equals("hong") && pwd.equals("12345")) { // 문자열 비교는 equals.
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}
}


/*
boolean login(String id, String pwd) {
		boolean result = false;
		if (id.equals("hong") && pwd.equals("12345")) { // 문자열 비교는 equals.
			result true;
		} else {
			result false;
		} return result; //이렇게도 됨. 
	}

	void logout(String id) {
		if("hong".equals(id))
			System.out.println("로그아웃되었습니다.");
	}
}

*/