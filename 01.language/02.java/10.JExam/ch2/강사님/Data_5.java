package a.b.c.ch2;


public class Data_5 {
	
	/*
	�ʵ� : ������� 
	1. ���	
	2. Ŭ��������
	3. ��������
	4. �������
	*/

	// ����� �ڹټҽ��ڵ� �� ��ܿ� ��ġ�Ѵ�. 
	// ��� : constant : ������ �ʴ� �� : ���ϸ� �ʵǴ� �� 
	// ��� ������� : Ŭ�����̸�.��������� : Data_5.XXX_XXXX 
	public static final String XXX_XXXX = "�� ���� �����.";
	public static final int XXX_XX = 0; // ���� ��� 

	// �������
	int iVal;
	String sVal;

	// Ŭ��������
	static int siVal;
	static String ssVal;

	// �������� : ��������� ����������(access modifier) public ������ ����
	// ����� : �������� �̿��ϱ� 
	public int giVal;
	public String gsVal;


	public static void main(java.lang.String[] args){

		System.out.println("���ڻ�� >>> : " + Data_5.XXX_XXXX);
		System.out.println("���ڻ�� >>> : " + Data_5.XXX_XX);

		Data_5 d5 = new Data_5();
		System.out.println("giVal >>> : " + d5.giVal);
		System.out.println("gsVal >>> : " + d5.gsVal);

	} // end of main �Լ� 	
} // end of Data_4


