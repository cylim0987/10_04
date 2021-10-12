package Ex05;

public class Child extends Parent {
	private int studentNo;

	
	public Child(String name, int studentNo) {
	//	super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}


//답 : 
//1. 부모 생성자에 default생성자가 없어서 만들어준다.// 2.7행에 super(name); 를 넣어야 한다.