package a.b.c.ch1;

public class Ex_Const_2 {

	// �Լ� a() : �������� ���� �Լ� 
	public void a(){
		System.out.println("Ex_Const_2 :: void a() �Լ�");
	}

	// �Լ� b() : �������� �ִ� �Լ� : �������� String : ���ڿ� 
	public String b(){
		return "Ex_Const_2 :: String b() �Լ�";
	}

	// main �Լ� : �ܼ� ���ø����̼��� ������ 
	public static void main(String args[]){

		Ex_Const_2 ex_c2 = new Ex_Const_2();				
		System.out.println("Ex_Const_2() ex_c2 �� �ּҰ� >>> : " + ex_c2);

		// System.out.println(ex_c2.a());
		/*
		Ex_Const_2.java:25: error: 'void' type not allowed here
                System.out.println(ex_c2.a());
                                          ^
		1 error
		*/

		ex_c2.a();

		System.out.println(ex_c2.b());
	
		String str = ex_c2.b();
		System.out.println("str >>> : " + str);

	} // end of main �Լ� 
} // end of Ex_5 Ŭ���� 