//package
package a.b.c.ch3;

//import

public class ExFlow_5{

	//���
	//�������
	//������

	//�Լ�

	//main() �Լ� : ���α׷� ������
	public static void main(String[] args) 
	{//TODO Auto-generated method stub.
	System.out.println("ExFlow_5.main�Լ� ����>>>>>>");
	
	//�����ڷ��� �������� ranking ���� �� 1�� �ʱ�ȭ
	int ranking = 1;
	//�����ڷ��� �������� medalColor ���� �� ����Ʈ ������ �ʱ�ȭ
	char medalColor = '\u0000'; //<- �����ڵ�� ' '�� �ʱ�ȭ

	/*
	switch
		switch : case�� �б��ϴ� �б⹮ : if ���� ������ ����� ����
		() : ���ǽ� jdk1.7 �������� ���ڸ� ��� ����������, 
		    1.7���ʹ� ���� ���ڿ� ��� ����
		case : ���ǽ��� ���� case Ű������ ���� ������ case�� �ִ� ǥ���� ����
		break : �� ���� Ȥ�� ���� �����ÿ�
		default : if���� else�� ���� ����
		
		switch���� ���Ǵ� Ư���� �κ��� �ִ�.
	*/
	switch(ranking){
		
		case 1: medalColor = 'G';
				break;
		case 2: medalColor = 'S';
				break;
		case 3: medalColor = 'B';
				break;
		default: //if���� else ������ �Ѵ�.
				medalColor = 'A';
	}//end of switch��
	System.out.println(ranking + "������ �޴� ���� " +medalColor);
	
	//�������� ranking�� 3���� �ʱ�ȭ
	ranking =3;
	System.out.println("ranking ��>>>>>"+ranking);
	//�������� + �������� String ���� �� ����Ʈ��("")�� �ʱ�ȭ
	//���������� �׻� �ʱ�ȭ �Ұ�
	String mColor="";
	switch (ranking){

		case 1: mColor = "�ݸ޴�";
				break;
		case 2: mColor = "���޴�";
				break;
		case 3: mColor = "���޴�";
				break;
		default :
				mColor = "�Ϲݸ޴�";
	
	}//end of switch ��
	
	System.out.println(ranking + "�� �̹Ƿ� "+mColor+"�Դϴ�.");

	//���ǹ����� ���ڿ� ��� (jdk 1.7���� ��밡��)
	String medal = "GOLD";
	switch (medal){
	
		case "GOLD":
				System.out.println("�ݸ޴� �Դϴ�.");
				break;
		case "SILVER":
				System.out.println("���޴� �Դϴ�.");
				break;
		case "BRONZE":
				System.out.println("���޴� �Դϴ�.");
				break;
		default:
				System.out.println("������ �Դϴ�.");
				break;
		}//end of switch ��

		System.out.println("ExFlow_5.main�Լ� ��>>>>>>");
	}//end of main �Լ�
}//end of ExFlow5 Ŭ����
