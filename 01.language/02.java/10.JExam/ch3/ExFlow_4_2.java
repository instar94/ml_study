//package
package a.b.c.ch3;
//import
import java.util.Scanner;

public class ExFlow_4_2{
	//���
	//�������
	//������
	
	//�Լ�
	//public : ��� ��Ű������ ��� ����
	//void : return ��� �Ұ���
	//�Ϲ��� �Լ� - �������� ����ؾ���
	//ticketFee : ����� ���� �Լ���
	//int age : ������ �Ű�����
	public void ticketFee(int age){
		System.out.println("ticketFee �Լ� ���� >>>");

		//���ʵ������� �������� int charge ����
		int charge; //<-�ʱ�ȭ ���� ����

		if (age > 0 && age <100){
			if(age < 8){
				charge = 1000;
				System.out.println("������ �Ƶ� �Դϴ�");
			}else if (age <14){
				charge = 2000;
				System.out.println("�ʵ��л� �Դϴ�");
			}else if (age<20){
				charge = 2500;
				System.out.println("�߰���л� �Դϴ�.");
			}else if (age>=60){
				charge = 0;
				System.out.println("��ο�� �Դϴ�.");
			}else{
				charge=3000;
				System.out.println("���� �Դϴ�.");
			}
			System.out.println("������ " + charge +"�� �Դϴ�.");
		}else{
			System.out.println("�����͸� Ȯ�����ּ���");
		}
		System.out.println("ticketFee �Լ� �� >>>");
	}//end of ticketFee �Լ�
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		System.out.println("main �Լ� ���� >>>");
		
		System.out.println("���̸� �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		ExFlow_4_2 ef42 = new ExFlow_4_2();
		ef42.ticketFee(age);

		System.out.println("main �Լ� ��>>>");
	}//end of main �Լ�
}//end of ExFlow_4_2 Ŭ����
