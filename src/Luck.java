import java.util.Scanner;

public class Luck {
	public static void main(String[] args) {

		String [] userName =new String[10];  //��������ʮ���û�
		String [] upName = new String[10]; // ��½��  �����ʮ���û���ͬһ���û����ע������
		String []passWord =new String[10];
		String name = "";
		int[] Id=new int[10];
		
		String upPass = "";   
		String upname = "";
		
		int number=0;  //������¼��ǰע����������Ϊ��
		
		int [] upPeoplename=new int[10];  //������¼�Ǽ��Ѿ���½����falseû�е�½true��½
		
		
		int numbers=0;   //������¼�Ѿ���½�ɹ�������
		
		
		int count=1;   //������¼��½����������û�������Ĵ���
		int choice = 0;

		int luckNumber[] = new int[5];
		int i;
		i = 0;

		String choice1;


		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("*******��ӭ���뽱�͸���ϵͳ*******");
			System.out.println("            1.ע��");
			System.out.println("            2.��½");
			System.out.println("            3.�齱");
			System.out.println("*********************************");

			System.out.print("��ѡ��˵���");
			choice = input.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				// ע��
				
				
				
				System.out.println("[���͸���ϵͳ>ע��]");
				
				if (number<10) {
					
					String name1=" ";
					
					String name2=" ";
					
					
			
				System.out.println("��������˵���Ϣ��");
				System.out.println("������������֣�");				
				name1=input.next();
				
				boolean T=false;
				//	���û���ע���ʱ����ע��
				for (int j = 0; j < number; j++) {
					if(name1.equals(userName[j])){
						T=true;   //T=true˵������ע��
						break;
					}
				}
				if(T){
					System.out.println("��������Ѿ�ע�ᣬ������ע�ᣡ");
					break;
				}
				
				
				while(!T){
				System.out.print("����������û�����");
				name2 = input.next();
				System.out.println();
				
				T=false;
				//	���û���ע���ʱ����ע��
				for (int j = 0; j < number; j++) {
					if(name2.equals(upName[j])){
						T=true;   //T=true˵������ע��
						break;
					}
				}
				if(T){
					System.out.println("����û��Ѿ�ע�ᣬ�����������µ��û�����");
				}
				T=!T;
				}
				System.out.print("������ĵ�¼����: ");
				passWord[number] = input.next();
				System.out.println();
				userName[number]=name1;
				upName[number]=name2;

				Id[number] = (int) (10000 * Math.random());

				System.out.println("ע��ɹ�!  ���ס��Ļ�Ա����");
				System.out.println("�û���	     ����		  ��Ա����");
				System.out.println(name2 + "		" + passWord[number] + "		" + Id[number]);
				number++;
				
				}
				else{
					System.out.println("�Բ���ע�������������");
				}
				

				break;
			case 2:
				// ��½
				
				
				while(count<=3 ){
				System.out.println("[���͵�½ϵͳ>��½]");
				System.out.println("����������û�����");
				name = input.next();

				System.out.print("��������ĵ�½����:");
				upPass = input.next();

				boolean T=false;  //��T=trueʱ��½�ɹ�
				int j=0;
				for (j = 0; j < number; j++) {
					
					
					if ((name.equals(upName[j])) && (upPass.equals(passWord[j]))) {
						
						boolean T3=false;  //ʹ�õľֲ��������ж��Ƿ��Ѿ���½��
						for (int j2 = 0; j2 < numbers; j2++) {
							if(upPeoplename[j2]==Id[j]){
								T3=true;
								break;
								
							}
							
						}
						if(T3){
							break;
						}
						
						System.out.println("��ӭ�㣺" + name);
						//��½�ɹ�ʱnumbers++
						upPeoplename[numbers]=Id[j];       //ʹ�õ�½�˵�Id���ж�ÿ�����ǲ����Ѿ���½����
						
						numbers++;
						
						T=true;
						break;
						
					} 
				}
				if(T){
					break;
				}
				else if (name.equals(upName[j]) == false) {
					System.out.println("��ĵ�¼�����������µ�¼");
					System.out.println("���Ѿ���¼��" + count+ "��" + "�㻹��"
							+ (3 - count) + "�λ���");
					count++;

				} else if(upPass.equals(passWord[j])==false){
					System.out.println("���������������µ�½��");
					System.out.println("���Ѿ���¼��" + count + "��" + "�㻹��"
							+ (3 - count) + "�λ���");
					count++;

				}else{
					System.out.println("���Ѿ���½���ˣ�����Ҫ���µ�½��");
					break;
				}
				
				
				}
				
				break;
			case 3:
				// �齱
				
				int ID=0;
				System.out.println("[���͸���ϵͳ>�齱]");
				System.out.print("��������Ļ�Ա����:");
				ID=input.nextInt();
				System.out.println();
				
				boolean T=false;  //��T=falseʱ��ʾ��û�е�½��Ҫ��¼���ܹ��μӳ齱
				for (int j = 0; j < numbers; j++) {
					if(Id[j]==ID){
						T=true;
						
					}
				}
				if(!T){
					System.out.println("�㻹û�е�½����Ҫ�ȵ�¼�����ܲμӳ齱!");
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

				System.out.print("���������������:  ");
				for (int j2 = 0; j2 < luckNumber.length; j2++) {
					System.out.println(luckNumber[j2] + "  ");
				}

				for (i = 0; i < luckNumber.length; i++) {
					if (luckNumber[i] == ID) {
						System.out.println("��ϲ�㣡���ǽ��յ���������֮�ǣ�");
						break;
					}
				}

				if (i == 5) {
					System.out.println("��Ǹ���㲻�ǽ��յ�����֮�ǣ�");
				}
				System.out.println("\n");
				break;

			default:
				// ���벻��
				System.out.println("���ѡ����������µ�ѡ��");
				break;
			}
			// ��������û���¼ʱ���û���������Ĵ�������������������˳���ε�½

			if (count > 3) {
				System.out.println("�Բ��� �����������������Σ����һ����������ٵ�½������");
				break;
			}


			
			boolean T1=false;
			boolean T2=false;
			
			while(true){
				// ������ʾ�û��������Ĳ������������˳�
				System.out.print("������ (Yes/No)");
				choice1 = input.next();
				
				
			if (choice1.equals("Yes")) {
				System.out.println();
				T1=true;
				break;
			} 
			else if (choice1.equals("No")) {
				System.out.println("ϵͳ�˳���ллʹ�ã�");
				T2=true;
				break;
			}
			else{
				System.out.println("������'Yes' ��  'No'");
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
