package a.b.c.ch1;

public class Ex_Const {

	// ��� ���� 
	int i;
	char c;
	double d;
	boolean b;
	String s;

	// ������
	/*
	public Ex_Const(){
		System.out.println("Ex_Const() ������ >>> : ");
	}
	*/

	public static void main(String[] args){
		/*
		1. Ex_Const ����� ���� Ŭ������ ����Ϸ��� ����
		2. Ex_Const Ŭ������ ����ϱ� ���� ������ ���� : �������� : reference variable 
		3. = : ���� ������ 
		4. new : new Ű����(������) : JVM�� new Ű���带 ����� ������ �Ѵ�. 
								   new Ű���� �ڿ����� 
			                       Ŭ�����̸�() �����ڸ� �ڹ� �ҽ��ڵ忡�� ã�´�.
								   (Ex_Const() �����ڸ� �ڹ� �ҽ��ڵ忡�� ã�´�.)
			                       Ŭ�����̸�() �����ڸ� ã���� �� �����ڸ� �޸𸮿� �ε��Ѵ�.
			                       �޸𸮿� �ε� �ϸ鼭 
								   ��� �ʵ忡�ִ� �������� ����Ʈ ������ �ʱ�ȭ �Ѵ�. 
		*/
		Ex_Const ex_c = new Ex_Const();
		System.out.println("ex_c �ּҰ� >>> : " + ex_c);
		System.out.println("ex_c.i >>> : " + ex_c.i);
		System.out.println("ex_c.c >>> : " + ex_c.c);
		System.out.println("ex_c.d >>> : " + ex_c.d);
		System.out.println("ex_c.b >>> : " + ex_c.b);
		System.out.println("ex_c.s >>> : " + ex_c.s);

		Ex_Const ex_c_1 = new Ex_Const();
		System.out.println("ex_c_1 �ּҰ� >>> : " + ex_c_1);
		System.out.println("ex_c_1.i >>> : " + ex_c_1.i);
		System.out.println("ex_c_1.c >>> : " + ex_c_1.c);
		System.out.println("ex_c_1.d >>> : " + ex_c_1.d);
		System.out.println("ex_c_1.b >>> : " + ex_c_1.b);
		System.out.println("ex_c_1.s >>> : " + ex_c_1.s);

	} // end of main �Լ� 

} // end of Ex_Const Ŭ���� 

/*
##############################################
public Ex_Const(){
	System.out.println("Ex_Const() ������ >>> : ");
}

C:\00.KOSMO93\10.JExam\ch1>javap a.b.c.ch1.Ex_Const
Compiled from "Ex_Const.java"
public class a.b.c.ch1.Ex_Const {
  int i;
  char c;
  double d;
  boolean b;
  java.lang.String s;
  public a.b.c.ch1.Ex_Const();
  public static void main(java.lang.String[]);
}

##############################################
// public Ex_Const(){
//	System.out.println("Ex_Const() ������ >>> : ");
// }

C:\00.KOSMO93\10.JExam\ch1>javap a.b.c.ch1.Ex_Const
Compiled from "Ex_Const.java"
public class a.b.c.ch1.Ex_Const {
  int i;
  char c;
  double d;
  boolean b;
  java.lang.String s;
  public a.b.c.ch1.Ex_Const();
  public static void main(java.lang.String[]);
}

�ҽ��ڵ� �� 
�����ڸ� ������� �ʰ� (�ҽ��ڵ带 �ۼ����� ���� ���¿���)
Ŭ�����̸�() : �Ű������� ���� �����ڸ� ��û�ϸ�
Ex_Const ex_c = new Ex_Const();
JVA �� �⺻ ������ : default Constructor �� 
����� �ش�. 
�� �⺻ �����ڰ� ��� �ʵ忡 �ִ� ��������
�� ������  default value �� �ʱ�ȭ �Ѵ�. 
*/