package ch01;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		int a = Integer.paraseInt("10"); // "10" -> 10
		System.out.println(a);
		//���ܹ߻�
		a=Integer.parseInt("��"); //"10" -> 10
		System.out.println(a);
		
	}catch

}
