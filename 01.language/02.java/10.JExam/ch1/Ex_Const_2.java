package a.b.c.ch1;

public class Ex_Const_2{

	//a() �Լ� : ������ ���� -> void ��� return ����
	public void a(){
		System.out.println("Ex_Const_2 :: void a() �Լ�");
	}//end of a()�Լ�

	//b() �Լ� : ������ �ֹ� -> void ��� return ����
	// return�� String (���ڿ�)�� �� ����
	public String b(){
		return "Ex_Const_2:: String b() �Լ�";
	}//end of b()�Լ�

	//main �Լ� ���� - �ܼ� ���ø����̼� ����
	public static void main(String [] args){

	
	Ex_Const_2 ex_c2 = new Ex_Const_2();
	System.out.println("Ex_Const_2() ex_c2�� �ּҰ�>>>>"+ex_c2);

	//System.out.println(ex_c2.a()); 
	//���� �߻�
	// ���� : System.out.println ������ ���� ���� ���� �Լ�(void �Լ�)�� ��� �� �� ����
	// ex_c2.a()�� void�� �� �Լ��� ������ �߻�

	ex_c2.a();
	//println�� �ȵǹǷ� �ܼ�â�� �ԷµǴ� ���� ����

	System.out.println(ex_c2.b());
	//b()�� ������ �ִ� �Լ��̱� ������ println�� ��� ����
	//�׷��� ���� �����Ƿ� �ܼ�â�� ǥ�õǴ� ���� ����

	String str = ex_c2.b();
	//str �̶�� ������ �Ű����� ex_c2.b()�� ����

	System.out.println("str>>>>:"+str);
	//str = ex_c2.b()�Լ� = ���ڿ� "Ex_Const_2:: String b() �Լ�" ǥ��

	}//end of main �Լ�

}//end of Ex_Const_2 Ŭ����

/*�ܼ� ���
Ex_Const_2() ex_c2�� �ּҰ�>>>>a.b.c.ch1.Ex_Const_2@15db9742
Ex_Const_2 :: void a() �Լ�
Ex_Const_2:: String b() �Լ�
str>>>>:Ex_Const_2:: String b() �Լ�
*/
