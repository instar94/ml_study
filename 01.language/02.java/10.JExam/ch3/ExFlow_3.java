//package
package a.b.c.ch3;
//import

public class ExFlow_3{
	//���
	//�������
	//������
	
	//�Լ�
	
	//main() �Լ� : ���α׷� ������
	public static void main(String[] args){ 
		//TODO Auto-generated method stub.
		
		//���ʵ������� �������� int age ����
		//���� 9�� �ʱ�ȭ
		int age =9;
		//������������ �������� charge ���� 
		int charge; //<=�ʱ�ȭ X

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
		}else{
			charge = 3000;//<=charge �� �ʱ�ȭ
			System.out.println("�����Դϴ�.");
		}

		System.out.println("������"+ charge +"�� �Դϴ�.");
	}//end of main �Լ�
}//end of ExFlow_3 Ŭ����
