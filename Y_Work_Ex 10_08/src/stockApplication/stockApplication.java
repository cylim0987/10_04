package stockApplication;

import java.util.Scanner;

public class stockApplication {
	//���µ��� ������ �� �ִ� ����Ҹ� ������ �Ѵ�.
//	Account��ü�� ������ ������ �� �ִ� Ÿ���� �迭�̴�.
//	Account �迭�� �̸� �ʵ�� �����س��´�.
	
	private static Stock[] stockArray = new Stock[100];
	// [null][null][null][null]..[null]-100��
	
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;// idx=0; // index��ȣ�� 

	//static ������ main���� �� �迭�� ����ϱ� ����. static�� ������
	//main���� ����� ���� ����.
	public static void main(String[] args) { //������ �ؾ��ϱ� ������ mai1n�޼ҵ带 ������ش�.
		//�����̶�� �޼ҵ忡��
		boolean run = true;// run�̶�� ���ú����� ��� ����� �ǳĸ� while������ run�� Ʈ�簡 �Ǹ� �ݺ�, false�� ����������.
		while (run) {//ó���� boolean�� Ʈ��ϰ� ���� ��� �����Ѵ�
			System.out.println("--------------------------------------");
			System.out.println("1.��ǰ��� | 2.����� | 3.�԰� | 4.��� | 5.����");
			System.out.println("--------------------------------------");
			System.out.println("����>");

			 //1,2,3 ..�� �޾ƾ� �Ѵ�.
			int selectNo = scanner.nextInt();// �� �ѹ��� � ���� ������ �ִ��Ŀ� ����.
			switch (selectNo) {
			case 1:
				createStock();//��� �޼ҵ带 ȣ���ϵ���. ���θ޼ҵ忡�� �ٷ� ȣ���߱� ������ static���� �����ؾ��Ѵ�.
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
				run = false;//run�� false�� ����ϱ�. 5���� ����ϱ�.
				break;
			}
		}
		System.out.println("���α׷� ����");//while�� �߰�ȣ. ���Ϲ� �ٱ�.

	}

	// ��ǰ����ϱ�
	private static void createStock() {// ���� createAccount ������ �ڵ������� �޼ҵ尡 ���������. �̰� �޼ҵ���.
		System.out.println("------");
		System.out.println("��ǰ���");
		System.out.println("------");
		System.out.print("��ǰ��:");
		String name = scanner.next(); //����ڰ� �Է��ϸ� scanner�� next(�ڿ� ���� ���� ���ڿ��̱� ������.)��� �޼ҵ�� �Էµ� ���ڸ� ����.
		System.out.print("���:");
		int qty = scanner.nextInt();//�Էµ� ���� ���ڴϱ� nextInt��.

		Stock acc = new Stock(name, qty);//�ϳ��� ���°�ü�� ����.
		//�� ��ü�� ��� �����Ұų�. �� ���� ��ī��Ʈ �迭�� ������ �Ѵ�. ����ؾ��� ��.;
		//�迭.�迭�� 0������ �����Ѵ�. �� �迭 Ÿ���� Ŭ����Ÿ���̱� ������ nullŸ������ �� ���ִ�. 		
		//index1�� ��ü�� �����ϸ� null�� �ȴ�.... �׷��� ������ ������ �� null��ġ�� �����ؾ��Ѵ�.
//		3������ �־��ٰ� �ϴ���. � ���¸� �����ϸ� �� ���°� null�� �Ǵϱ�.
//		null��ü�� ã�Ƽ� �����ϵ��� �ϴ� ���� ����. 1���� ����ִµ� 4������ ������
//		������ 99��° �������ʹ� ��ü ������ ����. �׷��� ����ִ� ������ ���� ����� ȿ�����̴�.
//		�׷��� for������.

		stockArray[idx++] = acc; //�̰� �ٽ��ΰ� ������?

		System.out.println("���: ��ǰ�� ��ϵǾ����ϴ�.");

	}

	// ����Ϻ���
	private static void stockList() {
		System.out.println("------");
		System.out.println("�����");
		System.out.println("------");
		//����ڷκ��� �Է¹޴� ������ ������ for�� �ٷ� ����.
		for (int i = 0; i < stockArray.length; i++) {
			Stock stock = stockArray[i];//��ī��Ʈ�� i������� ���
			if (stock != null) {// ��ī��Ʈ ��ü�� null�� �ƴ϶��,
				//�׷��ϱ� ������ �Ǿ��ִٸ�.
				System.out.println("��ǰ��ȣ:" + stock.getItem());
				System.out.println("��ǰ��:" + stock.getName());//�ʵ尡 
				//private�̶� �ٷ� ������ �� ���� getter�� ���ؼ� 
				//private���� ���Ϲ޾Ƽ� ���.
				System.out.println("���:" + stock.getQty());
				//System.out.println(stock.toString());
				//Stock [��ǰ��ȣ=111-001, ��ǰ��=�����, ���=100]
				// .�� ����� �̷��� �߰��� ���.
			}
		}

	}

	// �԰��ϱ�
	private static void input() {
		System.out.println("------");
		System.out.println("�԰�");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String item = scanner.next();
		System.out.print("�԰�");
		int amount = scanner.nextInt();
		//����ڰ� �Է��� ���¿� ������ ��ü�� �迭���� ã�ƿ;� �Ѵ�.
		Stock acc = findStock(item); //find��� �޼ҵ带 ȣ���ؼ�.
		//�� �޼ҵ��� �Ű������� ã�����ϴ� ano(a,number��¶�)���� �Ѱ��ָ�
		//�� a�ѹ����� �ش��ϴ� ��ī��Ʈ�� ���ϵǾ�����������.
		
		//ã�Ҵٸ�,
		if (acc != null) {// �� ã�Ҵٸ�. 
			//���� ã�� ���ϰ� null�� �����ϴ� ���. .
			//for������ �迭�� ���̸�ŭ �ݺ��ϴµ� ������ �ݺ��� �ص�.
			//a�ѹ��� ������ account��ü������ ������ ��ü�� �� ã�Ҵٸ�
			//account�� ��� null���·� �����ִ�.
			//null���°� ��� �����־ for���� ��� �����ϰ�,
			//a�ѹ��� ������ �� ã�� ������ ���. null�� ���·� ����.
			acc.setQty(acc.getQty() + amount);
			System.out.println("���: �԰� �Ϸ�Ǿ����ϴ�."); //ã�� ���
		} else {
			System.out.println("���: ��ǰ��ȣ�� Ȯ�����ּ���.");
			//ano�� �ش��ϴ� ���¸� �� ã�Ҵٸ�.
		}
	}

	// ����ϱ�
	private static void output() {
		System.out.println("------");
		System.out.println("���");
		System.out.println("------");
		System.out.print("��ǰ��ȣ");
		String item = scanner.next();
		System.out.print("���");
		int amount = scanner.nextInt();
		
		//����ڰ� �Է��� ���¿� ������ ��ü�� �迭���� ã�ƿ;� �Ѵ�.
		Stock acc = findStock(item);
		if (acc != null) {
			if (acc.getQty() - amount >= 0) {
				acc.setQty(acc.getQty() - amount);
				System.out.println("���: ��� �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("���: ����� �����մϴ�.");
			}
		}	else {
			
			System.out.println("���: ��ǰ��ȣ�� Ȯ�����ּ���.");
		}
	}

	private static Stock findStock(String item) {//�޼ҵ� �����,
		//������ ������ ����.
		Stock stock = null;//account��� �ϴ� ��ü�� ã�ƾ��ϴϱ�
		//account������ �����ϰ�,
		for (int i = 0; i < stockArray.length; i++) {//��ü �迭��
			//���̸�ŭ �ݺ�.
			stock = stockArray[i];
			if (stock != null) {// i��ü�� ���ִ� ���� null�� �ƴ� ���
				if (stock.getItem().equals(item))//stock�̶�
					//item�� ���ٸ�,
					break;
			}
		}
		return stock; //stock�� �����ϴ� ��ü������ �����ϵ���. 
	}
}