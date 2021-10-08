package stockApplication;

import java.util.Scanner;

public class stockApplication {
	//계좌들을 저장할 수 있는 저장소를 만들어야 한다.
//	Account객체를 여러개 저장할 수 있는 타입은 배열이다.
//	Account 배열을 미리 필드로 선언해놓는다.
	
	private static Stock[] stockArray = new Stock[100];
	// [null][null][null][null]..[null]-100개
	
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;// idx=0; // index번호가 

	//static 이유는 main에서 이 배열을 사용하기 위함. static이 없으면
	//main에서 사용할 수가 없음.
	public static void main(String[] args) { //실행을 해야하기 때문에 mai1n메소드를 만들어준다.
		//메인이라는 메소드에서
		boolean run = true;// run이라는 로컬변수는 어디서 사용이 되냐면 while문으로 run이 트루가 되면 반복, false면 빠져나가게.
		while (run) {//처음에 boolean이 트루니가 런이 계속 동작한다
			System.out.println("--------------------------------------");
			System.out.println("1.상품등록 | 2.재고목록 | 3.입고 | 4.출고 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택>");

			 //1,2,3 ..을 받아야 한다.
			int selectNo = scanner.nextInt();// 이 넘버가 어떤 값을 가지고 있느냐에 따라.
			switch (selectNo) {
			case 1:
				createStock();//라는 메소드를 호출하도록. 메인메소드에서 바로 호출했기 때문에 static으로 정의해야한다.
				break;
			case 2:
				stockList();
				break;
			case 3:
				input();
				break;
			case 4:
				output();
				break;
			case 5:
				run = false;//run이 false면 종료니까. 5번은 종료니까.
				break;
			}
		}
		System.out.println("프로그램 종료");//while문 중괄호. 와일문 바깥.

	}

	// 상품등록하기
	private static void createStock() {// 위에 createAccount 누르면 자동적으로 메소드가 만들어진다. 이거 메소드임.
		System.out.println("------");
		System.out.println("상품등록");
		System.out.println("------");
		System.out.print("상품명:");
		String name = scanner.next(); //사용자가 입력하면 scanner의 next(뒤에 없는 것은 문자열이기 떄문에.)라는 메소드로 입력된 문자를 받음.
		System.out.print("재고량:");
		int qty = scanner.nextInt();//입력된 값이 숫자니까 nextInt로.

		Stock acc = new Stock(name, qty);//하나의 계좌객체를 만듦.
		//이 객체를 어디에 저장할거냐. 저 위에 어카운트 배열에 저장을 한다. 고려해야할 것.;
		//배열.배열은 0번부터 시작한다. 이 배열 타입이 클래스타입이기 때문에 null타입으로 다 들어가있다. 		
		//index1의 객체를 삭제하면 null이 된다.... 그래서 앞으로 저장할 때 null위치에 저장해야한다.
//		3번까지 넣었다고 하더라도. 어떤 계좌를 삭제하면 그 계좌가 null이 되니까.
//		null객체를 찾아서 생성하도록 하는 것이 좋다. 1번이 비어있는데 4번에다 넣으면
//		마지막 99번째 다음부터는 객체 저장을 못함. 그래서 비어있는 공간에 먼저 해줘야 효율적이다.
//		그래서 for문으로.

		stockArray[idx++] = acc; //이게 핵심인거 같은데?

		System.out.println("결과: 상품이 등록되었습니다.");

	}

	// 재고목록보기
	private static void stockList() {
		System.out.println("------");
		System.out.println("재고목록");
		System.out.println("------");
		//사용자로부터 입력받는 내용이 없으니 for로 바로 간다.
		for (int i = 0; i < stockArray.length; i++) {
			Stock stock = stockArray[i];//어카운트의 i번재것을 얻어내어서
			if (stock != null) {// 어카운트 객체가 null이 아니라면,
				//그러니까 저장이 되어있다면.
				System.out.println("상품번호:" + stock.getItem());
				System.out.println("상품명:" + stock.getName());//필드가 
				//private이라서 바로 접근할 수 없고 getter를 통해서 
				//private값을 리턴받아서 사용.
				System.out.println("재고:" + stock.getQty());
				//System.out.println(stock.toString());
				//Stock [상품번호=111-001, 상품명=새우깡, 재고=100]
				// .안 지우면 이렇게 추가로 뜬다.
			}
		}

	}

	// 입고하기
	private static void input() {
		System.out.println("------");
		System.out.println("입고");
		System.out.println("------");
		System.out.print("상품번호");
		String item = scanner.next();
		System.out.print("입고량");
		int amount = scanner.nextInt();
		//사용자가 입력한 계좌와 동일한 객체를 배열에서 찾아와야 한다.
		Stock acc = findStock(item); //find라는 메소드를 호출해서.
		//이 메소드의 매개값으로 찾고자하는 ano(a,number라는뜻)값을 넘겨주면
		//즉 a넘버값에 해당하는 어카운트가 리턴되어져나오도록.
		
		//찾았다면,
		if (acc != null) {// 못 찾았다면. 
			//만약 찾지 못하고 null을 리턴하는 경우. .
			//for문에서 배열의 길이만큼 반복하는데 끝까지 반복을 해도.
			//a넘버와 동일한 account객체정보와 동일한 객체를 못 찾았다면
			//account는 계속 null상태로 남아있다.
			//null상태가 계속 남아있어서 for문을 계속 실행하고,
			//a넘버와 동일한 걸 찾지 못했을 경우. null인 상태로 리턴.
			acc.setQty(acc.getQty() + amount);
			System.out.println("결과: 입고가 완료되었습니다."); //찾은 경우
		} else {
			System.out.println("결과: 상품번호를 확인해주세요.");
			//ano에 해당하는 계좌를 못 찾았다면.
		}
	}

	// 출고하기
	private static void output() {
		System.out.println("------");
		System.out.println("출고");
		System.out.println("------");
		System.out.print("상품번호");
		String item = scanner.next();
		System.out.print("출고량");
		int amount = scanner.nextInt();
		
		//사용자가 입력한 계좌와 동일한 객체를 배열에서 찾아와야 한다.
		Stock acc = findStock(item);
		if (acc != null) {
			if (acc.getQty() - amount >= 0) {
				acc.setQty(acc.getQty() - amount);
				System.out.println("결과: 출고가 완료되었습니다.");
			} else {
				System.out.println("결과: 재고량이 부족합니다.");
			}
		}	else {
			
			System.out.println("결과: 상품번호를 확인해주세요.");
		}
	}

	private static Stock findStock(String item) {//메소드 선언부,
		//위에거 눌러서 얻음.
		Stock stock = null;//account라고 하는 객체를 찾아야하니까
		//account변수를 선언하고,
		for (int i = 0; i < stockArray.length; i++) {//전체 배열의
			//길이만큼 반복.
			stock = stockArray[i];
			if (stock != null) {// i객체에 들어가있는 값이 null이 아닐 경우
				if (stock.getItem().equals(item))//stock이랑
					//item이 같다면,
					break;
			}
		}
		return stock; //stock가 참조하는 객체번지를 리턴하도록. 
	}
}