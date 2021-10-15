package ch01_Object.copy;

//thread, collection, network, file입출력.
public class Member {
	int sno;

	public Member(int sno) {
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		// 1. 동일 타입이면
		if (obj instanceof Member) {// 2.필드값끼리 비교
			return this.sno == ((Member) obj).sno;// 3.필드값끼리 비교 결과 true/false 리턴.
		} // 동일타입이 아니면 무조건 false;
		return false;

	}

}
//console값 : false 2001001 2000001 다름.
