package a.b.c.ch2;

public class Data_5{

	/* �ʵ�(=�������)
	1. ���
	2. Ŭ��������
	3. ��������
	4. �������
	*/

	//���(= constant) : ������ �ʰ�, �ȵǴ� ��
	//����� �ڹ� �ҽ��ڵ��� �� ��ܿ� ��ġ
	//��� ����� : Ŭ�����̸�. ��� ������
	//ex)Data_5.cStr

	public static final String cStr = "���� ���� ���";
	public static final int cInt =0;

	
	//�������
	int iVal;
	String sVal;

	//Ŭ�������� : ��������� static�� ���� ����
	//Ŭ�������� ����� : Ŭ�����̸�. Ŭ����������
	//ex) Data_5.siVal
	
	static int siVal;
	static String ssVal;

	//�������� : � ��Ű���������� ���� �� �ִ� ����
	//����ϱ� ���ؼ��� new�� ���� �ν��Ͻ��ؾ��� (=static�� ����)
	//��������.������
	//ex)d5.giVal

	public int giVal;
	public String gsVal;

	public static void main(String [] args){
	
	System.out.println("���ڻ��>>> :"+Data_5.cStr);
	System.out.println("���ڻ��>>>> :"+Data_5.cInt);

	Data_5 d5=new Data_5();
	System.out.println("giVal >>>> :" + d5.giVal);
	System.out.println("gsVal >>>> :" + d5.gsVal);

	}//end of main �Լ�
}//end of Data_5 Ŭ����