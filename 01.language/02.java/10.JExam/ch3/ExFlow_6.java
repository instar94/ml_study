//package
package a.b.c.ch3;
//import

public class ExFlow_6{

	//���
	//�������
	//������

	//�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.
		
		//while��
		//���ǽ� ()�� ���� true�� ��� �ݺ��Ѵ�.
		//���ǽ� ()�� ���� false�� ��� �۵����� �ʴ´�.
		//���ߴ� Ű����(break)�� �־�߸� �Ѵ�.
		while (true){
			System.out.println("while >>>>>");

			if(true){
				break;
			}//end of if��
		}//end of while��
		
		/*
		�ƿ� ������ ���� ����
		-> ��µǴ� ���� ����
		while (false){
			System.out.println("while>>>>:");
		}
		*/
		
		//do while ()
		//��������Ʈ ����� (������ �Ʒ��� ���ʴ�� ������)
		//while������ while(false)�� ��� �ƿ� �۵��� ���� ����=> �ƿ� �۵�X
		//do while������ while(false)�� 1�� �۵��ϰ� ������. => �۵� 1ȸ��
		do{
			System.out.println("do>>>>>>: ");
		}
		while (false);
	}//end of main �Լ�
}//end of ExFlow_6 Ŭ����