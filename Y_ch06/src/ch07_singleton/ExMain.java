package ch07_singleton;

public class ExMain {
	public static void main(String[] args) {
		//multiton방식.  -  new 생성자(); 
		//SingleTon s1 = new SingleTon(); //외부에 있는 싱글톤 생성자가 private기 때문에 직접 접근할 수 없다.
		//SingleTon s1 = SingleTon.instance;
		
		//클래스명.static메소드호출()
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
	
		System.out.println(s1==s2 ? "같은객체" : "다른객체");
		
	}

}
