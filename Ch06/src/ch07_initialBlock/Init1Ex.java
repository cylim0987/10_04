package ch07_initialBlock;

public class Init1Ex {

	public static void main(String[] args) {
	//���ú��� i1 ����.
		Init1 i1 = new Init1();
		int[] b = i1.a; //i1.a;. �̰��� i1��ü�� �迭 ������ b�� ����(���� ����)
		for(int i: b) { 
			
			// i1.a�� �����ΰ�? i1�� �����ϰ� �ִ� a(�Ʒ��ִ°�). // 5�� ��������. �迭�� ���� �� ����. ������ ���� �������� �ʱ�ȭ
			// b�� ����.�ϸ� ���� int[] b= i1.a;. �̰��� i1��ü�� �迭 ������ b�� ����(���� ����)
			
			System.out.println(i);
		}
	}
}

class Init1{
	//�ʵ�
	int[] a = new int[5];
	//�ʱ�ȭ ��. �տ� �ν��Ͻ� �ʱ�ȭ �ҷ�. {�ʱ�ȭ ����} // ���� ������ ���� �����ٰ� �ʱ�ȭ�� �ִ´�.
	{
		for(int i=0; i<a.length; i++) {
			int k=(int)(Math.random()*10);
			a[i] = k;
		}
	}
}



