//package work;
/* vctor@naver.com
 * ���� ������� 10/4��(��) 23:59�� ����
 * ��ĳ�ʷ� �Է°� �Է¹ޱ� ����, ����, Ű, ������
 * �ݺ�ó�� �����ϰ� ����� 
 * ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� �����ϱ�.
 *  https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
 * */
public class work01 {
	public static void main(String[] args) {
		
		// �����淮 ���ϱ�
		final double Lmale = 1.10;
		final double Lfemale = 1.07;
		final double ST2 = 128;

		int weight = ' ';
		int height = ' ';

		//�����淮
//		double result = ST1 * weight - ST2 * 
//				        ((weight * weight) /(double)(height * height)); 


		// ü���淮 ���ϱ�
		double result2 = weight - result;


		// ü����� ���ϱ� = ü���淮*100/ü��
		final double ST3 = 100;

		double result3 = result2 * ST3 / weight;

	}
}