package a.b.c.ch2;

public class Data_9 {

	// void : ������ ���� �Լ� 
	// �Ϲ� �Լ� : ���� ���� �̿� : new Ű���� : Ŭ�������� �������� ���� = new �������̸�();
	// ��������.�Լ��̸�();
	// �Լ��� �Ű����� 2��
	// ù��° �Ű����� ��Ʈ��, �ι�° �Ű����� ��Ʈ��
	// ȣ���� �� : ��������.�Լ��̸�(��Ʈ�� ������, ��Ʈ�� ������)
	public void aMethod(int x1, int y1){
		System.out.println("Data_9 Ŭ���� void aMethod() �Լ� ");
		
		int sum1 = x1 + y1;
		System.out.println("sum1 >>> : " + sum1);
	}

	// void : �������� ���� �Լ� 
	// static : Ŭ�����̸�.�Լ��̸�()
	// �Լ��� �Ű����� 2��
	// ù��° �Ű����� ��Ʈ��, �ι�° �Ű����� ��Ʈ��
	// ȣ���� �� : Ŭ�����̸�.�Լ��̸�(��Ʈ�� ������, ��Ʈ�� ������)
	public static void aaMethod(int x2, int y2){
		System.out.println("Data_9 Ŭ������ static void aaMethod() �Լ� ");
		
		int sum2 = x2 + y2;
		System.out.println("sum2 >>> : " + sum2);
	}

	// int�� �������� �ִ� �Լ� : �Լ��� ��� ���� ��Ʈ���̴�.
	// �Ϲ��Լ� : �������� �̿� : new Ű���� : Ŭ�����̸����� ������������ = new �������̸�();
	// ��������.�Լ��̸�();
	// �Լ��� �Ű����� 2��
	// ù��° �Ű����� ��Ʈ��, �ι�° �Ű����� ��Ʈ��
	// ȣ���� �� : ��������.�Լ��̸�(��Ʈ�� ������, ��Ʈ�� ������)
	// ������� ��Ʈ�� ������ �����ؼ� �ޱ�
	// int i = ��������.�Լ��̸�(��Ʈ�� ������, ��Ʈ�� ������);
	public int bMethod(int x3, int y3){
		System.out.println("Data_9 Ŭ���� int bMethod() �Լ� ");

		int sum3 = x3 + y3;
		System.out.println("bMethod() �Լ� sum3 >>> : " + sum3);

		return sum3;
	}

	// int�� �������� �ִ� �Լ� : �Լ��� ��� ���� ��Ʈ���̴�.
	// Ŭ�����Լ� : Ŭ�����̸�.�Լ��̸�()
	// �Լ��� �Ű����� 2��
	// ù��° �Ű����� ��Ʈ��, �ι�° �Ű����� ��Ʈ��
	// ȣ���� �� : Ŭ�����̸�.�Լ��̸�(��Ʈ�� ������, ��Ʈ�� ������)
	// ������� ��Ʈ�� ������ �����ؼ� �ޱ�
	// int i1 = Ŭ�����̸�.�Լ��̸�(��Ʈ�� ������, ��Ʈ�� ������)
	public static int bbMethod(int x4, int y4){
		System.out.println("Data_9 Ŭ������ static int bbMethod() �Լ� ");

		int sum4 = x4 + y4;
		System.out.println("bbMethod() �Լ� sum4 >>> : " + sum4);
		
		return sum4;
	}

	public static void main(java.lang.String[] args){

		// �������� ������Ÿ�� int �� �����ϰ� 
		// x = 1 �ʱ�ȭ 
		// y = 2 �ʱ�ȭ 
		int x = 1;
		int y = 2;

		// static �Լ� ����ϱ� 
		// Ŭ�����̸�.�Լ��̸�
		Data_9.aaMethod(x, y);

		int i = Data_9.bbMethod(x, y);
		System.out.println("i >>> : " + i);

		// static ���� �Լ� : �������� �̿��ϱ� : �ν��Ͻ� �ؼ� ����ϱ� : new ������ ����ϱ� 
		// ��������.�Լ��̸�
		Data_9 d9 = new Data_9();
		d9.aMethod(x, y);
		int i1 = d9.bMethod(x, y);
		System.out.println("i1 >>> : " + i1);

	} // end of main �Լ� 	
} // end of Data_6


