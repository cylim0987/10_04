package ch01_Object.copy.copy;

public class MemberEx1 {

	public static void main(String[] args) {

		//물리적으로 다른 객체
		Member member1 = new Member(2001001);
		Member member2 = new Member(2000001);
		
		//논리적 동등 - 내용이 같으면 동등한 객체로 처리
		System.out.println(member1.equals(member2));
		
	}
}


