package a.b.c.ch2;

public class Data_8{
	//Data_8�� �ڿ� �� : 4�� (main �Լ� ����)
	//�Լ��� �θ��� ���� ȣ���ϴ� / invoke

	// void �Լ� = ���� �� X / �Ϲ��Լ� - static (X) (=new �ʿ�O)
	// ���� : 1)�������� ��� Ŭ�����̸� �������� =new ������();
	// ex) Data_8 d8 = new Data_8();
	// 2)��������.�Լ��̸�();
	// ex) d8.aMethod();
	public void aMethod(){
		System.out.println("Data_8 Ŭ���� void aMethod() �Լ�");
	}//end of aMethod �Լ�


	// void �Լ� = ���� �� X/ static (O) (new �ʿ�X)
	// ���� : Ŭ�����̸�.�Լ��̸�;
	// ex) Data_8.aaMethod();
	public static void aaMethod(){
		System.out.println("Data_8 Ŭ���� static void aaMethod()�Լ�");
	}//end of aaMethod �Լ�
	

	// ���ϰ� �ִ� �Լ� / �Ϲ��Լ� - static(X) (new �ʿ� O)
	// �������� ��� + ������ �޾ƻ��
	// �������� ��� : ex) Data_8 d8 = new Data_8();
	// ���ϰ� �ޱ� : ex) int i= d8.bMethod();
	public int bMethod(){
		System.out.println("Data_8 Ŭ���� static void bMethod()�Լ�");
	
		return 1;

	}//end of bMethod �Լ�
	
	//���ϰ� �ִ� �Լ� / static(o) (new �ʿ� x)
	public static int bbMethod(){
		System.out.println("Data_8 Ŭ���� static void bbMethod()�Լ�");

		return 1;
	}//end of bbMethod �Լ�

	//main �Լ� ����
	public static void main(String[] args){

	//static �Ǿ� �ֱ⶧���� Ŭ������.�Լ������� ��밡��
	//void �̱� ������ ���ϰ�x
	Data_8.aaMethod();

	//static �Ǿ� �ֱ� ������ Ŭ������.�Լ������� ��밡��
	//���� ���� �ֱ� ������ ���� ���� �Լ��� ������
	int i=Data_8.bbMethod();
	System.out.println("i>>>:"+i);

	//aMethod�� bMethod���� static �Ǿ� �����ʱ⶧���� new�� �ν��Ͻ�
	Data_8 d8 =new Data_8();

	//aMethod�� return���� ���� ������ �� �Լ��� ȣ��(invoke)�ϱ� ���� newŰ���� ���
	//��������.�Լ���();
	d8.aMethod();
	
	//bMethod�� ���ϰ��� ������
	int i1=d8.bMethod();
	System.out.println("i1>>>>"+i1);

	}//end of main �Լ�
}//end of Data_8 Ŭ����