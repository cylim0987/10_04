package ch01_Object;

//thread, collection, network, file입출력.
public class Member {
	public String id;

public Member(String id) {
	this.id = id;

	public Student(String id) {
		this.id = id;
	}

//Object로부터 상속받은
//equals메소드를 재정의하여 논리적 동등 여부 만들기
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
		return this.id.equals(((Member)obj).id);
	}
		returen false;
}
