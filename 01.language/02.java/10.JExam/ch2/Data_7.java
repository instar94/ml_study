package	a.b.c.ch2;

public class Data_7{

	public static void main(String[] args){
	
	/*
	�������� : �Լ� ������ �����ϴ� ����
	���������� �Լ������� �¾ �Լ����� ���ư���.
	���������� �Լ� ���� ���� �� ����

	���������� ����ϱ� �ݵ�� �ǵ������� default ������ �ʱ�ȭ �Ǿ�� �Ѵ�.
	�ʱ�ȭ : ���� ���� �� ���ʷ� ������ �����ϴ� ����

	���������� �ʱ�ȭ�� �� �������� ����Ʈ ������ �ʱ�ȭ <- ������ �� �̿��ϴ� ���
	���������� �ʱ�ȭ�� ����� ���ÿ� default value�� �ʱ�ȭ �ȴ�. <- ������ �� �̿��ϴ� ���
	*/

	//�����ڷ����� �������� �ʱ�ȭ
	byte b =0;
	char c =' ';//�̱������̼� (���� ���� �� ���� ����)�� �ʱ�ȭ
	short s =0; 
	int i =0;
	float f=0.0f; //float �� �Ǽ��� f�� ����
	double d =0.0d; //double�� �Ǽ��� d�� ����
	boolean bool=false;
	String sVal1=""; //String ���ڿ��� "" : ���������̼Ƿ� �ʱ�ȭ
	String sVal2=null; //String ���ڿ��� null�� �ʱ�ȭ


	//Data_7 d7 =new Data_7();
	//=>������� �϶� �ʿ�������...�Լ� ���� �ִ� ���������̱� ������ �ʿ����

		System.out.println("b >>> : " + b);
		System.out.println("c >>> : " + c);
		System.out.println("s >>> : " + s);
		System.out.println("i >>> : " + i);
		System.out.println("f >>> : " + f);
		System.out.println("d >>> : " + d);
		System.out.println("bool >>> : " + bool);
		System.out.println("sVal1 >>> : " + sVal1);
		System.out.println("sVal2 >>> : " + sVal2);

	}//end of main �Լ�

}//end of Data_7 Ŭ����