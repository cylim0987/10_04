package ch01_Object;

//thread, collection, network, file�����.
public class Member {
	public String id;

public Member(String id) {
	this.id = id;

	public Student(String id) {
		this.id = id;
	}

//Object�κ��� ��ӹ���
//equals�޼ҵ带 �������Ͽ� ���� ���� ���� �����
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
		return this.id.equals(((Member)obj).id);
	}
		returen false;
}
