package a.b.c.ch1;

public class EX_Const{

	//�������
	int i;
	char c;
	double d;
	boolean b;
	String s;

	//������
	public EX_Const(){
		System.out.println("EX_Const()������>>>");
	}

	//main() �Լ� ����
	public static void main(String[] args){


		EX_Const ex_c = new EX_Const();
		System.out.println("ex_c �ּҰ�>>>"+ex_c);
		System.out.println("ex_c.i �ּҰ�>>>"+ex_c.i);
		System.out.println("ex_c.c �ּҰ�>>>"+ex_c.c);
		System.out.println("ex_c.d �ּҰ�>>>"+ex_c.b);
		System.out.println("ex_c.b �ּҰ�>>>"+ex_c.d);
		System.out.println("ex_c.s �ּҰ�>>>"+ex_c.s);
		/*
		1. EX_Const�� ����� ���� Ŭ������ ����
		2. EX_Const�� �޸𸮿� �ε��ϱ� ���ؼ� ���������� ����
			-ex_c��� ���������� �����
		3. = : ���Կ�����
		4. new : Ű����(������) ���
				1) new ���� Ŭ�����̸�() �����ڸ� �ڹټҽ��ڵ忡�� ã��
					-EX_Const() �����ڸ� ã�� -> 11����

				2) Ŭ���� () �����ڸ� ã���� �����ڸ� �޸𸮿� �ε�
					-EX_Const()�� �ε��Ŵ

				3) �޸𸮿� �ε� �ϸ鼭 ��� �ʵ忡 �ִ� ����Ʈ ������ �ʱ�ȭ
					-EX_Const�� �ִ� �����鿡 ����Ʈ ���� 0�� ������

				4) ex_c.i => ex_c �ȿ� �ִ� i ������ ����Ѵٴ� �ǹ�
				��ġ API���� Java>lang>System>out>println �̾ (java.lang.)System.out.println �� ��ó��
				EX_Const > i ��� �ǹ̷� ex_c.i

					*/

		EX_Const ex_c_1 = new EX_Const();
		//���Ӱ� new�� ���������� ��������Ƿ� �ּҰ��� �޶���

		System.out.println("ex_c_1 �ּҰ�>>>"+ex_c_1);
		System.out.println("ex_c_1.i �ּҰ�>>>"+ex_c_1.i);
		System.out.println("ex_c_1.c �ּҰ�>>>"+ex_c_1.c);
		System.out.println("ex_c_1.d �ּҰ�>>>"+ex_c_1.b);
		System.out.println("ex_c_1.b �ּҰ�>>>"+ex_c_1.d);
		System.out.println("ex_c_1.s �ּҰ�>>>"+ex_c_1.s);
		 
		
	}//end of main �Լ�

} //end of EX_Const Ŭ����

/*
�⺻ ������ (default constructer)

- �����ڸ� �������� �ʰ� Ŭ���� �̸�() �Ű����� ���� �����ڸ� ��û�ϸ�,
  java���� �⺻ �����ڸ� ����

- �⺻ �����ڰ� ��� �ʵ忡 �ִ� �������� ����Ʈ ������ �ʱ�ȭ ��Ŵ

-


*/