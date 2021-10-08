package Exthisisjava;

import java.util.Scanner;

public class BankApplication {ㅇㅇㅇㅇㅇㅇㅇ
//계좌들을 저장할 수 있는 저장소를 만들어야 한다.
//	Account객체를 여러개 저장할 수 있는 타입은 배열이다.
//	Account 배열을 미리 필드로 선언해놓는다.
	private static Account[] accountArray = new Account[100]; // new!!!!!!!! 설명.20분이전
			//static 이유는 main에서 이 배열을 사용하기 위함. static이 없으면 main에서 사용할 수가 없음.

	//키보드로부터 입력을 받아야하니까 Scanner를 쓴다.
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) { //실행을 해야하기 때문에 mai1n메소드를 만들어준다.
		//메인이라는 메소드에서
		boolean run = true; // run이라는 로컬변수는 어디서 사용이 되냐면 while문으로 run이 트루가 되면 반복, false면 빠져나가게.
		while(run) {//처음에 boolean이 트루니가 런이 계속 동작한다.
			 System.out.println("--------------------------------------");
			 System.out.println("1.계좌생성 |2.계좌목록 |3.예금 |4.출금|5.종료");
			 System.out.println("--------------------------------------");
			 System.out.println("선택>");
			
			 //1,2,3 ..을 받아야 한다.
			 int selectNo = scanner.nextInt(); // 이 넘버가 어떤 값을 가지고 있느냐에 따라.
			 
			 if(selectNo == 1) {
				 createAccount(); //라는 메소드를 호출하도록. 메인메소드에서 바로 호출했기 때문에 static으로 정의해야한다.
			 }else if(selectNo == 2) {
				 accountList(); //
			 }else if(selectNo == 3) {
				 deposit();
			 }else if(selectNo == 4) {
				 withdraw();
			 }else if(selectNo == 5) {
				 run = false; //run이 false면 종료니까. 5번은 종료니까.
			 }
			 
		}
		System.out.println("프로그램 종료"); //while문 중괄호. 와일문 바깥.
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		//여기 메소드내용을 채워야한다.
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.println("계좌번호");
		String ano = scanner.next();
		System.out.println("출금액: ");
		int money = scanner.nextInt();
		
		//사용자가 입력한 계좌와 동일한 객체를 배열에서 찾아와야 한다.
		Account account = findAccount(ano); //find라는 메소드를 호출해서. 이 메소드의 매개값으로 찾고자하는 ano(a,number라는뜻)값을 넘겨주면 즉 a넘버값에 해당하는 어카운트가 리턴되어져나오도록.
	
		//찾았다면,
		if(account == null) { // 못 찾았다면. //만약 찾지 못하고 null을 리턴하는 경우. . /for문에서 배열의 길이만큼 반복하는데 끝까지 반복을 해도. a넘버와 동일한 account객체정보와 동일한 객체를 못 찾았다면 account는 계속 null상태로 남아있다. null상태가 계속 남아있어서 for문을 계속 실행하고, a넘버와 동일한 걸 찾지 못했을 경우. null인 상태로 리턴.
			System.out.println("결과: 계좌가 없습니다.");//ano에 해당하는 계좌를 못 찾았다면.
			return; //메소드 실행 종료
		}
		account.setBalance(account.getBalance() - money); //출금은 - 마이너스.
		System.out.println("결과: 출금이 성공되었습니다.");
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.println("계좌번호");
		String ano = scanner.next();
		System.out.println("예금액: ");
		int money = scanner.nextInt();
		
		//사용자가 입력한 계좌와 동일한 객체를 배열에서 찾아와야 한다.
		Account account = findAccount(ano); //find라는 메소드를 호출해서. 이 메소드의 매개값으로 찾고자하는 ano(a,number라는뜻)값을 넘겨주면 즉 a넘버값에 해당하는 어카운트가 리턴되어져나오도록.
	
		//찾았다면,
		if(account == null) { // 못 찾았다면. //만약 찾지 못하고 null을 리턴하는 경우. . /for문에서 배열의 길이만큼 반복하는데 끝까지 반복을 해도. a넘버와 동일한 account객체정보와 동일한 객체를 못 찾았다면 account는 계속 null상태로 남아있다. null상태가 계속 남아있어서 for문을 계속 실행하고, a넘버와 동일한 걸 찾지 못했을 경우. null인 상태로 리턴.
			System.out.println("결과: 계좌가 없습니다.");//ano에 해당하는 계좌를 못 찾았다면.
			return; //메소드 실행 종료
		}
		account.setBalance(account.getBalance() + money); //기존 잔고의 값은 getbalance로 얻을 수 있고,
		System.out.println("결과: 입금이 성공되었습니다.");
	}

	private static Account findAccount(String ano) {//메소드 선언부, 위에거 눌러서 얻음.
		// TODO Auto-generated method stub
		Account account = null; //account라고 하는 객체를 찾아야하니까 account변수를 선언하고,
		
		for(int i=0; i<accountArray.length; i++) { //전체 배열의 길이만큼 반복.
			if(accountArray[i] != null) { // i객체에 들어가있는 값이 null이 아닐 경우
				String dbAno = accountArray[i].getAno(); //저장되어있는 어카운트의 a넘버를 읽어본다. i넘버째에 있는 ano를 읽어서. getAno()에 저장한다.
				if(dbAno.equals(ano)) {//dbAno랑 ano가 같다면,
					account = accountArray[i];
					break;
				}
			}
		}
		return account; //어카운트가 참조하는 객체번지를 리턴하도록. 
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		//사용자로부터 입력받는 내용이 없으니 for로 바로 간다.
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i]; //어카운트의 i번재것을 얻어내어서
			if(account != null) { // 어카운트 객체가 null이 아니라면, 그러니까 저장이 되어있다면.
				 System.out.println("계좌번호:"+account.getAno()); //get이 뭐였지????????????????????
				 System.out.println("계좌주:"+account.getOwner()); //필드가 private이라서 바로 접근할 수 없고 getter를 통해서 private값을 리턴받아서 사용.
				 System.out.println("잔고:"+account.getBalance());
				 System.out.println();
				// System.out.println(account.toString()); //null로 되어있는 참조변수의 값을 toString()으로 읽으면 nullPointer오류발생
				
			}
		}
	}

	//메소드
	private static void createAccount() { // 위에 createAccount 누르면 자동적으로 메소드가 만들어진다. 이거 메소드임.
		// TODO Auto-generated method stub
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호:");
		String ano = scanner.next(); //사용자가 입력하면 scanner의 next(뒤에 없는 것은 문자열이기 떄문에.)라는 메소드로 입력된 문자를 받음.
		System.out.print("계좌주:");
		String owner = scanner.next();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();//입력된 값이 숫자니까 nextInt로.
		
		Account newAccount = new Account(ano, owner, balance); //하나의 계좌객체를 만듦.
		//이 객체를 어디에 저장할거냐. 저 위에 어카운트 배열에 저장을 한다. 고려해야할 것.;
		//배열.배열은 0번부터 시작한다. 이 배열 타입이 클래스타입이기 때문에 null타입으로 다 들어가있다. 		
		//index1의 객체를 삭제하면 null이 된다.... 그래서 앞으로 저장할 때 null위치에 저장해야한다.
//		3번까지 넣었다고 하더라도. 어떤 계좌를 삭제하면 그 계좌가 null이 되니까.
//		null객체를 찾아서 생성하도록 하는 것이 좋다. 1번이 비어있는데 4번에다 넣으면
//		마지막 99번째 다음부터는 객체 저장을 못함. 그래서 비어있는 공간에 먼저 해줘야 효율적이다.
//		그래서 for문으로.
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {//accountArray의 i번째가 null인가를 조사하는
				//것.비어있는 곳을 조사.
				accountArray[i] = newAccount; //비어있는 곳에 저장을 한다.
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; //대입을 하면 저장이 끝난거니까 for문을 빠져나옴.
		}
	}
	}
}

//데드코드.....i++ {} 괄호 잘 보기.