//package
package a.b.c.ch3;
//import

public class  ExFlow_2{
	//���
	//�������
	//������
	
	//�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		System.out.println("�����Ͱ� �� ����� ���>>>>>>>");
		//�����ڷ��� (int) �������� age ����
		//age�� ���ͷ� 7�� �ʱ�ȭ
		int age = 7;

		//if�� ���� : ()�� ���ǹ��� true���� �۵�
		if (age >=8){
			System.out.println("�б��� �ٴմϴ�.");
		//()�� ������ false�� ��� else �۵�
		}else{
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}//end of if ��

		//�����ڷ���(boolean) ��������bool ���� 
		//bool�� ������  age>=8 �� �ʱ�ȭ <-age�� ȣ��
		boolean bool = age>=8;
		System.out.println("bool >>> :" +bool);
		//if�� ���� : ()�� ���ǹ��� true���� �۵�
		if(bool){
			System.out.println("�аܿ� �ٴմϴ�.");
		//()�� ������ false�� ��� else �۵�
		}else{
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}//end of if��
	}//end of main �Լ�
}//end of ExFlow_2 Ŭ����
