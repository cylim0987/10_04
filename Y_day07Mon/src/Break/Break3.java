package Break;

public class Break3 {

	public static void main(String[] args) {

		
		// ���� �ݺ����� ��ü ������������ �ٱ��� for���̳�  while�� �տ� Label:(���� ��)�� ǥ���ϰ� break�� �ڿ� Label:ǥ��.
	Label:	for(int i=0; i<=9; i++) {
			System.out.print("i=" + i + "\t");
			for(int j=0; j<=9; j++) {
				System.out.print("j=" + j + "\t");
				if(j>4)
					break Label; //���� for���� ���.
			}
			System.out.println(); //�� �� �Ʒ��� ������
		}
	}

}
