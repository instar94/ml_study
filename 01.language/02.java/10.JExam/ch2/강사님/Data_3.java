package a.b.c.ch2;


public class Data_3 {
	
	// ������� 
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;

	public Data_3(){
		System.out.println("Data_3 Ŭ���� Data_3() ������");
	}

	public static void main(java.lang.String[] args){

		DefaultValue dv = new DefaultValue();
		System.out.println("DefaultValue()�� dv �ּҰ� " + dv);
		System.out.println("byte ����Ʈ ��	 :: dv.b >>>     : " + dv.b);
		System.out.println("char ����Ʈ ��	 :: dv.c >>>     : " + dv.c);
		System.out.println("short ����Ʈ �� :: dv.s >>>    : " + dv.s);
		System.out.println("int ����Ʈ ��	:: dv.i >>>      : " + dv.i);
		System.out.println("float ����Ʈ �� :: dv.f >>>    : " + dv.f);
		System.out.println("double ����Ʈ �� :: dv.d >>>	 : " + dv.d);
		System.out.println("boolean ����Ʈ �� :: dv.bo >>> : " + dv.bo);
		System.out.println("String ����Ʈ �� :: dv.str >>> : " + dv.str);

		Data_3 d3 = new Data_3();
		System.out.println("Data_3()�� d3 �ּҰ� " + d3);
		System.out.println("byte ����Ʈ ��	 :: d3.b >>>     : " + d3.b);
		System.out.println("char ����Ʈ ��	 :: d3.c >>>     : " + d3.c);
		System.out.println("short ����Ʈ �� :: d3.s >>>    : " + d3.s);
		System.out.println("int ����Ʈ ��	:: d3.i >>>      : " + d3.i);
		System.out.println("float ����Ʈ �� :: d3.f >>>    : " + d3.f);
		System.out.println("double ����Ʈ �� :: d3.d >>>	 : " + d3.d);
		System.out.println("boolean ����Ʈ �� :: d3.bo >>> : " + d3.bo);
		System.out.println("String ����Ʈ �� :: d3.str >>> : " + d3.str);


	} // end of main �Լ� 
	
} // end of Data_2

class DefaultValue
{
	// ������� 
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;
	
	// �Ű����� ���� �⺻������ ���� 
	public DefaultValue(){
		System.out.println("DefaultValue Ŭ���� DefaultValue() ������");
	}

}
