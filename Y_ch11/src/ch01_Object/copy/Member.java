package ch01_Object.copy;

//thread, collection, network, file�����.
public class Member {
	int sno;

	public Member(int sno) {
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		// 1. ���� Ÿ���̸�
		if (obj instanceof Member) {// 2.�ʵ尪���� ��
			return this.sno == ((Member) obj).sno;// 3.�ʵ尪���� �� ��� true/false ����.
		} // ����Ÿ���� �ƴϸ� ������ false;
		return false;

	}

}
//console�� : false 2001001 2000001 �ٸ�.
