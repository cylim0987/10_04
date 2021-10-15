package ch01;

public interface NullPointerExceptionEx {
	public static void mian(String[] args) {
		
		//선언된 참조 변수가 객체를 참조하지 않을 때 NullPointerException발생
		String str = null;
		
		System.out.println(str.toString());
		
		
	}
}
