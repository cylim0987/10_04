package ch01_02;

public class Ex0101 {
	public static void main(String[] args) {
		// 10, 20�� �Է¹޾Ƽ� "10+20=30"��� �ϴ� 
		//1. �����������̽�, 2. ���ٽ�
	 MYInter1 mi = new MYInter1() {	
		@Override
		public void me2(int x, int y) {
			System.out.println(x+"+"+y+"="+(x+y));
		}
	};
	mi.me2(10,20);
	
	//���ٽ�
	mi=(x,y) ->System.out.println(x+"+"+y+"="+(x+y));
	//ȣ��
	mi.me2(10,20);
	
	}
}