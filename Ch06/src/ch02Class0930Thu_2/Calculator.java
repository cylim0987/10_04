package ch02Class0930Thu_2;

//public Ű����� �ܺο��� ���ٰ����� ���� ��������.
public class Calculator {
	// model���� �����Ǹ� �ȵ�.
	public final String model = "00001"; //���̳� �����ϸ� Use 99999���� ������ ����!
	// result���� getCalc�� ���ؼ� ó���� ���� ����. �ܺο��� ����{�Ұ�?} . ��ü�� �޾Ƽ� ���ٴ� ���� �������� ��� ���ȭ �Ѵٴ� ��. ��ǰ...
	private double result = 0;

	// ���� Ŭ�������� �޼ҵ�鳢���� ��ȣ ȣ�� ����.
	public void getCalc(String op, int x, int y) {
		switch (op) {
		case "+":
			result = add(x, y);
			System.out.println(result);
			break;
		case "-":
			result = sub(x, y);
			System.out.println(result);
			break;
		case "x":
			result = mul(x, y);
			System.out.println(result);
			break;// ????? *�̰� �ƴ϶�? ��. ǥ�õǴ°Ŵϱ�.
		case "/":
			result = div(x, y);
			System.out.println(result);
			break;
		}
	}

	// �Ʒ��� �޼ҵ���� getCalc()�޼ҵ常 ȣ�Ⱑ��. - �ܺο��� ȣ��Ұ�.
	public int add(int x, int y) {
		return x + y;
	}

	private int sub(int x, int y) { //private, public. | ���ٺҰ�, ���� ����\\ �̰��� �ٷ� ĸ��ȭ. ��ü ������ Ư¡.
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public double div(int x, int y) {
		return x / (double) y;
	}
}
