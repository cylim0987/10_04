package Ex20T;

import java.util.Scanner;

public class BankApplication {ししししししし
	//域疎級聖 煽舌拝 呪 赤澗 煽舌社研 幻級嬢醤 廃陥.
//	Account梓端研 食君鯵 煽舌拝 呪 赤澗 展脊精 壕伸戚陥.
//	Account 壕伸聖 耕軒 琶球稽 識情背兜澗陥.
	private static Account[] accountArray = new Account[100];//[null][null][null][null]..[null]-100鯵
	//static 戚政澗 main拭辞 戚 壕伸聖 紫遂馬奄 是敗. static戚 蒸生檎 main拭辞 紫遂拝 呪亜 蒸製.
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;//idx=0;
	
	public static void main(String[] args) {
	 boolean run=true;
	 while(run) {
		 System.out.println("--------------------------------------");
		 System.out.println("1.域疎持失 |2.域疎鯉系 |3.森榎 |4.窒榎|5.曽戟");
		 System.out.println("--------------------------------------");
		 System.out.println("識澱>");
		 
		 int selectNo = scanner.nextInt();
		 switch(selectNo) {
		 case 1: createAccount(); break;
		 case 2: accountList();break;
		 case 3: deposit();  break;
		 case 4: withdraw(); break;
		 case 5: run=false;  break;
		 }
	 }
	 System.out.println("覗稽益轡 曽戟");
		
	}
	
	//域疎持失馬奄
	private static void createAccount() {
		System.out.println("------");
		System.out.println("域疎持失");
		System.out.println("------");
		System.out.print("域疎腰硲:");
		String ano = scanner.next();
		System.out.print("域疎爽:");
		String owner = scanner.next();
		System.out.print("段奄脊榎衝:");
		int balance = scanner.nextInt();
		
		Account acc = new Account(ano, owner, balance);
		
		//[Account][Account][Account][][][][][][][][][][][][][][][][]...[]
		
		accountArray[idx++] = acc;
		
		System.out.println("衣引:域疎亜 持失鞠醸柔艦陥.");
	}
	//域疎鯉系左奄
	private static void accountList() {
		System.out.println("------");
		System.out.println("域域疎鯉系");
		System.out.println("------");
		
		//梓端 凧繕展脊 壕伸聖 授託旋生稽 石生檎辞 凧繕痕呪亜 null戚 焼諌凶幻 窒径.
		 for(int i=0;i<accountArray.length;i++) { //神嫌降持
			 Account account =accountArray[i];
			 if(account!=null) {
				 System.out.println("域疎腰硲:"+account.getAno());
				 System.out.println("域疎爽:"+account.getOwner());
				 System.out.println("接壱:"+account.getBalance());
				// System.out.println(account.toString()); //null稽 鞠嬢赤澗 凧繕痕呪税 葵聖 toString()生稽 石生檎 nullPointer神嫌降持
			 }
		  }
	}
	
	//森榎馬奄
	private static void deposit() {
		System.out.println("------");
		System.out.println("森榎");
		System.out.println("------");
		System.out.print("域疎腰硲");
		String ano = scanner.next();
		System.out.print("森榎衝");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
            System.out.println("衣引:森榎戚 失因鞠醸柔艦陥.");
		}else {
			System.out.println("衣引:域疎腰硲研 溌昔背爽室推.");
		}
	}
     //窒榎馬奄	
	private static void withdraw() {
		System.out.println("------");
		System.out.println("窒榎");
		System.out.println("------");
		System.out.print("域疎腰硲");
		String ano = scanner.next();
		System.out.print("窒榎衝");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.println("衣引:窒榎戚 失因鞠醸柔艦陥.");
			}else {
				System.out.println("衣引:接壱亜 採膳杯艦陥.");
			}
		}else {
			System.out.println("衣引:域疎腰硲研 溌昔背爽室推.");
		} 
	}
     // [Account][Account][null][null][Account][null].....[null]
	//Account 壕伸拭辞 ano人 疑析廃 Account 梓端 達奄-
	//凧繕展脊 壕伸税 葵 搾嘘
	private static Account findAccount(String ano) {
		Account account=null;//稽鎮痕呪
		for(int i=0;i<accountArray.length;i++) {
			  account =accountArray[i];
			if(account!=null) {  
			  if(account.getAno().equals(ano))
				break;//ano拭 背雁馬澗 梓端 軒渡
			}
		}
		return account;	//壕伸 穿端研 達焼亀 蒸生檎 null軒渡
	}
}