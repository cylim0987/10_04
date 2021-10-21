package ch01_02;

public class Ex0101 {
	public static void main(String[] args) {
		// 10, 20을 입력받아서 "10+20=30"출력 하는 
		//1. 무명인터페이스, 2. 람다식
	 MYInter1 mi = new MYInter1() {	
		@Override
		public void me2(int x, int y) {
			System.out.println(x+"+"+y+"="+(x+y));
		}
	};
	mi.me2(10,20);
	
	//람다식
	mi=(x,y) ->System.out.println(x+"+"+y+"="+(x+y));
	//호출
	mi.me2(10,20);
	
	}
}