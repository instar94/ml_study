package a.b.c.ch1;

public class Ex_Const_1{
	
	//������� ����
	String name;
	int age;

	//������ : �Ű� ���� ���� ������

	public Ex_Const_1(){
		System.out.println("Ex_Const_1() ������ >>>>>");
	}

	// ������ : �Ű����� 1�� (Strint name)

	public Ex_Const_1(String name){
		System.out.println("Ex_Const_1(String name ������)");
		System.out.println("String name >>>"+name);
	}

	// ������ : �Ű����� 1�� (int age)
	
	public Ex_Const_1(int age){
		System.out.println("Ex_Const_1(int_age ������)");
		System.out.println("int age >>>"+age);

	}

	// ������ : �Ű����� 2�� (String name, int age)
	// ù��° �Ű����� : String name
	// �ι�° �Ű����� : int age

	public Ex_Const_1(String name, int age){
		System.out.println("Ex_Const_1(String name,int age) ������");
		System.out.println("String name >>>"+name);
		System.out.println("int age >>>"+age);
	}

	// ������ : �Ű����� 2�� (int age. String name)
	// ù��° �Ű����� : int age
	// �ι�° �Ű����� : String name

	public Ex_Const_1(int age, String name){
		System.out.println("Ex_Const_1(int age,String name) ������");
		System.out.println("int age >>>" +age);
		System.out.println("String name >>>" +name);
	}

	

	//main �Լ� ����

	public static void main (String [] args){

		//�Ű������� �ƱԸ�Ʈ�� ������ Ÿ�԰� ������ ������ �ȴ�.
		//�������� �޶� ������
		// ������ �����ε�
		
		// �ƱԸ�Ʈ�� ���� ������ Ex_Const_1 ()ȣ��
		Ex_Const_1 ex_c_1 = new Ex_Const_1();
		System.out.println("ex_c_1 �ּҰ�>>>> : "+ex_c_1);

		//�ƱԸ�Ʈ�� 1���ִ� ������ Ex_Const_1("�赿��")ȣ��
		// �̶� "�赿��"�� ���ڿ� ������ Ÿ��
		Ex_Const_1 ex_c_2 = new Ex_Const_1("�赿��");
		System.out.println("ex_c_2 �ּҰ�>>>>"+ex_c_2);
		


	
		//�ƱԸ�Ʈ�� 1���ִ� ������ Ex_Const_1(28)ȣ��
		// �̶� 28�� int�� ������
		Ex_Const_1 ex_c_3 = new Ex_Const_1(28);
		System.out.println("ex_c_3 �ּҰ�>>>>"+ex_c_3);


		// �ƱԸ�Ʈ�� 2�� �ִ� ������ Ex_Const_1("�赿��",28) ȣ��
		// �̶� ù��°�� String ������ , �ι�°�� int�� ������
		Ex_Const_1 ex_c_4 = new Ex_Const_1("�赿��",28);
		System.out.println("ex_c_4 �ּҰ� >>>>"+ex_c_4);
	
		//�ƱԸ�Ʈ�� 2�� �ִ� ������ Ex_Const_1(28, "�赿��) ȣ��
		// �̶� ù��°�� int�� , �ι�°�� String �� ������
		Ex_Const_1 ex_c_5 = new Ex_Const_1(28,"�赿��");
		System.out.println("ex_c_5 �ּҰ� >>>> : "+ex_c_5);

	}//end of main �Լ�

}//end of Ex_Const_1

/*
1. Ŭ������ ������ �Լ��� �����Ǿ� �ִ�.
2. Ŭ������ Ŭ���� Ű���� �ĺ��� �̸� �극�̽� ������ �����Ǿ��ִ�.
3. main () �Լ��� �ܼ� ���ø����̼��� �����̴�.
4. New Ű����� �����ڸ� ã�´�.
*/