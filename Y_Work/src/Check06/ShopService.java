/* 18. ShopService ��ü�� �̱������� ����� �ͽ��ϴ�. ShopServiceExample Ŭ��������
ShopService�� getInstance() �޼ҵ�� �̱����� ���� �� �ֵ��� ShopService Ŭ������ �ۼ�
�غ�����. */
package Check06;

public class ShopService {

	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
	}
}

/*
 * 1....
 * 
 

	class ShopService{
		private static ShopService instance = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return singleton;
}


*/

/*
class ShopService{
private static ShopService instance;
	
	private ShopService() {}
	private ShopService() {}
	public static ShopService getInstance() {
		if(instance==null) instance=new ShopService();
		return instance;
	}
}
*/