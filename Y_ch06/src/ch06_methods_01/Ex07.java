package ch06_methods_01;

public class Ex07 {

	public static void main(String[] args) {
		G1 g1 = new G1();
		for(int i=0; i<10; i++) {
			String str = g1.method(); //호출
			System.out.println(str);
		}
		
		
	}

	
	
}




class G1{
	//2유형 - 매개변수X, 리턴타입O
	String method() {
		return "졸려";
	}
}