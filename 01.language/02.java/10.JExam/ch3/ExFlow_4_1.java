//package
package a.b.c.ch3;
//import
//
import java.util.Scanner;

public class ExFlow_4_1{
	//���
	//�������
	//������
	
	//�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		System.out.println("���̸� �Է����ּ���>>>");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		int charge;

		if(age > 0 && age < 100){

		//if�� : ()�� ������ true �� ��� ����
		if (age < 8){
			charge = 1000;//<=charge �� �ʱ�ȭ
			System.out.println("���� �� �Ƶ��Դϴ�.");
		//else if if�� ������ �ȵȴٸ� �״��� ������ �ο�
		//�ش� ������ true�̸� �����
		}else if (age < 14){
			charge = 2000;//<=charge �� �ʱ�ȭ
			System.out.println("�ʵ��л��Դϴ�.");
		}else if(age < 20){
			charge = 3000;//<=charge �� �ʱ�ȭ
			System.out.println("��-����л��Դϴ�.");
		//else : if�� else if�� ������ ��� false �϶� ����
		}else if(age>= 60){
			charge =0;
			System.out.println("��ο���Դϴ�.");
		}else{
			charge = 3000;//<=charge �� �ʱ�ȭ
			System.out.println("�����Դϴ�.");
		}
		System.out.println("������"+ charge +"�� �Դϴ�.");

		}else{
			System.out.println("�����͸� Ȯ�����ּ���");
		}
	}//end of main �Լ�
}//end of ExFlow_3 Ŭ����
