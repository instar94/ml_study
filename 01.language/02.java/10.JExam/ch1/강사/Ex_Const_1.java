package a.b.c.ch1;

public class Ex_Const_1 {

	// ��� ���� 
	String name;
	int age;

	// ������	: �Ű����� ���� ������ 
	public Ex_Const_1(){
		System.out.println("Ex_Const_1() ������ >>> : ");
	}
	// ������ : �Ű����� String name �Ѱ� �ִ� ������ 
	public Ex_Const_1(String name){
		System.out.println("Ex_Const_1(String name) ������ >>> : ");
		System.out.println("String name >>> : " + name);
	}
	// ������ : �Ű����� int age �Ѱ� �ִ� ������ 
	public Ex_Const_1(int age){
		System.out.println("Ex_Const_1(int age) ������ >>> : ");
		System.out.println("int age >>> : " + age);
	}
	// ������ : �Ű����� ù��° String name, �ι�° int age �ΰ� �ִ� ������ 
	public Ex_Const_1(String name, int age){
		System.out.println("Ex_Const_1(String name, int agee) ������ >>> : ");
		System.out.print("String name >>> : " + name);
		System.out.println(", int age >>> : " + age);
	}

	// ������ : �Ű����� ù��° int age, �ι�° String name �ΰ� �ִ� ������ 
	public Ex_Const_1(int age, String name){
		System.out.println("Ex_Const_1(int age, String name) ������ >>> : ");
		System.out.print("int age >>> : " + age);
		System.out.println(", String name >>> : " + name);
	}

	public static void main(String[] args){
		
		// �ƱԸ�Ʈ�� ���� ������ Ex_Const_1() ȣ�� 
		Ex_Const_1 ex_c_1 = new Ex_Const_1();
		System.out.println("ex_c_1 �ּҰ� >>> : " + ex_c_1);

		// �ƱԸ�Ʈ�� �Ѱ� �ε� ������ Ÿ���� String ���ڿ� Ex_Const_1("������")  ȣ��
		Ex_Const_1 ex_c_2 = new Ex_Const_1("������");
		System.out.println("ex_c_2 �ּҰ� >>> : " + ex_c_2);

		// �ƱԸ�Ʈ�� �Ѱ� �ε� ������ Ÿ���� int ������ Ex_Const_1(59) ȣ��
		Ex_Const_1 ex_c_3 = new Ex_Const_1(59);
		System.out.println("ex_c_3 �ּҰ� >>> : " + ex_c_3);

		// �ƱԸ�Ʈ�� �ΰ� �ε� ù��° ������ Ÿ���� String, �ι�° ������ Ÿ���� int Ex_Const_1("������", 59)  ȣ�� 
		Ex_Const_1 ex_c_4 = new Ex_Const_1("������", 59);
		System.out.println("ex_c_4 �ּҰ� >>> : " + ex_c_4);

		// �ƱԸ�Ʈ�� �ΰ� �ε� ù��° ������ Ÿ���� int, �ι�° ������ Ÿ���� String Ex_Const_1(59, "������")  ȣ�� 
		Ex_Const_1 ex_c_5 = new Ex_Const_1(59, "������");
		System.out.println("ex_c_5 �ּҰ� >>> : " + ex_c_5);

	} // end of main �Լ� 

} // end of Ex_Const_1 Ŭ���� 

