package a.b.c.ch2;

public class Data_4{

	// ������� 	
	// Ŭ���� ���� : ��������� static Ű���带 ������ ����
	//	static Ű���� ����Ǿ� ������ �ڿ� ���� ������ �޸𸮿� ����Ʈ ������ �ʱ�ȭ
	//	Ŭ���� ������ �����ڸ� �̿����� ����
	//	Ŭ���� ���� ����� Ŭ�����̸�.�����̸�
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
	}//end of Data_4()������

	public static void main(String[] args){
	
	//System.out.println("b>>>:"+b);
	//���� ���� : b�� �޸𸮿� �ε����� �ʾұ� ����

	/* b�� �޸𸮿� �ε� ��Ű�� ���
	1. new ������ �̿��ϱ� ->���������� �̿�
		Data_4 d4 = new Data_4();
		System.out.println("d4.b >>> : "d4.b);

	2. static Ű���� ����ϱ�
		static byte b;
		System.out.println("Data_4.b>>>:" + Data_4.b);

	**static Ű���尡 ���� �ڿ��� ��� �� ���� ��Ű����.Ŭ�����̸�.����ƽ Ű���尡 ���� ������; ���� ���
	ex) Data_4 b; */
	
	
	//static Ű���带 �̿��� ���
	//(=Ŭ���� ������ �̿��� ���)

	System.out.println("Data_4.b>>>" + Data_4.b);
	System.out.println("Data_4.c>>>" + Data_4.c);
	System.out.println("Data_4.s>>>" + Data_4.s);
	System.out.println("Data_4.i>>>" + Data_4.i);
	System.out.println("Data_4.f>>>" + Data_4.f);
	System.out.println("Data_4.d>>>" + Data_4.d);
	System.out.println("Data_4.bo>>>" + Data_4.bo);
	System.out.println("Data_4.str>>>" + Data_4.str);

	// new Ű���带 �̿��� ���
	/*
	Data_4 d4 = new Data_4();

	System.out.println("d4.b >>> : "+d4.b);
	System.out.println("d4.c >>> : "+d4.c);
	System.out.println("d4.s >>> : "+d4.s);
	System.out.println("d4.i >>> : "+d4.i);
	System.out.println("d4.f >>> : "+d4.f);
	System.out.println("d4.d >>> : "+d4.d);
	System.out.println("d4.bo >>> : "+d4.bo);
	System.out.println("d4.str >>> : "+d4.str);
	*/
	}//end of main �Լ�

} // end of Data_4 Ŭ����