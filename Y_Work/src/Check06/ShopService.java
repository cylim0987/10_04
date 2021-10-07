/* 18. ShopService 객체를 싱글톤으로 만들고 싶습니다. ShopServiceExample 클래스에서
ShopService의 getInstance() 메소드로 싱글톤을 얻을 수 있도록 ShopService 클래스를 작성
해보세요. */
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