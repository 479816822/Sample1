import java.util.Scanner;

public class Luck {
	public static void main(String[] args) {

		String [] userName =new String[10];  //最多可以有十个用户
		String [] upName = new String[10]; // 登陆名  最多有十个用户但同一个用户最多注册三个
		String []passWord =new String[10];
		String name = "";
		int[] Id=new int[10];
		
		String upPass = "";   
		String upname = "";
		
		int number=0;  //用来记录当前注册的人数最大为三
		
		int [] upPeoplename=new int[10];  //用来记录登记已经登陆的人false没有登陆true登陆
		
		
		int numbers=0;   //用来记录已经登陆成功的人数
		
		
		int count=1;   //用来记录登陆输入密码或用户名错误的次数
		int choice = 0;

		int luckNumber[] = new int[5];
		int i;
		i = 0;

		String choice1;


		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("*******欢迎进入奖客富翁系统*******");
			System.out.println("            1.注册");
			System.out.println("            2.登陆");
			System.out.println("            3.抽奖");
			System.out.println("*********************************");

			System.out.print("请选择菜单：");
			choice = input.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				// 注册
				
				
				
				System.out.println("[奖客富翁系统>注册]");
				
				if (number<10) {
					
					String name1=" ";
					
					String name2=" ";
					
					
			
				System.out.println("请输入个人的信息：");
				System.out.println("请输入你的名字：");				
				name1=input.next();
				
				boolean T=false;
				//	当用户名注册过时不能注册
				for (int j = 0; j < number; j++) {
					if(name1.equals(userName[j])){
						T=true;   //T=true说明不能注册
						break;
					}
				}
				if(T){
					System.out.println("你的名字已经注册，不能再注册！");
					break;
				}
				
				
				while(!T){
				System.out.print("请输入你的用户名：");
				name2 = input.next();
				System.out.println();
				
				T=false;
				//	当用户名注册过时不能注册
				for (int j = 0; j < number; j++) {
					if(name2.equals(upName[j])){
						T=true;   //T=true说明不能注册
						break;
					}
				}
				if(T){
					System.out.println("你的用户已经注册，请重新输入新的用户名！");
				}
				T=!T;
				}
				System.out.print("输入你的登录密码: ");
				passWord[number] = input.next();
				System.out.println();
				userName[number]=name1;
				upName[number]=name2;

				Id[number] = (int) (10000 * Math.random());

				System.out.println("注册成功!  请记住你的会员卡号");
				System.out.println("用户名	     密码		  会员卡号");
				System.out.println(name2 + "		" + passWord[number] + "		" + Id[number]);
				number++;
				
				}
				else{
					System.out.println("对不起！注册的人数已满！");
				}
				

				break;
			case 2:
				// 登陆
				
				
				while(count<=3 ){
				System.out.println("[奖客登陆系统>登陆]");
				System.out.println("请输入你的用户名：");
				name = input.next();

				System.out.print("请输入你的登陆密码:");
				upPass = input.next();

				boolean T=false;  //当T=true时登陆成功
				int j=0;
				for (j = 0; j < number; j++) {
					
					
					if ((name.equals(upName[j])) && (upPass.equals(passWord[j]))) {
						
						boolean T3=false;  //使用的局部变量，判断是否已经登陆过
						for (int j2 = 0; j2 < numbers; j2++) {
							if(upPeoplename[j2]==Id[j]){
								T3=true;
								break;
								
							}
							
						}
						if(T3){
							break;
						}
						
						System.out.println("欢迎你：" + name);
						//登陆成功时numbers++
						upPeoplename[numbers]=Id[j];       //使用登陆人的Id来判断每个人是不是已经登陆过了
						
						numbers++;
						
						T=true;
						break;
						
					} 
				}
				if(T){
					break;
				}
				else if (name.equals(upName[j]) == false) {
					System.out.println("你的登录名错误，请重新登录");
					System.out.println("你已经登录了" + count+ "次" + "你还有"
							+ (3 - count) + "次机会");
					count++;

				} else if(upPass.equals(passWord[j])==false){
					System.out.println("你的密码错误，请重新登陆！");
					System.out.println("你已经登录了" + count + "次" + "你还有"
							+ (3 - count) + "次机会");
					count++;

				}else{
					System.out.println("你已经登陆过了，不需要重新登陆！");
					break;
				}
				
				
				}
				
				break;
			case 3:
				// 抽奖
				
				int ID=0;
				System.out.println("[奖客富翁系统>抽奖]");
				System.out.print("请输入你的会员卡号:");
				ID=input.nextInt();
				System.out.println();
				
				boolean T=false;  //当T=false时提示你没有登陆需要登录才能够参加抽奖
				for (int j = 0; j < numbers; j++) {
					if(Id[j]==ID){
						T=true;
						
					}
				}
				if(!T){
					System.out.println("你还没有登陆，需要先登录，才能参加抽奖!");
					break;
				}
				

				for (int j = 0; j < 5; j++) {
					luckNumber[j] = (int) (10000 * Math.random());
					for (int j2 = 0; j2 < j; j2++) {
						if(luckNumber[j]==luckNumber[j2]){
							j--;
							break;
						}
						
							
					}
				

				}

				System.out.print("今天的幸运数字是:  ");
				for (int j2 = 0; j2 < luckNumber.length; j2++) {
					System.out.println(luckNumber[j2] + "  ");
				}

				for (i = 0; i < luckNumber.length; i++) {
					if (luckNumber[i] == ID) {
						System.out.println("恭喜你！你是今日的数字幸运之星！");
						break;
					}
				}

				if (i == 5) {
					System.out.println("抱歉！你不是今日的数字之星！");
				}
				System.out.println("\n");
				break;

			default:
				// 输入不对
				System.out.println("你的选择错误，请重新的选择：");
				break;
			}
			// 用来检查用户登录时，用户输入密码的次数，如果大于三次则退出这次登陆

			if (count > 3) {
				System.out.println("对不起！ 你的密码输入错误三次，请找回密码明天再登陆！！！");
				break;
			}


			
			boolean T1=false;
			boolean T2=false;
			
			while(true){
				// 用来提示用户接下来的操作，继续或退出
				System.out.print("继续吗？ (Yes/No)");
				choice1 = input.next();
				
				
			if (choice1.equals("Yes")) {
				System.out.println();
				T1=true;
				break;
			} 
			else if (choice1.equals("No")) {
				System.out.println("系统退出，谢谢使用！");
				T2=true;
				break;
			}
			else{
				System.out.println("请输入'Yes' 或  'No'");
			}
			}
			
			if(T1){
				
			}
			else{
				break;
			}
			
			
		}	
	}

}
