package a.b.c.ch2;


public class Data_4 {
	
	// �������
	// Ŭ�������� 	: ��������� static Ű���带 �����ϸ� Ŭ���� ����
	//            static Ű���尡 ����Ǿ� ������ �ڿ����� ������ �޸𸮿� �ʱ�ȭ �Ѵ�. :  ����Ʈ ������ 
	//            Ŭ���������� �����ڸ� �̿����� �ʴ´�. 
	static byte b;
	static char c;
	static short s;
	static int i;
	static float f;
	static double d;
	static boolean bo;
	static String str;

	public Data_4(){
		System.out.println("Data_4 Ŭ���� Data_4() ������");
	}

	public static void main(java.lang.String[] args){

		// System.out.println("b >>> : " + b);
		/*
			static Ű���带 ���� jvm �� main �Լ��� �޸� �ø� : �޸𸮿� �ö� �ִ� ���� �Լ����� :: static context
			������� byte b�� ȣ���ϸ� :: non-static variable b 
			byte b�� �޸� ���ٰ� ������ �߻��Ѵ�.

			byte b �� �޸� �ø��� ���
			1. new ������ ����ϱ�
				Data_4 d4 = new Data_4();
				System.out.println("d4.b >>> : " + d4.b);
			3. static Ű���� ����ϱ� 
				static byte b;
				System.out.println("Data_4.b >>> : " + Data_4.b);

				static Ű���尡 ���� �ڿ��� ����� ���� 
				��Ű����.Ŭ�����̸�.����ƽŰ�������������;
				Data_4.b;
		*/
		/*
			C:\00.KOSMO93\10.JExam\ch2>javac -d . Data_4.java
			Data_4.java:22: error: non-static variable b cannot be referenced from a static context
					System.out.println("b >>> : " + b);
													^
			1 error
		*/

		System.out.println("Data_4.b >>> : " + Data_4.b);
		System.out.println("Data_4.c >>> : " + Data_4.c);
		System.out.println("Data_4.s >>> : " + Data_4.s);
		System.out.println("Data_4.i >>> : " + Data_4.i);
		System.out.println("Data_4.f >>> : " + Data_4.f);
		System.out.println("Data_4.d >>> : " + Data_4.d);
		System.out.println("Data_4.bo >>> : " + Data_4.bo);
		System.out.println("Data_4.str >>> : " + Data_4.str);

	} // end of main �Լ� 	
} // end of Data_4


