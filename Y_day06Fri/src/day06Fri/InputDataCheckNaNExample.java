package day06Fri;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڰ� �ƴ� NaN�� �Է¹޾Ƽ� ���� ó��
		
		String userInput = "NaN";
		//Double�� doubleŸ���� ����Ÿ�� ����� ����ó�����ִ� Ŭ����
		//wrapperŬ������� ��.
		//
		Double a = Double.valueOf(5.0);// double������ ����
		Double b = Double.valueOf("5.0");// double���� ���� ���ڿ��� ����
		
		System.out.println(a);
		System.out.println(b);
		
		double val = Double.valueOf(userInput);
		double currentBalanace = 10000.0;
		
		currentBalance += val;
		
		System.out.println(currentBalance);
		
		
	}

}
