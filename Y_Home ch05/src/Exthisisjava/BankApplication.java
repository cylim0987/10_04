package Exthisisjava;

import java.util.Scanner;

public class BankApplication {ししししししし
//域疎級聖 煽舌拝 呪 赤澗 煽舌社研 幻級嬢醤 廃陥.
//	Account梓端研 食君鯵 煽舌拝 呪 赤澗 展脊精 壕伸戚陥.
//	Account 壕伸聖 耕軒 琶球稽 識情背兜澗陥.
	private static Account[] accountArray = new Account[100]; // new!!!!!!!! 竺誤.20歳戚穿
			//static 戚政澗 main拭辞 戚 壕伸聖 紫遂馬奄 是敗. static戚 蒸生檎 main拭辞 紫遂拝 呪亜 蒸製.

	//徹左球稽採斗 脊径聖 閤焼醤馬艦猿 Scanner研 彰陥.
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) { //叔楳聖 背醤馬奄 凶庚拭 mai1n五社球研 幻級嬢層陥.
		//五昔戚虞澗 五社球拭辞
		boolean run = true; // run戚虞澗 稽鎮痕呪澗 嬢巨辞 紫遂戚 鞠劃檎 while庚生稽 run戚 闘欠亜 鞠檎 鋼差, false檎 匙閃蟹亜惟.
		while(run) {//坦製拭 boolean戚 闘欠艦亜 訓戚 域紗 疑拙廃陥.
			 System.out.println("--------------------------------------");
			 System.out.println("1.域疎持失 |2.域疎鯉系 |3.森榎 |4.窒榎|5.曽戟");
			 System.out.println("--------------------------------------");
			 System.out.println("識澱>");
			
			 //1,2,3 ..聖 閤焼醤 廃陥.
			 int selectNo = scanner.nextInt(); // 戚 角獄亜 嬢恐 葵聖 亜走壱 赤汗劃拭 魚虞.
			 
			 if(selectNo == 1) {
				 createAccount(); //虞澗 五社球研 硲窒馬亀系. 五昔五社球拭辞 郊稽 硲窒梅奄 凶庚拭 static生稽 舛税背醤廃陥.
			 }else if(selectNo == 2) {
				 accountList(); //
			 }else if(selectNo == 3) {
				 deposit();
			 }else if(selectNo == 4) {
				 withdraw();
			 }else if(selectNo == 5) {
				 run = false; //run戚 false檎 曽戟艦猿. 5腰精 曽戟艦猿.
			 }
			 
		}
		System.out.println("覗稽益轡 曽戟"); //while庚 掻胤硲. 人析庚 郊甥.
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		//食奄 五社球鎧遂聖 辰趨醤廃陥.
		System.out.println("----------");
		System.out.println("窒榎");
		System.out.println("----------");
		System.out.println("域疎腰硲");
		String ano = scanner.next();
		System.out.println("窒榎衝: ");
		int money = scanner.nextInt();
		
		//紫遂切亜 脊径廃 域疎人 疑析廃 梓端研 壕伸拭辞 達焼人醤 廃陥.
		Account account = findAccount(ano); //find虞澗 五社球研 硲窒背辞. 戚 五社球税 古鯵葵生稽 達壱切馬澗 ano(a,number虞澗倶)葵聖 角移爽檎 聡 a角獄葵拭 背雁馬澗 嬢朝錘闘亜 軒渡鞠嬢閃蟹神亀系.
	
		//達紹陥檎,
		if(account == null) { // 公 達紹陥檎. //幻鉦 達走 公馬壱 null聖 軒渡馬澗 井酔. . /for庚拭辞 壕伸税 掩戚幻鏑 鋼差馬澗汽 魁猿走 鋼差聖 背亀. a角獄人 疑析廃 account梓端舛左人 疑析廃 梓端研 公 達紹陥檎 account澗 域紗 null雌殿稽 害焼赤陥. null雌殿亜 域紗 害焼赤嬢辞 for庚聖 域紗 叔楳馬壱, a角獄人 疑析廃 杏 達走 公梅聖 井酔. null昔 雌殿稽 軒渡.
			System.out.println("衣引: 域疎亜 蒸柔艦陥.");//ano拭 背雁馬澗 域疎研 公 達紹陥檎.
			return; //五社球 叔楳 曽戟
		}
		account.setBalance(account.getBalance() - money); //窒榎精 - 原戚格什.
		System.out.println("衣引: 窒榎戚 失因鞠醸柔艦陥.");
		
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		System.out.println("----------");
		System.out.println("森榎");
		System.out.println("----------");
		System.out.println("域疎腰硲");
		String ano = scanner.next();
		System.out.println("森榎衝: ");
		int money = scanner.nextInt();
		
		//紫遂切亜 脊径廃 域疎人 疑析廃 梓端研 壕伸拭辞 達焼人醤 廃陥.
		Account account = findAccount(ano); //find虞澗 五社球研 硲窒背辞. 戚 五社球税 古鯵葵生稽 達壱切馬澗 ano(a,number虞澗倶)葵聖 角移爽檎 聡 a角獄葵拭 背雁馬澗 嬢朝錘闘亜 軒渡鞠嬢閃蟹神亀系.
	
		//達紹陥檎,
		if(account == null) { // 公 達紹陥檎. //幻鉦 達走 公馬壱 null聖 軒渡馬澗 井酔. . /for庚拭辞 壕伸税 掩戚幻鏑 鋼差馬澗汽 魁猿走 鋼差聖 背亀. a角獄人 疑析廃 account梓端舛左人 疑析廃 梓端研 公 達紹陥檎 account澗 域紗 null雌殿稽 害焼赤陥. null雌殿亜 域紗 害焼赤嬢辞 for庚聖 域紗 叔楳馬壱, a角獄人 疑析廃 杏 達走 公梅聖 井酔. null昔 雌殿稽 軒渡.
			System.out.println("衣引: 域疎亜 蒸柔艦陥.");//ano拭 背雁馬澗 域疎研 公 達紹陥檎.
			return; //五社球 叔楳 曽戟
		}
		account.setBalance(account.getBalance() + money); //奄糎 接壱税 葵精 getbalance稽 条聖 呪 赤壱,
		System.out.println("衣引: 脊榎戚 失因鞠醸柔艦陥.");
	}

	private static Account findAccount(String ano) {//五社球 識情採, 是拭暗 喚君辞 条製.
		// TODO Auto-generated method stub
		Account account = null; //account虞壱 馬澗 梓端研 達焼醤馬艦猿 account痕呪研 識情馬壱,
		
		for(int i=0; i<accountArray.length; i++) { //穿端 壕伸税 掩戚幻鏑 鋼差.
			if(accountArray[i] != null) { // i梓端拭 級嬢亜赤澗 葵戚 null戚 焼諌 井酔
				String dbAno = accountArray[i].getAno(); //煽舌鞠嬢赤澗 嬢朝錘闘税 a角獄研 石嬢沙陥. i角獄属拭 赤澗 ano研 石嬢辞. getAno()拭 煽舌廃陥.
				if(dbAno.equals(ano)) {//dbAno櫛 ano亜 旭陥檎,
					account = accountArray[i];
					break;
				}
			}
		}
		return account; //嬢朝錘闘亜 凧繕馬澗 梓端腰走研 軒渡馬亀系. 
	}

	private static void accountList() {
		// TODO Auto-generated method stub
		System.out.println("------");
		System.out.println("域疎鯉系");
		System.out.println("------");
		//紫遂切稽採斗 脊径閤澗 鎧遂戚 蒸生艦 for稽 郊稽 娃陥.
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i]; //嬢朝錘闘税 i腰仙依聖 条嬢鎧嬢辞
			if(account != null) { // 嬢朝錘闘 梓端亜 null戚 焼艦虞檎, 益君艦猿 煽舌戚 鞠嬢赤陥檎.
				 System.out.println("域疎腰硲:"+account.getAno()); //get戚 更心走????????????????????
				 System.out.println("域疎爽:"+account.getOwner()); //琶球亜 private戚虞辞 郊稽 羨悦拝 呪 蒸壱 getter研 搭背辞 private葵聖 軒渡閤焼辞 紫遂.
				 System.out.println("接壱:"+account.getBalance());
				 System.out.println();
				// System.out.println(account.toString()); //null稽 鞠嬢赤澗 凧繕痕呪税 葵聖 toString()生稽 石生檎 nullPointer神嫌降持
				
			}
		}
	}

	//五社球
	private static void createAccount() { // 是拭 createAccount 刊牽檎 切疑旋生稽 五社球亜 幻級嬢遭陥. 戚暗 五社球績.
		// TODO Auto-generated method stub
		System.out.println("------");
		System.out.println("域疎持失");
		System.out.println("------");
		System.out.print("域疎腰硲:");
		String ano = scanner.next(); //紫遂切亜 脊径馬檎 scanner税 next(及拭 蒸澗 依精 庚切伸戚奄 ??庚拭.)虞澗 五社球稽 脊径吉 庚切研 閤製.
		System.out.print("域疎爽:");
		String owner = scanner.next();
		System.out.print("段奄脊榎衝:");
		int balance = scanner.nextInt();//脊径吉 葵戚 収切艦猿 nextInt稽.
		
		Account newAccount = new Account(ano, owner, balance); //馬蟹税 域疎梓端研 幻糾.
		//戚 梓端研 嬢巨拭 煽舌拝暗劃. 煽 是拭 嬢朝錘闘 壕伸拭 煽舌聖 廃陥. 壱形背醤拝 依.;
		//壕伸.壕伸精 0腰採斗 獣拙廃陥. 戚 壕伸 展脊戚 適掘什展脊戚奄 凶庚拭 null展脊生稽 陥 級嬢亜赤陥. 		
		//index1税 梓端研 肢薦馬檎 null戚 吉陥.... 益掘辞 蒋生稽 煽舌拝 凶 null是帖拭 煽舌背醤廃陥.
//		3腰猿走 隔醸陥壱 馬希虞亀. 嬢恐 域疎研 肢薦馬檎 益 域疎亜 null戚 鞠艦猿.
//		null梓端研 達焼辞 持失馬亀系 馬澗 依戚 疏陥. 1腰戚 搾嬢赤澗汽 4腰拭陥 隔生檎
//		原走厳 99腰属 陥製採斗澗 梓端 煽舌聖 公敗. 益掘辞 搾嬢赤澗 因娃拭 胡煽 背操醤 反晴旋戚陥.
//		益掘辞 for庚生稽.
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {//accountArray税 i腰属亜 null昔亜研 繕紫馬澗
				//依.搾嬢赤澗 員聖 繕紫.
				accountArray[i] = newAccount; //搾嬢赤澗 員拭 煽舌聖 廃陥.
				System.out.println("衣引: 域疎亜 持失鞠醸柔艦陥.");
				break; //企脊聖 馬檎 煽舌戚 魁貝暗艦猿 for庚聖 匙閃蟹身.
		}
	}
	}
}

//汽球坪球.....i++ {} 胤硲 設 左奄.