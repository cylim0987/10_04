package ch07_initialBlock;

public class Init3Ex {

	public static void main(String[] args) {
		System.out.println("초기화 테스트");
		Block b1 = new Block(); //블록 b123 주석으로 가리면서 콘솔떠보기.
		Block b2 = new Block();
//		Block b3 = new Block();
	}

}

//실행 순서 - static초기화 -> 인스턴스 초기화 -> 생성자
//static이 instance보다 먼저다! 라는 개념을 기억.
class Block{
	{//인스턴스 초기화 블럭
		System.out.println("인스턴스 초기화 블럭");
	}
	//static의 특성 - unique특성 - 최초 클래스 로드시 한번만 실행.
	static {//static 초기화 블럭
		System.out.println("클래스-static 초기화 블럭");
	}
	//생성자
	Block(){
		System.out.println("생성자");
	}
}





