//6��. for���� �̿��ؼ� ���� ����� ���� �ﰢ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
package Ch04Exercise;
public class Ch04Exercise6 {
	public static void main(String[] args) {

	for(int i=1; i<6; i++) {
		for(int j=1; j<i+1; j++) {
			System.out.print("*");
			if(j==i) {
				System.out.println();
			}
		}
	}
	}

}