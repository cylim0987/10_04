package ch01;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		int a = Integer.paraseInt("10"); // "10" -> 10
		System.out.println(a);
		//예외발생
		a=Integer.parseInt("십"); //"10" -> 10
		System.out.println(a);
		
	}catch

}
