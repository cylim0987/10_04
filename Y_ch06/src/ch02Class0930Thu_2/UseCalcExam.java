package ch02Class0930Thu_2;

public class UseCalcExam {

	public static void main(String[] args) {
		//��ü ���� (Calculator�� ���� ���� Calculator��ü�� �����ؾ� �Ѵ�)
		Calculator cal = new Calculator();
		cal.getCalc("+", 10, 20); // �ܼ�:30.0 // Sysou�� �Ƚᵵ �ȴ�.
	System.out.println(cal.model); // �ܼ� : 00001
	System.out.println(cal.result); // �ܼ� : 30.0
	
	//Cal���� result�� private�� �����ϸ� ���⼭ ���� �Ұ��ϴ�.
	int res = cal.sub(10,20);
	
	cal.result = cal.sub(10,20);
	System.out.println(cal.result); // �ܼ� : -10.0
	
	//�ܺο��� ���� �Ұ�
	//cal.model = "99999"; //Calculator���� final ���� ������ ������.
	System.out.println(cal.model); // �ܼ� : 99999
	
	
	}

}
