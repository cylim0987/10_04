package Ex20T;

import java.util.Scanner;

public class StockApplication {
	private static Stock[] stockArray = new Stock[2];
	private static Scanner scanner = new Scanner(System.in);
	private static int qty;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------");
			System.out.println("1.�԰� | 2.���");
			System.out.println("--------------------------------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			switch (selectNo) {
			case 1 :
				createItem();
				break;
			case 2 : 
				itemList();
				break;
			case 3 :
				
				
			}
			
		}
		
		
		
		
		
		
	}
}
