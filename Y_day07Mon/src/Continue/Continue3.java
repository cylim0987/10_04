package Continue;

public class Continue3 {

	public static void main(String[] args) {

		
		//
		for(int i=0; i<=9; i++) {
			System.out.print("i=" + i + "\t");
			for(int j=0; j<=9; j++) {
				System.out.print("j=" + j);
				if(j>2) continue;//continue�� ���δ� ���� ����� ��
				System.out.print("���� ����� �Ǵ°�\t");
			}
			System.out.println(); //�� �� �Ʒ��� ������
		}
		
	}

}
