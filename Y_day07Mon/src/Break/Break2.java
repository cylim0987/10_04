package Break;

public class Break2 {

	public static void main(String[] args) {

		int num=0, sum=0;
		while(true) {
			num++; //1�� ����
			sum = sum + num; //�����ؼ� ���ϱ� // sum+=num;
			if(num==50)
				break; // while���� ���������� ���� break;
		}
		System.out.println("�հ� :" + sum);
	}

}
