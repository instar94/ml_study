package a.b.c.ch2;

public class Data_8 {

	// void �Լ�, �Ϲ��Լ�
	// ���� : �������� ����ϱ� : Ŭ�����̸� �������� = new �������̸�();
	//        ��������.�Լ��̸�();
	// Data_8 d8 = new Data_8();
	// d8.aMethod();
	public void aMethod(){
		System.out.println("Data_8 Ŭ���� void aMethod() �Լ� ");
	}

	// void �Լ�, static  �Լ� 
	// ���� : Ŭ�����̸�.�Լ��̸�();
	// Data_8.aaMethod();
	public static void aaMethod(){
		System.out.println("Data_8 Ŭ������ static void aaMethod() �Լ� ");
	}

	// �������� �ִ� �Լ�, �Ϲ� �Լ�
	// �������� ����ϱ�, �������� �޾Ƽ� ����ϱ� 
	// Data_8 d8 = new Data_8();
	// int i = d8.bMethod();
	public int bMethod(){
		System.out.println("Data_8 Ŭ���� int bMethod() �Լ� ");
		return 1;
	}

	// �������� �ִ� �Լ�, static �Լ� 
	// Ŭ�����̸�.�Լ��̸�(); ������ �ޱ�
	// int i = Data_8.bbMethod();
	public static int bbMethod(){
		System.out.println("Data_8 Ŭ������ static int bbMethod() �Լ� ");
		return 1;
	}

	public static void main(java.lang.String[] args){

		// static �Լ� ����ϱ� 
		// Ŭ�����̸�.�Լ��̸�
		Data_8.aaMethod();

		int i = Data_8.bbMethod();
		System.out.println("i >>> : " + i);

		// static ���� �Լ� : �������� �̿��ϱ� : �ν��Ͻ� �ؼ� ����ϱ� : new ������ ����ϱ� 
		// ��������.�Լ��̸�
		Data_8 d8 = new Data_8();
		d8.aMethod();
		int i1 = d8.bMethod();
		System.out.println("i1 >>> : " + i1);

	} // end of main �Լ� 	
} // end of Data_6


