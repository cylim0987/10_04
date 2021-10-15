//5. 다음은 Action 인터페이스입니다.
//work () 추상 메소드는 객체의 작업을 시작시킵니다.
package verify;

public interface Action {
	void work();
}

class BookAction implements Action {

	@Override
	public void work() {
		System.out.println("도서를 등록");
	}

}

class CheckOutAction implements Action {

	@Override
	public void work() {
		System.out.println("도서를 대여");

	}
}

class CheckInAction implements Action{

	@Override
	public void work() {
		System.out.println("도서를 반납");
		
	}
	
}






