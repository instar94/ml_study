// package
package a.b.c.ch3;

// import
import java.util.Scanner;

/*
java.util.Scanner
int nextInt()
���� 1�� 100�� 
age ������ 60�� �̻��� ��쿡 '��ο���Դϴ�.' '������ 0���Դϴ�.'
*/

public class ExFlow_4_2 
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public void ticketFun(int age){
		System.out.println("\n ExFlow_4_2.ticketFun() �Լ� ���� >>> : \n");	
		System.out.println("ExFlow_4_2.ticketFun :: age >>> : " + age);	
		
		int charge;

		if (age < 8)
		{
			charge = 1000;
			System.out.println("���� �� �Ƶ��Դϴ�.");
		}
		else if (age < 14)
		{
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if (age < 20)
		{
			charge = 2500;
			System.out.println("��, ����л��Դϴ�.");
		}
		else if (age >= 60)
		{
			charge = 0;
			System.out.println("��ο���Դϴ�.");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ����Դϴ�.");			
		}

		System.out.println("������ " + charge + "���Դϴ�.");

		System.out.println("\n ExFlow_4_2.ticketFun() �Լ� ���� >>> : \n");	
	}


	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExFlow_4_2.main() �Լ� ���� >>> : \n");	

		System.out.println("���̸� �Է��Ͻÿ� !!");		
		Scanner sc = new Scanner(System.in); // jdk 1.5
		
		int age = sc.nextInt();
		System.out.println("age >>> : " + age);	

		if (1 <= age && age <= 100)
		{
			ExFlow_4_2 ef42 = new ExFlow_4_2();
			ef42.ticketFun(age);
				
		}else{
			System.out.println("���̸� �� �Է��Ͻÿ� !!");
		}
		
		System.out.println("\nExFlow_4_2.main() �Լ� �� >>> : ");	
	}
}
